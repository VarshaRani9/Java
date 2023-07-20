import java.util.*;

// null values are not allowed to Primitive Datatypes 

//*******************************************************************************
//if i am trying to add null element of datatype string then it is considering it
//but for integer it is not considering null
//bcz null is considered as String by default

public class List {
	public static void main(String[] args) {

		// List - Stores contiguously+duplicates allowed+any no. of null values
		// List : ArrayList , LinkedList , Stack , Vector

		// List<String> list = new ArrayList(); OR Collection<String> list = new
		// ArrayList();
		// List<String> list = new ArrayList(20); // default size is 10

		System.out.println("-------------- ArrayList -------------------");
		// It increases size by 50% of current size if element added exceeds its
		// capacity
		ArrayList<String> list = new ArrayList<String>();
		list.add("CE");
		list.add("IT");
		list.add(null);// Allows any number of Null values
		list.add("BCA");
		list.add("CSE");
		System.out.println(list);
		System.out.println(list);
		list.add(1, "ECE");
		System.out.println(list);
		System.out.println("Index 2 element : " + list.get(2));
		list.remove(2);
		System.out.println(list);
		list.add(2, "CSE");
		System.out.println(list.subList(2, 4));//print a sublist from list
		// list.remove();
		System.out.println(list);
		System.out.println("index of CSE" + list.indexOf("CSE"));
		System.out.println("Last index of CSE " + list.lastIndexOf("CSE"));
		System.out.println(list);
	        Collections.shuffle(list);//randomize order in lists
	        System.out.println(list);
	        Collections.reverse(list);//reverse the list
	        System.out.println(list);
	       
	        
	        //*********** sorting cant be done this way if there is null value********
	        //Collections.sort(list, Collections.reverseOrder());// sort in desc order
	        //Collections.sort(list, Comparator.reverseOrder());// sort in desc order
	        
	        System.out.println(list);// OR System.out.println(list.toString());
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		/*
		 * //only when there is no null values 
		 * Collections.sort(list);//sort in ascending order 
		 * System.out.println(list); 
		 * Collections.reverse(list);//sort in descending order 
		 * System.out.println(list);
		 */

		// sorting when null values are there
		Collections.sort(list, Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER));
		System.out.println(list);

		System.out.println("----------------- LinkedList-----------------");
		List<Integer> list1 = new LinkedList<Integer>();
		list1.add(1);
		list1.add(3);
		// list.add(null);//Allow any number of Null values
		list1.add(5);
		list1.add(7);
		System.out.println("Index 2 element : " + list1.get(2));
		System.out.println(list1);
		list1.add(1, 3);
		System.out.println(list1);
		System.out.println("Index 2 element : " + list1.get(2));
		list1.remove(2);
		System.out.println(list1);
		list1.add(2, 0);
		System.out.println(list1);
		System.out.println("index of 5 " + list1.indexOf(5));
		System.out.println("last index of 3 :" + list1.lastIndexOf(3));
		System.out.println(list1.subList(2, 4));//print a sublist from list
		 Collections.shuffle(list1);//randomize order in lists
        System.out.println(list1);
	        System.out.println(list1);
		Iterator<String> itr1 = list.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		// We can't sort elements of list by sort(), if it contains null values
		Collections.sort(list1);// sort in ascending order
		System.out.println(list1);
		// Collections.reverse(list1);//sort+reverse ->sort in descending order
		Collections.sort(list1, Comparator.reverseOrder());// sort in desc order
		System.out.println(list1);
		// sorting when null values are there
		Collections.sort(list, Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER));
		System.out.println(list);

		System.out.println("----------------- Vector-----------------");
		// It increases size by 100% of current size if element added exceeds its
		// capacity
		List<String> list3 = new Vector<String>();
		list3.add("ram");
		list3.add("shyam");
		list3.add(null);// Allow any no. of Null values
		list3.add("mohan");
		list3.add("raman");
		System.out.println(list3);
		list3.add(1, "seeta");
		System.out.println(list3);
		System.out.println("Index 2 element : " + list3.get(2));
	    list3.remove(2);
		System.out.println(list3);
		list3.add(2, "ram");
		System.out.println(list3);
		System.out.println("index of ram " + list3.indexOf("ram"));
		System.out.println("Last index of ram" + list3.lastIndexOf("ram"));
		System.out.println(list3.subList(2, 4));//print a sublist from list
		 Collections.shuffle(list3);//randomize order in lists
	        System.out.println(list3);
	        Collections.reverse(list3);
	        System.out.println(list3);
		Iterator<String> itr3 = list3.iterator();
		while (itr3.hasNext()) {
			System.out.println(itr3.next());
		}
		// sorting when null values are there
		Collections.sort(list, Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER));
		System.out.println(list);

		System.out.println("--------------------- Stack -------------------");
		Stack<String> list2 = new Stack<String>();
		list2.add("cat");
		list2.add("dog");
		list2.push("rabbit");// only when we instantiate stack and also call stack constructor
		((Stack<String>) list2).push("rat");// Req. when we instantiate uper class/interface during stack constructor
											// call
		list2.add("cow");
		list2.add(null);// Allow any no. of Null values
		list2.add("horse");
		System.out.println(list2);
		list2.add(1, "lion");
		System.out.println(list2);
		System.out.println("Index 2 element : " + list2.get(2));
	    list2.remove(2);
		System.out.println(list2);
		list2.add(2, "horse");
		System.out.println(list2);
		System.out.println("index of horse " + list2.indexOf("horse"));
		System.out.println("Last index of horse" + list2.lastIndexOf("horse"));
		list2.pop();
		System.out.println(list2.peek());
		System.out.println(list2.subList(2, 4));//print a sublist from list
		 Collections.shuffle(list2);//randomize order in lists
	        System.out.println(list2);
	        Collections.reverse(list2);
	        System.out.println(list2);
		Iterator<String> itr2 = list2.iterator();
		while (itr2.hasNext()) {
			System.out.print(" " + itr2.next());
		}
		// sorting when null values are there
		Collections.sort(list, Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER));
		System.out.println(list);

	}
}
