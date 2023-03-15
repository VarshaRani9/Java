import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows/column : ");
		int numberOfLines = sc.nextInt();
		completeSq(numberOfLines);
		hollowSq(numberOfLines);
		sc.close();
	}

	public static void completeSq(int numberOfLines) {
		for(int line = 1; line<=numberOfLines; line++) {
			for(int star = 1; star<=numberOfLines; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void hollowSq(int numberOfLines) {
		System.out.println("--------------------");
		for(int line = 1; line<=numberOfLines; line++) {
			for(int star = 1; star<=numberOfLines; star++) {
				if(line==1 || line == numberOfLines || star==1 || star == numberOfLines)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
