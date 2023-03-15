import java.util.Scanner;

public class PyramidCombination {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int numberOfLines = sc.nextInt();
		pyramid_invPyramid(numberOfLines);
		invPyramid_pyramid(numberOfLines);
		pyramid_invPyramid_hollow(numberOfLines);
		invPyramid_pyramid_hollow(numberOfLines);
		sc.close();
	}
	
	public static void pyramid_invPyramid(int numberOfLines) {
		System.out.println("");
		for(int line = 1; line<=numberOfLines; line++ ) {
			for(int space = 1; space<=numberOfLines-line; space++ ) {
				System.out.print(" ");
			}
			for(int star = 1; star<=2*line-1; star++ ) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for(int line = numberOfLines-1;line>=1; line-- ) {
			for(int space = 1; space<=numberOfLines-line; space++ ) {
				System.out.print(" ");
			}
			for(int star = 1; star<=2*line-1; star++ ) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}
    public static void invPyramid_pyramid(int numberOfLines) {
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
		for(int line = 2; line<=numberOfLines; line++ ) {
			for(int space = 1; space<=numberOfLines-line; space++ ) {
				System.out.print(" ");
			}
			for(int star = 1; star<=2*line-1; star++ ) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
    }
		
		public static void pyramid_invPyramid_hollow(int numberOfLines) {
			System.out.println("--------------------");
			for(int line = 1; line<=numberOfLines; line++ ) {
				for(int space = 1; space<=numberOfLines-line; space++ ) {
					System.out.print(" ");
				}
				for(int star = 1; star<=2*line-1; star++ ) {
					if(star==1 || star == 2*line-1)
					System.out.print("*");
					else System.out.print(" ");
				}
				System.out.println(" ");
			}
			for(int line = numberOfLines-1;line>=1; line-- ) {
				for(int space = 1; space<=numberOfLines-line; space++ ) {
					System.out.print(" ");
				}
				for(int star = 1; star<=2*line-1; star++ ) {
					if(star==1 || star==2*line-1)
					System.out.print("*");
					else System.out.print(" ");
				}
				System.out.println(" ");
			}
			
		}
		
        public static void invPyramid_pyramid_hollow(int numberOfLines) {
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
			for(int line = 2; line<=numberOfLines; line++ ) {
				for(int space = 1; space<=numberOfLines-line; space++ ) {
					System.out.print(" ");
				}
				for(int star = 1; star<=2*line-1; star++ ) {
					if(star==1 || star == 2*line-1 || line == numberOfLines)
					System.out.print("*");
					else System.out.print(" ");
				}
				System.out.println(" ");
			}
		}
	

}
