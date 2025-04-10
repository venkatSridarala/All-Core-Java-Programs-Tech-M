package Collections;

import java.util.Comparator;

public class NameCom implements Comparator<Person>{

	@Override
	public int compare(Person s1, Person s2) {
		// TODO Auto-generated method stub
		return s1.name.compareTo(s2.name);
	}
	
}
