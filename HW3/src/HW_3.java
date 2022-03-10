import java.util.Scanner;

public class HW_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your sequence:");
		
		String sequence = scan.nextLine();
		
		for (int i = 1; i<=sequence.length()-1 ; i++) {
			
			char a = sequence.charAt(i-1);
			
			char b = sequence.charAt(i);
			
			char c = sequence.charAt(i-1);
			
			if(a>='0'&&a<='9') {
				
				for (int f = 1 ; f<=Character.getNumericValue(a) ; f++) {
						
			if(b=='s')
				System.out.print("*");
			
			if(b=='b')
				System.out.print(" ");
			
			if(b=='n')
				System.out.println();
		
			}
		
			}
			else if ((a=='s'||a=='b'||a=='n')&&!(c>='0' && c<='9')) {
				if(b=='s')
					System.out.print("*");
				
				else if(b=='b')
					System.out.print(" ");
				
				else if(b=='n')
					System.out.println();
			}
			
		}
		
	}
	
}
