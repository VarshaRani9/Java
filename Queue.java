import java.util.*;

public class Queue {
public static void main(String [] args) {
	System.out.println("--------------queues---------------");
	//add()/offer(),element()/peek(),remove(),poll()
	
	
	System.out.println("-------------------Priority Queue--------------");
	// insertion order is not maintained(generally sorted)
	
	Queue<String> queue = new PriorityQueue<>();// Implements min heap(1st element is min. one always)
	//Queue<String> queue= new PriorityQueue<>(Comparator.reverseOrder());//Implements max heap(1st element is max one always)
	
	queue.add("IT");// OR queue.offer("IT");
	queue.offer("EEE");
	queue.add("CSE");
	queue.add("CE");
	queue.add("EE");
	//queue.add(null);// deoesn't allow null values
	queue.add("ECE");
	queue.add("EEE");
	System.out.println("head:"+queue.element()); //first element  
	System.out.println("head:"+queue.peek()); //first element 
	System.out.println("iterating the queue elements:");  
	Iterator<String> itr=queue.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	System.out.println(queue.peek());
	queue.remove(); // remove element from first
	queue.poll(); // remove element from first
	System.out.println("after removing two elements:");  
	Iterator<String> itr2=queue.iterator();  
	while(itr2.hasNext()){  
	System.out.println(itr2.next());  
	}  
	
	

//-----------------------------------------------------------------------------------------------------------------------
	System.out.println("-------------------Array deque ------------------");
	//insertion order is maintained
	Deque<String> deque = new ArrayDeque<String>();  
	deque.add("Gautam");  
	deque.add("Karan");  
	deque.add("Ajay"); 
	deque.add("raghav");  
	deque.add("kumkum");  
	deque.add("naina"); 
	
	System.out.println("head:"+deque.element());//first element  
	System.out.println("head:"+deque.peek()); //first element 
	System.out.println("first element:"+deque.getFirst());//only in ArrayDeque not in priority queue
	System.out.println("last element:"+deque.getLast());//only in ArrayDeque not in priority queue
	//Traversing elements    
	Iterator<String> itr1=deque.iterator();  
	while(itr1.hasNext()){  
	System.out.println(itr1.next());  
	} 
	System.out.println("head "+deque.peek());// return head element without removing it
	deque.remove(); // remove element present at head
	deque.poll(); // remove element present at head
	System.out.println("Left elements are->");
	Iterator<String> itr3=deque.iterator();  
	while(itr3.hasNext()){  
	System.out.println(itr3.next());  
	} 
	
	//methods which are not in priority queue ,only in arraydeque
	//peek() and peekFirst() , poll() and pollFirst() are same
	System.out.println("head:"+deque.peekFirst());//return head element without removing it
	System.out.println("last:"+deque.peekLast());//return last element without removing it
	System.out.println(deque.pollFirst());//remove first element
	System.out.println(deque.pollLast());//remove last element
	
}
}
