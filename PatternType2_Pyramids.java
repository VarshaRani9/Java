import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int numberOfLines = sc.nextInt();
		pyramid(numberOfLines);
		pyramid_hollow(numberOfLines);
		pyramid_inverted(numberOfLines);
		pyramid_inverted_hollow(numberOfLines);
		sc.close();
	}
	
	public static void pyramid(int numberOfLines) {
		System.out.println();
		for(int line = 1; line<=numberOfLines; line++ ) {
			for(int space = 1; space<=numberOfLines-line; space++ ) {
				System.out.print(" ");
			}
			for(int star = 1; star<=2*line-1; star++ ) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println();
	}
	
	public static void pyramid_hollow(int numberOfLines) {
		System.out.println("--------------------");
		for(int line = 1; line<=numberOfLines; line++ ) {
			for(int space = 1; space<=numberOfLines-line; space++ ) {
				System.out.print(" ");
			}
			for(int star = 1; star<=2*line-1; star++ ) {
				if(star==1 || star == 2*line-1 || line==numberOfLines)
					System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
	
	public static void pyramid_inverted(int numberOfLines) {
		System.out.println("--------------------");
		for(int line = numberOfLines;line>=1; line-- ) {
			for(int space = 1; space<=numberOfLines-line; space++ ) {
				System.out.print(" ");
			}
			for(int star = 1; star<=2*line-1; star++ ) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	
	public static void pyramid_inverted_hollow(int numberOfLines) {
		System.out.println("--------------------");
		for(int line = numberOfLines;line>=1; line-- ) {
			for(int space = 1; space<=numberOfLines-line; space++ ) {
				System.out.print(" ");
			}
			for(int star = 1; star<=2*line-1; star++ ) {
				if(star==1 || star==2*line-1 || line == numberOfLines)
					System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println(" ");
		}
	}

}
