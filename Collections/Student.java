package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Students implements Comparable<Students>{
	int age;
	String name;
	public Students(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int compareTo(Students ob) {
		// TODO Auto-generated method stub
		if(age==ob.age) {
			return 0;
		}
		else if(age>ob.age) {
			return 1;
		}
		else {
			return -1;
		}	
	}

}
public class Student {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Students> ls=new ArrayList<Students>();
		Students st =new Students(15,"Mani");
		ls.add(st);
		Students s=new Students(10,"Giridhar");
		ls.add(s);
		Collections.sort(ls);;
		for(Students x:ls) {
			System.out.println(x.age+" "+x.name);
		}
	}
}
