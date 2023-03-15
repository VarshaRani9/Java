import java.util.Scanner;

public class PyramidHalf_Combination {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows/columns: ");
		int numberOfLines = sc.nextInt();
		half1(numberOfLines);
		half2(numberOfLines);
		half3(numberOfLines);
		half4(numberOfLines);
		sc.close();
	}

	public static void half1(int numberOfLines) {
		System.out.println();
		int spaceCount = 1;
		for (int line = 1; line <= numberOfLines; line++) {
			for (int spaces = 1; spaces <= numberOfLines - line; spaces++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= line; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int line = numberOfLines - 1; line >= 1; line--, spaceCount++) {
			for (int spaces = 1; spaces <= spaceCount; spaces++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= line; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void half2(int numberOfLines) {
		System.out.println("----------------");
		int spaceCount = 0;
		for (int line = numberOfLines; line >= 1; line--, spaceCount++) {
			for (int spaces = 1; spaces <= spaceCount; spaces++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= line; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int line = 2; line <= numberOfLines; line++) {
			for (int spaces = 1; spaces <= numberOfLines - line; spaces++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= line; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void half3(int numberOfLines) {
		System.out.println("----------------");
		for (int line = numberOfLines; line >= 1; line--) {
			for (int star = line; star >= 1; star--) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int line = 2; line <= numberOfLines; line++) {
			for (int star = 1; star <= line; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void half4(int numberOfLines) {
		System.out.println("----------------");
		for (int line = 1; line <= numberOfLines; line++) {
			for (int star = 1; star <= line; star++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int line = numberOfLines - 1; line >= 1; line--) {
			for (int star = line; star >= 1; star--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
