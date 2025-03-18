package Arrays;
import java.util.*;
public class PalPrime {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number to find PalPrime:");
		int n = sc.nextInt();
		int temp=n;
		int sum=0;
		int rev=0;
		int count=0;
		while(n!=0) {
			rev=n%10;
			sum=sum*10+rev;
			n=n/10;
		}
		if(sum==temp) {
			System.out.println("It is a palindrome. "+sum);
		}
		else{
			System.out.println("It is not a palindrome");
		}
		for(int i=1;i<=temp;i++) {
			if(temp%i==0) {
				count++;
			}
		}
		
		if(count==2) {
			System.out.println("It is a Prime Number "+temp);
		}
		else {
			System.out.println("It is not a prime number "+temp);
		}
	  if(count==2 && sum==temp) {
		  System.out.println("It is a PalPrime.");
	  }
	  else {
		  System.out.println("It is not a PalPrime.");
	  }
	}

}
//Output:
//	Enter a number to find PalPrime:101
//	It is a palindrome. 101
//	It is a Prime Number 101
//	It is a PalPrime.
