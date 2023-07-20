import java.util.*;

public class Sets {

	public static void main(String[] args) {

		// Sets : Stores unique elements, At most 1 null value
		// Set : - HashSet , TreeSet , LinkedHashSet , SortedSet

		System.out.println("------------------------ Hashset ----------------------");
		// unique + unordered(as implemented from hash function),O(1)
		HashSet<Integer> s1 = new HashSet<Integer>();// OR Set<Integer> s1 = new HashSet<Integer>();
        s1.add(12);
		s1.add(24);
		s1.add(10);
		s1.add(12);// Will not be added as set has property of uniqueness
		System.out.println(s1.toString());//System.out.println(s1);//->both will print in same way
		for (int i : s1) {
			System.out.println("Hashset element :" + i);// Unordered
		}
		
		//Checking whether addition of element in set was successfull or not
		  System.out.println(s1.add(23));//True - will be added
		  System.out.println(s1.add(12));//False - will not be added 
		  s1.remove(10);//remove element from set 
		  System.out.println(s1.contains(12));// For checking whether set contains 12 or not 
		  System.out.println(s1.isEmpty());//For checking whether set is empty or not System.out.println(s1.size());//return size of set s1 
		  s1.clear();// It will clear whole set i.e, remove all element 
		  System.out.println(s1);// OR System.out.println(s1.toString());
	       
		  
		  
		System.out.println("-------------------- TreeSet -----------------------");
		// unique + ordered (ascending)(as implimented through BST),O(log n)
		TreeSet<Integer> s2 = new TreeSet<Integer>();// OR Set<Integer> s2 = new TreeSet<Integer>();
		System.out.println(s2.add(12));
		System.out.println(s2.add(34));
		System.out.println(s2.add(12));
		System.out.println(s2.add(24));
		//s2.add(null);//null pointer exception
		for (int i : s2) {
			System.out.println("TreeSet element :" + i);// ordered
		}
		/*
		 * //Checking whether addition of element in set was successfull or not
		 * System.out.println(s2.add(23));//True - will be added
		 * System.out.println(s2.add(12));//False - will not be added 
		 * s2.remove(10);//remove element from set 
		 * System.out.println(s2.contains(12));// For checking whether set contains 12 or not 
		 * System.out.println(s2.isEmpty());//For checking whether set is empty or not System.out.println(s1.size());//return size of set s1 
		 * s2.clear();// It will clear whole set i.e, remove all
		 * element System.out.println(s2);// Print elements of set
		 */

		System.out.println("----------------------- LinkedHashSet --------------------------");
		// Unique + ordered (a/c to addition of elements in LinkedHashSet)
		LinkedHashSet<Integer> s3 = new LinkedHashSet<Integer>();// OR Set<Integer> s3 = new LinkedHashSet<Integer>();
		System.out.println(s3.add(22));
		System.out.println(s3.add(14));
		System.out.println(s3.add(22));
		System.out.println(s3.add(34));
		for (int i : s3) {
			System.out.println("LinkedHashSet element :" + i);
		}
		/*
		 * //Checking whether addition of element in set was successful or not
		 * System.out.println(s3.add(23));//True - will be added
		 * System.out.println(s3.add(12));//False - will not be added 
		 * s3.remove(10);//To remove element from set 
		 * System.out.println(s3.contains(12));// For checking whether set contains 10 or not 
		 * System.out.println(s3.isEmpty());//For checking whether set is empty or not 
		 * System.out.println(s3.size());//return size of set s3 
		 * s3.clear();// It will clear whole set i.e, remove all
		 * element System.out.println(s3);// Print elements of set
		 */

		
		
		//********************* null values ************************
		System.out.println("Null values --------");
		Set<String> ss = new LinkedHashSet<String>();
		//null values can't be stored by primitives
		//we cant perform it on integer ??***********************************************?????????????
		
		ss.add(null);//Only one null value is allowed in sets
		ss.add(null);
		System.out.println(ss);

		
		
//for stack there is no such constructor so that we can add other collection to it during object creation,we can do it by addAll method
		List<Integer> l=new Stack<Integer>();
		l.addAll(s3);
	}
}
