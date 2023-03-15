import java.util.Scanner;

public class PyaramidHalf_Combinations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows/column : ");
		int numberOfLines = sc.nextInt();
		py1(numberOfLines);
		py2(numberOfLines);
		py3(numberOfLines);
		py4(numberOfLines);
		pyHollow1(numberOfLines);
		pyHollow2(numberOfLines);
		pyHollow3(numberOfLines);
		pyHollow4(numberOfLines);

		sc.close();

	}

	public static void py1(int numberOfLines) {
		System.out.println();
		for (int line = 1; line <= numberOfLines; line++) {
			for (int star = 1; star <= numberOfLines - line + 1; star++) {
				System.out.print("*");
			}
			for (int spaces = 1; spaces < 2 * line - 1; spaces++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= numberOfLines - line + 1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void py2(int numberOfLines) {
		System.out.println("------------------");
		for (int line = 1; line <= numberOfLines; line++) {
			for (int star = 1; star <= line; star++) {
				System.out.print("*");
			}
			for (int spaces = 1; spaces <= 2 * numberOfLines - 2 * line; spaces++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= line; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void py3(int numberOfLines) {
		System.out.println("------------------");
		for (int line = 1; line <= numberOfLines; line++) {
			for (int star = 1; star <= line; star++) {
				System.out.print("*");
			}
			for (int spaces = 1; spaces <= 2 * numberOfLines - 2 * line; spaces++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= line; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int line = 2; line <= numberOfLines; line++) {
			for (int star = 1; star <= numberOfLines - line + 1; star++) {
				System.out.print("*");
			}
			for (int spaces = 1; spaces < 2 * line - 1; spaces++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= numberOfLines - line + 1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void py4(int numberOfLines) {
		System.out.println("------------------");
		for (int line = 1; line <= numberOfLines; line++) {
			for (int star = 1; star <= numberOfLines - line + 1; star++) {
				System.out.print("*");
			}
			for (int spaces = 1; spaces < 2 * line - 1; spaces++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= numberOfLines - line + 1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int line = 1; line <= numberOfLines; line++) {
			for (int star = 1; star <= line; star++) {
				System.out.print("*");
			}
			for (int spaces = 1; spaces <= 2 * numberOfLines - 2 * line; spaces++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= line; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pyHollow1(int numberOfLines) {
		System.out.println("------------------");
		for (int line = numberOfLines; line >= 1; line--) {
			for (int star = line; star >= 1; star--) {
				if (star == 1 || star == line || line == numberOfLines)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for (int line = 2; line <= numberOfLines; line++) {
			for (int star = 1; star <= line; star++) {
				if (star == 1 || star == line || line == numberOfLines)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void pyHollow2(int numberOfLines) {
		System.out.println("------------------");
		for (int line = 1; line <= numberOfLines - 1; line++) {
			for (int spaces = 1; spaces <= numberOfLines - line; spaces++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= line; star++) {
				if (star == 1 || star == line)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		int spaceCount = 0;
		for (int line = numberOfLines; line >= 1; line--, spaceCount++) {
			for (int spaces = 1; spaces <= spaceCount; spaces++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= line; star++) {
				if (star == 1 || star == line)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();

	}

	public static void pyHollow3(int numberOfLines) {
		System.out.println("------------------");
		int spaceCount = 0;
		for (int line = numberOfLines; line >= 1; line--, spaceCount++) {
			for (int spaces = 1; spaces <= spaceCount; spaces++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= line; star++) {
				if (star == 1 || star == line || line == numberOfLines)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for (int line = 2; line <= numberOfLines; line++) {
			for (int spaces = 1; spaces <= numberOfLines - line; spaces++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= line; star++) {
				if (star == 1 || star == line || line == numberOfLines)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();

	}

	public static void pyHollow4(int numberOfLines) {
		System.out.println("------------------");
		for (int line = 1; line <= numberOfLines; line++) {
			for (int star = 1; star <= line; star++) {
				if (star == 1 || star == line)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for (int line = numberOfLines - 1; line >= 1; line--) {
			for (int star = line; star >= 1; star--) {
				if (star == 1 || star == line)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
