import java.util.Scanner;

public class LeftHalfPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows/column : ");
		int numberOfLines = sc.nextInt();
		leftHalfPyramid(numberOfLines);
		leftHalfHollowPyramid(numberOfLines);
		leftHalfInvertedPyramid(numberOfLines);
		leftHalfInvertedHollowPyramid(numberOfLines);

		sc.close();

	}
	
	public static void leftHalfPyramid(int numberOfLines) {
		for(int line = 1; line<=numberOfLines; line++) {
			for(int spaces = 1; spaces<=numberOfLines-line; spaces++) {
				System.out.print(" ");
			}
			for(int star = 1; star<=line; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void leftHalfHollowPyramid(int numberOfLines) {
		System.out.println("--------------------");
		for(int line = 1; line<=numberOfLines; line++) {
			for(int spaces = 1; spaces<=numberOfLines-line; spaces++) {
				System.out.print(" ");
			}
			for(int star = 1; star<=line; star++) {
				if(star==1 || star==line || line==numberOfLines)
				System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void leftHalfInvertedPyramid(int numberOfLines) {
		System.out.println("--------------------");
		int spaceCount = 0;
		for(int line = numberOfLines;line>=1; line--,spaceCount++) {
			for(int spaces = 1; spaces<=spaceCount; spaces++) {
				System.out.print(" ");
			}
			for(int star = 1; star<=line; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void leftHalfInvertedHollowPyramid(int numberOfLines) {
		System.out.println("--------------------");
		int spaceCount = 0;
		for(int line = numberOfLines;line>=1; line--,spaceCount++) {
			for(int spaces = 1; spaces<=spaceCount; spaces++) {
				System.out.print(" ");
			}
			for(int star = 1; star<=line; star++) {
				if(star==1 || star==line || line==numberOfLines)
				System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
