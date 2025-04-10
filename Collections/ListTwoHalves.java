package Collections;

import java.util.ArrayList;
import java.util.List;

	public class ListTwoHalves {
	static void initialize(List<Integer> list,int n) {
	for(int i=1;i<=n;i++) {
	list.add(i);
	}
	}
	public static void main(String[] args) {
	List<Integer> list=new ArrayList<>();
	int n=6;
	initialize(list,n);
	int mid=n/2;
	List<Integer> first=list.subList(0, mid);
	List<Integer> second=list.subList(mid, n);
	System.out.println(first);
	System.out.println(second);
	}
	}
