package Arrays;
import java.util.*;
public class Test {
		public void Q1() {
			Scanner sc =  new Scanner(System.in);
			int a[]= {2,43,66,92,3,5,13,123,432,44,78};
			int x=100;
			System.out.println("The greatest numbers are:");
			for(int i=0;i<a.length;i++) {
				if(a[i]>x) {
					System.out.println(a[i]);
				}
			}
			}
	    
		public void Q2() {
			int a[]= {1,2,3,4,2,7,8,8,3};
			System.out.println("The Duplicate numbers are:");
			int j;
			for(int i=0;i<a.length;i++) {
				for(j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						System.out.println(a[i]);
						break;
					}
				}
			}
		}
		
		public void Q3() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter words1:");
			String s1=sc.nextLine();
			System.out.println("Enter words2:");
			String s2=sc.nextLine();
			System.out.println("Enter words3:");
			String s3=sc.nextLine();
			
			String Reps1 = s1.replaceAll("[AEIOUaeiou]", "*");
			String Reps2 = s2.replaceAll("[BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz]", "@");
			String Reps3 = s3.toUpperCase();
			
			System.out.println("The OutPut Is:"+ Reps1+" "+Reps2+" "+Reps3);
		}
	
		public void Q4() {
			String s1="this is java";
			String s2="java";
			String ss1[]=s1.split(" ");
			for(int i=0;i<ss1.length;i++) {
				if(ss1[i].equals(s2)) {
					System.out.println("True.");
				}
				}
		}
	   public void Q5() {
		   String s1="ramu";
		   String s2="umar";
		   char ch1[]=s1.toCharArray();
		   char ch2[]=s2.toCharArray();
		   Arrays.sort(ch1);
		   Arrays.sort(ch2);
		   
		   System.out.println(Arrays.equals(ch1, ch2)?"Anagram":"Not Anagram");
	   }
	   public void Q6() {
			Scanner sc = new Scanner(System.in);
			char d='y';
			do {
			System.out.println("Enter First Number:");
			int a =sc.nextInt();
			System.out.println("Enter Second Number:");
			int b =sc.nextInt();
			System.out.println("Enter Your Choice:");
			char ch =sc.next().charAt(0);
			switch(ch) {
			case '+': System.out.println(a+b);
			break;
			case '-': System.out.println(a-b);
			break;
			case '*': System.out.println(a*b);
			break;
			case '/': System.out.println(a/b);
			break;
			}
			System.out.println("press y to continue and n to terminate:");
			d=sc.next().charAt(0);
			
			}while(d=='y'); {
				
			}
		}
	   
	   public void Q7() {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter a average marks:");
		   int avg=sc.nextInt();
		   if(avg>=80) {
			   System.out.println("A Grade");
		   }
		   else if(avg<80 && avg>=60) {
			   System.out.println("B Grade");
		   }
		   else if(avg>40 && avg<60) {
			   System.out.println("C Grade");
		   }
		   else {
			   System.out.println("D Grade");
		   }
		   }
	   
	   public void Q8() {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter Height:");
		   double h=sc.nextInt();
		   System.out.println("Enter Weight:");
		   double w=sc.nextInt();
		   if(h>=5.5 && w>55) {
			   System.out.println("This Person is eligible for physical Test.");
		   }
		   else {
			   System.out.println("Not Eligible.");
		   }
		   
		   }
	   
	   public void Q9() {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter a character:");
		   char ch=sc.nextLine().toLowerCase().charAt(0);	   
		   
		   if(Character.isLetter(ch)) {
			   if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				   System.out.println(ch+" is a Vowel Letter");
			   }
			   else {
				   System.out.println(ch+" is a Consonant");
			   }
		   }
	   }
	  public void Q10() {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter a number between 1 to 100:");
		  int n =sc.nextInt();
		  if(n>=1 && n<=100) {
			  if(n%2!=0) {
				  System.out.println("weird");
			  }
			  else {
				  if(n>=2 && n<=5) {
					  System.out.println("not weird");
				  }
				  else if(n>=6 && n<=20) {
					  System.out.println("wweird");
				  }
				  else if(n>20) {
					  System.out.println("not weird");
				  }
			  }
		  }
	  }
	public static void main(String[] args) {
		Test ts=new Test();
		//ts.Q1();
		//ts.Q2();
		//ts.Q3();
		//ts.Q4();
		//ts.Q5();
		//ts.Q6();
		//ts.Q7();
		//ts.Q8();
		//ts.Q9();
		ts.Q10();
	}

}
