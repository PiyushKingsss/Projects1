package text12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Array_Linked_Vector {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(120);
		list.add(100);
		list.add(150);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.contains(35));
		list.remove(2);
		System.out.println(list);
		System.out.println(list.get(1));
		
		LinkedList list1 = new LinkedList<>();
		list1.add(10);
		list1.add(120);
		list1.add(100);
		list1.add(150);
		System.out.println(list1);
		System.out.println(list1.size());
		System.out.println(list1.contains(35));
		list1.remove(2);
		System.out.println(list1);
		
		Vector vec = new Vector<>();
		vec.add(10);
		vec.add(120);
		vec.add(100);
		vec.add(150);
		System.out.println(vec);
		
		
		
		
	}

}
