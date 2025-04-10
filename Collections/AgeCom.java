package Collections;

import java.util.Comparator;

public  class AgeCom implements Comparator<Person>{

	@Override
	public int compare(Person s1, Person s2) {
		// TODO Auto-generated method stub
		if(s1.age==s2.age) {
			return 0;
		}
		else if(s1.age>s2.age) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
}
