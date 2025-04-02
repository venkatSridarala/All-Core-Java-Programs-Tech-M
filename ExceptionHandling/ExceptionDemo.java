package ExceptionHandling;

import java.util.Scanner;

public class ExceptionDemo {

		public static void negativeNum(int a){
			if(a<0) {
				throw new ArithmeticException("Entered Number is Negative");
			}
			else {
				System.out.println("you are Entered +ve Number.");
			}
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number:");
		int i=sc.nextInt();
		try {
		negativeNum(i);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
// output
// Enter A Number:
// -67
// java.lang.ArithmeticException: Entered Number is Negative
// 	at ArraysPractice/ExceptionHandling.ExceptionDemo.negativeNum(ExceptionDemo.java:9)
// 	at ArraysPractice/ExceptionHandling.ExceptionDemo.main(ExceptionDemo.java:23)
