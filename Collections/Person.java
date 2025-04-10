package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections; 
public class Person {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> ls = new ArrayList<>();
		ls.add(new Person(20,"Mani"));
		ls.add(new Person(16,"Shiva"));
		Collections.sort(ls, new NameCom());
	}
}
