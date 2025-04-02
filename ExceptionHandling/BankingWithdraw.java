package ExceptionHandling;

import java.util.Scanner;

public class BankingWithdraw{

	int balance=2000;
	 public void withdraw(int amt) throws InsufficientBalanceException{
		 if(amt>balance) {
			 throw new InsufficientBalanceException("insufficient Balance");
		 }
		 else {
			 System.out.println("Withdraw done..!");
			 balance=balance-amt;
			 System.out.println("Your remaining balance is:"+balance);
		 }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter withdraw amount:");
		int i=sc.nextInt();
		BankingWithdraw b=new BankingWithdraw();
		try {
			b.withdraw(i);
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
