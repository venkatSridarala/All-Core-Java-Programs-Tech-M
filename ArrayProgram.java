//Java Program To Print 3 largest elements in array
package Arrays;
import java.util.*;
public class ArrayProgram{
	public void arrayprogram(){
	// TODO Auto-generated method stub
		int arr[]= {23,12,55,46,28,79};
		Arrays.sort(arr);
		for(int i=0;i<=arr.length-1;i++) {
		System.out.println(arr[i]+" ");
		}
		System.out.println("First Largest Num is "+arr[arr.length-1]);
		System.out.println("First Largest Num is "+arr[arr.length-2]);
		System.out.println("First Largest Num is "+arr[arr.length-3]);
	}
//	Output:
//		12 
//		23 
//		28 
//		46 
//		55 
//		79 
//		First Largest Num is 79
//		First Largest Num is 55
//		First Largest Num is 46
	public void b() {
		int arr[]= {1,2,3,4,5,6,};
		int arr1[]= {6,5,4,3,2,56};
		if(arr[0]==arr1[arr1.length-1]) {
			System.out.println("Both Are Equal.");
		}
		else if(arr[0]>arr1[arr1.length-1]) {
			System.out.println("Arr is greater than arr1");
		}
		else {
			System.out.println("Arr is less than arr1");
		}
	}
//	Output:
//		Arr is less than arr1
	public void duparr() {
		int dup[]= {1,2,3,4,2,5,1};
		System.out.println("The Duplicate numbers are:");
		int j;
		for(int i=0;i<dup.length;i++) {
			for(j=i+1;j<dup.length;j++) {
				if(dup[i]==dup[j]) {
					System.out.println(dup[i]);
					break;
				}				
			}
		}
	}
//	Output:
//		The Duplicate numbers are:
//			1
//			2
	public void unique() {
		int dup[]= {1,2,3,4,2,5,1};
		int j;
		System.out.println("The unique element are:");
		for(int i=0;i<dup.length;i++) {
			int count=0;
			for(j=0;j<dup.length;j++) {
				if(dup[i]==dup[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(dup[i]);
			}
		}
	}
//	Output:
//		The unique element are:
//			3
//			4
//			5
	public void leftshift() {
		int arr[]= {1,2,3,4,5};
		int first=arr[0];
		int i;
		System.out.println("The left shift elements are:");
		for(i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[i]=first;
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}
//	Output:
//		The left shift elements are:
//			2 3 4 5 1 
	public void rightshift() {
		int arr[]= {1,2,3,4,5};
		int last=arr[arr.length-1];
		int i;
		System.out.println("The right shift elements are:");
		for(i=arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[i]=last;
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
		public static void main(String[] args) {	
			ArrayProgram arr=new ArrayProgram();
			arr.arrayprogram();
			arr.b();
			arr.duparr();
			arr.unique();
			arr.leftshift();
			arr.rightshift();
			
	}
}
