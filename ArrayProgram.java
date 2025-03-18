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
		public static void main(String[] args) {	
			ArrayProgram arr=new ArrayProgram();
			arr.arrayprogram();
			arr.b();
		}
}
