package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class StringListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list = new ArrayList();
		list.add("john"); // 0
		list.add("john"); // 1
		list.add("jane"); // 2
		list.add("Mike"); // 3
		list.add("Pete"); // 4
		list.add("Mike"); // 5
		
		System.out.println(list.size());
		System.out.println(list);
		
		System.out.println(list.get(3));
		list.add(2,"Nick");
		System.out.println(list);

		/*
		*
		*/
		// 1. Classic for-loop / C for-loop / Traditional for-loop
			for (int i = 0; i < list.size(); i++) {
		//		System.out-println(list.get(i));
		}
		/*
		2. for-each loop - Enhanced for-loop
		*/
			for (String str : list) {
				System.out.println(str);
		}
		/*
		3. forEach() method - Using Lamda Expressions - Java
		18
		*/
		 list.forEach( str -> System.out.println(str));
		 
		 /*
		  * 		 * 4. Iterator

		 */
		 
		 ListIterator<String> ite = list.listIterator();
		 while (ite.hasNext()) {
		 String str = (String) ite.next();
		// System.out.pristln(str);
		

	}
	
	}

}
