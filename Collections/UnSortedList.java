package Collections;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class UnSortedList {
public static void main(String[] args) {
// TODO Auto-generated method stub
List<Integer> list=new ArrayList<>();
list.add(9);
list.add(3);
list.add(6);
list.add(1);
Collections.sort(list);
System.out.println("Min : "+list.get(0));
System.out.println("Max : "+list.get(list.size()-1));
}
}

