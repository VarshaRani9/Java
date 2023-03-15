public class NUMERIC_Patterns {

	public static void main(String[] args) {
		int totalLines = 6;
		
//		First:
		System.out.println("FIRST : ");
		for(int line =1;line<=totalLines;line++) {
			for(int num = 1;num<=line;num++) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
		System.out.println();
		
//		Second:
		System.out.println("SECOND : ");
		int number =1;
		for(int line =1;line<=totalLines;line++) {
			for(int num = 1;num<=line;num++) {
				System.out.print(number+" ");
			    number++;
			}
			System.out.println();
		}
		System.out.println();
		
//		Third:
		System.out.println("THIRD : ");
		int number3 =1;
		for(int line =1;line<=totalLines;line++) {
			for(int num = 1;num<=line;num++) {
				System.out.print(number3+" ");
			}
			number3++;
			System.out.println();
		}
		System.out.println();
	
//		Fourth:
		System.out.println("FOURTH : ");
		for(int line =1;line<=totalLines;line++) {
			int number4 =totalLines;
			for(int num = 1;num<=line;num++) {
				System.out.print(number4+" ");
				number4--;
			}
			System.out.println();
		}
		System.out.println();
		
//		Fifth:
		System.out.println("FIFTH : ");
		for(int line =1;line<=totalLines;line++) {
			int number5 =line;
			for(int num = 1;num<=line;num++) {
				System.out.print(number5+" ");
				number5--;
			}
			System.out.println();
		}
		System.out.println();	
	
//		Sixth:
		System.out.println("SIXTH : ");
		for(int line =1;line<=totalLines;line++) {
			int number6 =line;
			for(int sp = 1;sp<=line;sp++) {
				System.out.print(" ");
			}
			for(int num = 1;num<=totalLines-line+1;num++) {
				System.out.print(number6+" ");
				number6++;
			}
			System.out.println();
		}
		for(int line =2;line<=totalLines;line++) {
			int number6 =totalLines-line+1;
			for(int sp = 1;sp<=totalLines-line+1;sp++) {
				System.out.print(" ");
			}
			for(int num = 1;num<=line;num++) {
				System.out.print(number6+" ");
				number6++;
			}
			System.out.println();
		}		
		
	}

}
