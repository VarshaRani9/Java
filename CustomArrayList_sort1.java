import java.util.*;

class student1 {
	private String name;
	private int age;

	student1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}
}

public class CustomArrayList_sort1
{

	public static <T> void main(String[] args) {

		ArrayList<student1> std = new ArrayList<student1>();

		std.add(new student1("varsha", 19));
		std.add(new student1("natasha", 18));
		std.add(new student1("prachi", 21));
		std.add(new student1("aaiysha", 19));
		std.add(new student1("harsha", 25));
		std.add(new student1("shiwanshi", 15));
		std.add(new student1("harsha", 24));
		std.add(new student1("aastha", 21));
		

		System.out.println("ArrayList before sorting");
		for (student1 s : std) {
			System.out.println(s.getName() + "," + s.getAge());
		}

		std.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
		
		System.out.println("");
		System.out.println("ArrayList after sorting");
		for (student1 s : std) {
			System.out.println(s.getName() + "," + s.getAge());
		}
	}

}
