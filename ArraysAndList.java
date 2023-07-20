import java.util.Arrays;
import java.util.*;
public class ArraysAndList {

	public static void main(String[] args) {
        		
       int [] arr = {1,2,3,4,5,6,7,8,9};
       //binary search can be applied to sorted array only
       System.out.println("index of 7 : "+Arrays.binarySearch(arr, 7));//it will return index of 7
       
      Integer [] numbers= {34,56,12,32,45,54,98,76,87,56,92,19};
      System.out.println("arrays element before sorting");
      for(int i : numbers) {
    	  System.out.println(i);
      }
    
      Arrays.sort(numbers);// implemented by quick sort
      System.out.println("array element after sorting");
      for(int i : numbers) {
    	  System.out.println(i);
      }
      
      Arrays.fill(numbers, 8);
      System.out.println("Array elements after Arrays.fill()->");
      for(int i : numbers) {
    	  System.out.println(i);
      }
       
      LinkedList<Integer> list = new LinkedList<Integer>();
      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      System.out.println("index of 2 : "+Collections.binarySearch(list, 2));
      Collections.fill(list,4);
      System.out.println(list);
      
      LinkedList<Integer> list1 = new LinkedList<Integer>();
      list1.add(5);
      list1.add(2);
      list1.add(9);
      list1.add(4);
      Collections.sort(list1);
      System.out.println(list1);
	}

}
