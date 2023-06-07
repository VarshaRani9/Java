import java.util.ArrayList;
import java.util.Collections;

public class CustomArrayList_sort2 {
	public static void main(String[] args) {
		ArrayList<students> std = new ArrayList<students>();
		
		//std.add(new students(null,17));//null values are not allowed to primitive datatypes
		
		std.add(new students("varsha", 19));
		std.add(new students("natasha", 18));
		std.add(new students("prachi", 21));
		std.add(new students("aaiysha", 19));
		std.add(new students("harsha", 25));
		std.add(new students("aastha", 20));
		std.add(new students("madhu", 11));
		std.add(new students("varsha", 19));
		std.add(new students("shiwanshi", 34));
		std.add(new students("herlin", 45));
		std.add(new students("sanaya", 19));

		//when variables are private
		/*System.out.println("ArrayList before sorting ->");
		for (students s : std) {
			System.out.println(s.getName() + "," + s.getAge());
		}
		Collections.sort(std);
		System.out.println("");
		System.out.println("ArrayList after sorting in ascending order ->");
		for (students s : std) {
			System.out.println(s.getName() + "," + s.getAge());
		}
		Collections.sort(std, Collections.reverseOrder());
		System.out.println("");
		System.out.println("ArrayList after sorting in descending order ->");
		for (students s : std) {
			System.out.println(s.getName() + "," + s.getAge());

		}*/
		
		//if toString() is not there then it will pring heap address of objects
		System.out.println(std);
		Collections.sort(std);
		System.out.println(std);
		Collections.sort(std, Collections.reverseOrder());
		System.out.println(std);
		
	}
}

class students implements Comparable<students> {
	String name;
	int age;

	students(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//when variables are private
	/*public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}*/

	public int compareTo(students o) {
		int comp = this.age - o.age;
		if (comp != 0) {
			return comp;
		}
		return this.name.compareTo(o.name);
	}
	
  // if we omit toString() method then we will get hashcode as output (which is address space for that obj inside heap)
	public String toString() {
		return "age:" + age + ",name:" + name;
	}

}
