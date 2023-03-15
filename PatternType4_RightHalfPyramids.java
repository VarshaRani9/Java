import java.util.Scanner;

public class RightHalfPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int numberOfLines = sc.nextInt();
		rightHalfPyramid(numberOfLines);
		rightHalfHollowPyramid(numberOfLines);
		rightHalfInvertedPyramid(numberOfLines);
		rightHalfInvertedHollowPyramid(numberOfLines);
		sc.close();

	}
	public static void rightHalfPyramid(int numberOfLines) {
		System.out.println();
		for(int line = 1; line<=numberOfLines; line++) {
			for(int star = 1; star<=line; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
public static void rightHalfInvertedPyramid(int numberOfLines) {
	System.out.println("--------------------");
	for(int line=numberOfLines;line>=1; line--) {
		for(int star =line; star>=1; star--) {
			System.out.print("*");
		}
		System.out.println();
	}
	}

public static void rightHalfHollowPyramid(int numberOfLines) {
	System.out.println("--------------------");
	for(int line = 1; line<=numberOfLines; line++) {
		for(int star = 1; star<=line; star++) {
			if(star==1 || star==line || line == numberOfLines)
			System.out.print("*");
			else System.out.print(" ");
		}
		System.out.println();
	}
	System.out.println();
}

public static void rightHalfInvertedHollowPyramid(int numberOfLines) {
	System.out.println("--------------------");
	for(int line=numberOfLines;line>=1; line--) {
		for(int star =line; star>=1; star--) {
			if(star==1 || star==line || line==numberOfLines)
			   System.out.print("*");
			else System.out.print(" ");
		}
		System.out.println();
	}
	System.out.println();
}
}
