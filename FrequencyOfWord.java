import java.util.*;

public class FrequencyOfWord {

	public static void main(String[] args) {
		String s = "this this is is done by geeta geeta";
		String[] arr = s.split(" ");

		HashMap<String, Integer> map = new HashMap<>();
		for (String st : arr) {
			if (map.containsKey(st)) {
				map.put(st, map.get(st) + 1);
			} else {
				map.put(st, 1);
			}
		}

		for (Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + ":" + e.getValue());
		}
	}

}
