import java.util.*;

public class Map {

	public static void main(String[] args) {

		// Map - Key(unique)+value
		// map - HashMap,TreeMap,LinkedHashMap

		// Hashmap - (Unordered + unique)& if key is repeated ..
		// it will get overriden if put() is used,not overriden if putIfAbsent() is used

		System.out.println("---------- HashMap --------------");
		HashMap<Integer, String> numbers = new HashMap<>();// HashMap<Integer,String> numbers = new HashMap();
		numbers.put(1, "one");
		numbers.put(5, "five");
		numbers.put(3, "three");
		numbers.put(9, "nine");
		numbers.put(7, "seven");
		numbers.put(6, "six");
		numbers.put(2, "two");
		numbers.put(5, "eight");// replace five by eight

		for (Map.Entry<Integer, String> e : numbers.entrySet()) {
			System.out.println(e.getKey() + "," + e.getValue());
		}

		// to avoid duplicates we can add elements this way so that no value will get
		// overriden by other
		/*
		 * if(!numbers.containsKey(2)) { numbers.put(2, "ten"); }
		 */
		// OR
		numbers.putIfAbsent(2, "ten");

		// return set view of Mapping
		System.out.println(numbers.entrySet());

		// Returns a Set view of the mappings contained in this map
		numbers.entrySet()
				// Returns a sequential Stream with this collection as its source
				.stream()
				// Sorted according to the provided Comparator
				.sorted(Map.Entry.comparingByKey())
				// Performs an action for each element of this stream
				.forEach(System.out::println);

		// Returns a Set view of the mappings contained in this map
		numbers.entrySet()
				// Returns a sequential Stream with this collection as its source
				.stream()
				// Sorted according to the provided Comparator
				.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
				// Performs an action for each element of this stream
				.forEach(System.out::println);

		// Returns a Set view of the mappings contained in this map
		numbers.entrySet()
				// Returns a sequential Stream with this collection as its source
				.stream()
				// Sorted according to the provided Comparator
				.sorted(Map.Entry.comparingByValue())
				// Performs an action for each element of this stream
				.forEach(System.out::println);

		// Returns a Set view of the mappings contained in this map
		numbers.entrySet()
				// Returns a sequential Stream with this collection as its source
				.stream()
				// Sorted according to the provided Comparator
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				// Performs an action for each element of this stream
				.forEach(System.out::println);
//---------------------------------------------------------------------------------------------------------	
		// LinkedHashMap - unique,ordered a/c to entry in map,
		// latest value will replace previous one if same key is there
		System.out.println("---------- LinkedHashMap --------------");
		LinkedHashMap<Integer, String> names = new LinkedHashMap<Integer, String>();
		names.put(1, "varsha");
		names.put(8, "prachi");
		names.put(3, "sanaya");
		names.put(4, "alisha");
		names.put(5, "diksha");
		names.put(2, "seeta");
		names.put(7, "geeta");
		names.put(3, "harsha");

		for (Map.Entry<Integer, String> e : names.entrySet()) {
			// System.out.println(e.getKey()+","+e.getValue());
			System.out.println(e);
			// System.out.println(e.getKey());// print only key
			// System.out.println(e.getValue());//print only values
		}
		// printing all keys
		for (Integer key : names.keySet()) {
			System.out.println(key);
		}
		// print all values
		for (String value : names.values()) {
			System.out.println(value);
		}

//----------------------------------------------------------------------------------------------
		// TreeMap - unique keys,sorted in ascending order of keys,
		// latest value will replace previous one if same key is there
		System.out.println("---------- TreeMap --------------");
		TreeMap<Integer, String> animals = new TreeMap<>();
		animals.put(1, "cat");
		animals.put(4, "dog");
		animals.put(3, "lion");
		animals.put(8, "rabbit");
		animals.put(5, "snake");
		animals.put(6, "horse");
		animals.put(6, "lizard");
		animals.put(7, null);// no null key ,null value allowed

		for (Map.Entry<Integer, String> e : animals.entrySet()) {
			System.out.println(e.getKey() + "," + e.getValue());
		}

	}
}
