import java.util.Scanner;
public class HW_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a size greater or equal to five and an odd number:");
		int number = scan.nextInt();
		while (number<5&&number%2==0) {
			System.out.println("Invalid size,enter a odd number equal or greater than five");
			number = scan.nextInt();
		}
		System.out.println("Enter the letter(W,X,Y or Z): ");
		Scanner input = new Scanner(System.in);
		String letter = input.nextLine();
		letter=letter.toUpperCase();
		int a=1;
		while (a==1) {
			if(letter.equals("W")||letter.equals("X")||letter.equals("Y")||letter.equals("Z")) {
				a++;
			}
			else {
				System.out.println("Invalid letter,enter the letter again: ");
				letter = input.nextLine();
				letter=letter.toUpperCase();
			}
		}
		
		if(letter.equals("X")) {
		int i;
		int z;
		int c=number-2;
		for (int x=0;x<number/2+1;x++) {
			
			for ( i=0;i<x;i++)
			System.out.print(" ");
			System.out.print("*");
			 
			for ( z =0;z<c;z++){
			System.out.print(" ");
			}
			c=c-2;
			
			if(i!=number/2)
			System.out.print("*");
			
			System.out.println();
		}	
		int n=1;
		for (int x=number/2;x>0;x--) {
			
			for ( i=x-1;i>0;i--)
			System.out.print(" ");
			
			System.out.print("*");
			 
			for ( z =0;z<n;z++){
					
			System.out.print(" ");
			}
			n=n+2;
			if(i!=number/2)
			System.out.print("*");
			
			System.out.println();
		}	
		
	}
		if(letter.equals("W")) {
			int t=-1;
			int w;
			int i;
			int z;
			int c=number+number-3;
			int d=c+2;
			for (int x=0;x<number;x++) {
				
				for ( i=0;i<x;i++)
				System.out.print(" ");
				System.out.print("*");
				 
				for ( z =0;z<c;z++) {
				System.out.print(" ");
				}
				
				c=c-2;
				
				if(i!=number-1)
				System.out.print("*");
				
				for (w=0;w<t;w++) {
				
					if (w!=0||w!=number-1) 
						System.out.print(" ");
				}
				t=t+2;
				if (x!=0)
				System.out.print("*");
				
				
				for (int s=0;s<d-2;s++) {
					System.out.print(" ");
					}
				d=d-2;
				if(x!=number-1)
				System.out.print("*");
				
				System.out.println();
			}	
			
		}
		
		if(letter.equals("Y")) {
			int i;
			int z;
			int c=number-2;
			for (int x=0;x<number/2+1;x++) {
				
				for ( i=0;i<x;i++)
				System.out.print(" ");
				System.out.print("*");
				 
				for ( z =0;z<c;z++){
				System.out.print(" ");
				}
				c=c-2;
				
				if(i!=number/2)
				System.out.print("*");
				
				System.out.println();
			}
		for(int u=0;u<number/2;u++) {
		   for (int y=0;y<number/2;y++)
			    System.out.print(" ");
		   		System.out.print("*"+"\n");
			}
		
		}
		if(letter.equals("Z")) {
			int f=number-2;
			for (int x=0;x<number;x++)
				System.out.print("*");
			System.out.println();
			for (int z=0;z<number-2;z++) {
			for (int i=0;i<f;i++)
				System.out.print(" ");
			f=f-1;
			System.out.print("*");
			System.out.println();
			
			        }
			for (int x=0;x<number;x++)
				System.out.print("*");			
			
			
			
			
		}
		
	
	}	
			

}
		
		
	
	


