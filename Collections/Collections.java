package Collections;

import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(11);
		a.add(12);
		a.add(21);
		a.add(516);
		a.add(161);
		a.add(19);
		a.add(76);
		a.add(3,90);
		System.out.println(a);
		
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(116);
		a1.add(10);
		a1.add(215);
		a1.add(51);
		a1.add(51);
		a1.add(11);
		a1.add(197);
		a1.add(0);
		a1.add(3,50);
		System.out.println(a1);
		a.addAll(a1);
		System.out.println(a);
		System.out.println(a.contains(50));
		System.out.println(a.indexOf(51));
		System.out.println(a.isEmpty());
		System.out.println(a.lastIndexOf(51));
		System.out.println(a.retainAll(a1));
		System.out.println(a.get(4));
	}

}
