package Arrays;
import java.util.*;
public class TwoDArray {
	 public void Uppertri() {
		 Random r=new Random();
		 int mat[][]=new int[3][3];
		 int i;
		 int j;
		 for(i=0;i<mat.length;i++) 
		 {
			 for(j=0;j<mat.length;j++) 
			 {
				 mat[i][j]=r.nextInt(20);
			 }
			 
		 }
		 for(i=0;i<mat.length;i++) 
		 {
			 for(j=0;j<mat.length;j++) 
			 {
				 if(i>j) {
					 System.out.print("0"+" ");
				 }
				 else {
					 System.out.print(mat[i][j]+" ");
				 }
			 }
			System.out.println();		
		 }	 
	 }
//	 Output:
//		 18 13 2 
//		 0 19 18 
//		 0 0 12 
	 public void Lowertri() {
		 Random r=new Random();
		 int mat[][]=new int[3][3];
		 int i;
		 int j;
		 for(i=0;i<mat.length;i++) 
		 {
			 for(j=0;j<mat.length;j++) 
			 {
				 mat[i][j]=r.nextInt(20);
			 }
			 
		 }
		 for(i=0;i<mat.length;i++) 
		 {
			 for(j=0;j<mat.length;j++) 
			 {
				 if(i<j) {
					 System.out.print("0"+" ");
				 }
				 else {
					 System.out.print(mat[i][j]+" ");
				 }
			 }
			System.out.println();		
		 }	 
	 }
//	OutPut:
//		10 0 0 
//		3 1 0 
//		11 1 3 
	 public void Diagnaltri() {
		 Random r=new Random();
		 int mat[][]=new int[3][3];
		 int sum=0;
		 for(int i=0;i<mat.length;i++) 
		 {
			 for(int j=0;j<mat.length;j++) 
			 {
				 mat[i][j]=r.nextInt(20);
			 }
		 }
		 for(int i=0;i<mat.length;i++) 
		 {
			 for(int j=0;j<mat.length;j++) 
			 {
				System.out.print(mat[i][j]+" ");
			 }
			System.out.println();
		 }
		 for(int i=0;i<mat.length;i++) 
		 {
			 for(int j=0;j<mat.length;j++) 
			 {
				 if(i==j) {
					sum=sum+ mat[i][j];
				 }
			 }	
		 }
		 System.out.println("The diagnal sum is:"+sum);
	 }
//	Output:
//		18 16 11 
//		3 13 10 
//		11 7 6 
//		The diagnal sum is:37
	 public void rowsum() {
		 Random r=new Random();
		 int mat[][]=new int[3][3];
		 for(int i=0;i<mat.length;i++) 
		 {
			 for(int j=0;j<mat.length;j++) 
			 {
				 mat[i][j]=r.nextInt(20);
			 }
		 }
		 for(int i=0;i<mat.length;i++) 
		 {
			 for(int j=0;j<mat.length;j++) 
			 {
				System.out.print(mat[i][j]+" ");
			 }
			System.out.println();
		 }
		 System.out.println("The Row Sum Is:");
		 for(int i=0;i<mat.length;i++) 
		 {	 int sum=0;
			 for(int j=0;j<mat.length;j++) 
			 {
					sum=sum+ mat[i][j];
			 }	
			 System.out.println(sum);
		 }
		
	 }
//	Output:
//		17 1 17 
//		10 5 3 
//		5 12 12 
//		The Row Sum Is:
//		35
//		18
//		29
	 public void columnsum() {
		 Random r=new Random();
		 int mat[][]=new int[3][3];
		 for(int i=0;i<mat.length;i++) 
		 {
			 for(int j=0;j<mat.length;j++) 
			 {
				 mat[i][j]=r.nextInt(20);
			 }
		 }
		 for(int i=0;i<mat.length;i++) 
		 {
			 for(int j=0;j<mat.length;j++) 
			 {
				System.out.print(mat[i][j]+" ");
			 }
			System.out.println();
		 }
		 System.out.println("The Column Sum Is:");
		 for(int i=0;i<mat.length;i++) 
		 {	 int sum=0;
			 for(int j=0;j<mat.length;j++) 
			 {
					sum=sum+ mat[j][i];
			 }	
			 System.out.println(sum);
		 }	
	 }
//	 Output:
//		 8 3 16 
//		 9 3 2 
//		 1 16 12 
//		 The Column Sum Is:
//		 18
//		 22
//		 30
	 public void Addof2mat() {
		 Random r=new Random();
		 int a[][]=new int[3][3];
		 for(int i=0;i<a.length;i++) 
		 {
			 for(int j=0;j<a.length;j++) 
			 {
				 a[i][j]=r.nextInt(20);
			 }
		 } 
		 System.out.println("The Matrix A is:");
		 for(int i=0;i<a.length;i++) 
		 {
			 for(int j=0;j<a.length;j++) 
			 {
				System.out.print(a[i][j]+" ");
			 }
			System.out.println();
		 }
		 int b[][]=new int[3][3];
		 for(int i=0;i<b.length;i++) 
		 {
			 for(int j=0;j<b.length;j++) 
			 {
				 b[i][j]=r.nextInt(20);
			 }
		 } 
		 System.out.println("The Matrix B is:");
		 for(int i=0;i<b.length;i++) 
		 {
			 for(int j=0;j<b.length;j++) 
			 {
				System.out.print(b[i][j]+" ");
			 }
			System.out.println();
		 }
		 int c[][]=new int[3][3];
		 for(int i=0;i<c.length;i++) 
		 {
			 for(int j=0;j<c.length;j++) 
			 {
				c[i][j]=a[i][j]+b[i][j];
			 }
		 }
		 System.out.println("The Addition Of Two Matrix is:");
		 for(int i=0;i<c.length;i++) 
		 {
			 for(int j=0;j<c.length;j++) 
			 {
				System.out.print(c[i][j]+" ");
			 }
			System.out.println();
		 }
	 }
//	 Output:
//		 The Matrix A is:
//			 14 3 5 
//			 11 13 7 
//			 0 3 16 
//			 The Matrix B is:
//			 13 19 15 
//			 5 12 12 
//			 11 18 13 
//			 The Addition Of Two Matrix is:
//			 27 22 20 
//			 16 25 19 
//			 11 21 29 
	public static void main(String[] args) {
		TwoDArray D=new TwoDArray();
		D.Uppertri();
		D.Lowertri();
		D.Diagnaltri();
		D.rowsum();
		D.columnsum();
		D.Addof2mat();
	}

}
