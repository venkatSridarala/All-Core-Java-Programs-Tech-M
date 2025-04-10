package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class MaxMin {

public static void main(String[] args) { 
// TODO Auto-generated method stub 
List<Integer> list=new ArrayList<>(); 
list.add(4); 
list.add(3); 
list.add(1); 
list.add(7); 
Collections.sort(list); 
System.out.println("Min : "+list.get(0)); 
System.out.println("Max : "+list.get(list.size()-1)); 
} 
} 