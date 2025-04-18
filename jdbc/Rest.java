package jdbc;
import java.sql.*;
import java.util.Scanner;

public class Rest {
	
    Connection con;
    
    Rest() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDB", "root", "rootpassword");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    void showMenu() {
        System.out.println("The Food Items Are:");
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM menu");
            while (rs.next()) {
                System.out.println(rs.getString("name") + " Item Price Is " + rs.getInt("price"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    boolean addFoodItem(String fName, int price) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many food items do you want to add? ");
        int count = sc.nextInt();
        sc.nextLine();

        try {
            PreparedStatement checkStmt = con.prepareStatement("SELECT * FROM menu WHERE name = ?");
            PreparedStatement insertStmt = con.prepareStatement("INSERT INTO menu VALUES (?, ?)");

            for (int i = 0; i < count; i++) {
                System.out.print("Enter food item name: ");
                String name = sc.nextLine();
                System.out.print("Enter price: ");
                int itemPrice = sc.nextInt();
                sc.nextLine();

                checkStmt.setString(1, name);
                ResultSet rs = checkStmt.executeQuery();
                if (rs.next()) {
                    System.out.println("The Item \"" + name + "\" Is Already Present.");
                } else {
                    insertStmt.setString(1, name);
                    insertStmt.setInt(2, itemPrice);
                    insertStmt.executeUpdate();
                    System.out.println("Item \"" + name + "\" Added Successfully");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    void recommendDish(int budget) {
        System.out.println("Recommended Dishes Under Budget ₹" + budget + ":");
        boolean found = false;

        try {
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM menu WHERE price <= ?");
            stmt.setInt(1, budget);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString("name") + " - ₹" + rs.getInt("price"));
                found = true;
            }

            if (!found) {
                System.out.println("Sorry, no items available under ₹" + budget);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

