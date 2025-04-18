package jdbc;

import java.sql.*;
import java.util.*;

public class custo extends Rest {
    float discount = 0;

    void rateMeal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please rate your meal (1 to 5 stars): ");
        int stars = sc.nextInt();
        sc.nextLine();
        if (stars < 1 || stars > 5) {
            System.out.println("Invalid rating. Please enter between 1 and 5.");
            return;
        }
        System.out.print("Leave a short feedback comment (optional): ");
        String comment = sc.nextLine();
        try {
            PreparedStatement stmt = con.prepareStatement("INSERT INTO feedback VALUES (?, ?)");
            stmt.setInt(1, stars);
            stmt.setString(2, comment);
            stmt.executeUpdate();
            System.out.println("Thank you for your feedback!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void showOrder() {
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM orders");
            System.out.println("The Ordered Items Are:");
            while (rs.next()) {
                System.out.println(rs.getString("food_name") + " Quantity Is " + rs.getInt("quantity"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void displayOrder() {
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT o.food_name, o.quantity, m.price FROM orders o JOIN menu m ON o.food_name = m.name");
            System.out.println("The Ordered Items Are:");
            while (rs.next()) {
                String name = rs.getString("food_name");
                int qty = rs.getInt("quantity");
                int price = rs.getInt("price");
                System.out.println("Item Name: " + name + " ---> Quantity: " + qty + " * " + price + " = " + (qty * price));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    boolean addOrder(String food, int quantity) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many different items do you want to order? ");
        int count = sc.nextInt();
        sc.nextLine();

        boolean success = false;

        try {
            PreparedStatement checkStmt = con.prepareStatement("SELECT * FROM menu WHERE name = ?");
            PreparedStatement insertStmt = con.prepareStatement("INSERT INTO orders VALUES (?, ?)");

            for (int i = 0; i < count; i++) {
                System.out.print("Enter Food Name To Order: ");
                String name = sc.nextLine();
                System.out.print("Enter Quantity: ");
                int qty = sc.nextInt();
                sc.nextLine();

                checkStmt.setString(1, name);
                ResultSet rs = checkStmt.executeQuery();
                if (rs.next()) {
                    insertStmt.setString(1, name);
                    insertStmt.setInt(2, qty);
                    insertStmt.executeUpdate();
                    System.out.println("Added " + qty + " of " + name + " to order.");
                    success = true;
                } else {
                    System.out.println("Item \"" + name + "\" is not available in the menu.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return success;
    }

    void bill() {
        int total = 0;
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT o.quantity, m.price FROM orders o JOIN menu m ON o.food_name = m.name");
            while (rs.next()) {
                total += rs.getInt("quantity") * rs.getInt("price");
            }

            System.out.println("The Total Bill Is: " + total);
            System.out.println("Bill > ₹200? You Get 10% Discount!");
            if (total > 200) {
                discount = total - (total * 10 / 100);
                System.out.println("After Discount: ₹" + discount);
            } else {
                discount = total;
                System.out.println("No Discount Applied");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void applyCoupon() {
        String coupon = "SaveAmt";
        System.out.println("Enter Coupon Name To Get Discount:");
        Scanner sc = new Scanner(System.in);
        String AppCou = sc.nextLine();
        if (AppCou.equals(coupon)) {
            float dis = discount - (discount * 5 / 100);
            System.out.println("After Coupon Applied, Payable Amount: ₹" + dis);
        } else {
            System.out.println("Invalid Coupon!");
        }
    }
}
