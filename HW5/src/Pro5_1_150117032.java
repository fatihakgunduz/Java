import java.util.Scanner;

public class Pro5_1_150117032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//it introduces the program
		System.out.println("Welcome to dice simulator program.");
		//it takes from the user the number which is the rolling number of dice
		System.out.print("Enter a value:");
		int number = scan.nextInt();
		//an array of the sum of each dice in ten timmes rolled
		int[] result = new int[51];
		//an array of the dice numbers
		int[] dice = new int[6];
		
		int sum=0;
		//a loop for doing the process 
		for (int n=0;n<number;n++) {
		for (int i=0;i<10;i++) {
			
			for (int a=0;a<6;a++) {
				
				dice[a]=(int)(Math.random()*6+1);
				sum+=dice[a];
			}
			
			for (int b=0;b<result.length;b++) {
				if(b+10==sum)
					result[b]++;
			}	
			sum=0;
		}
		
	}
			System.out.println();
		
		for (int a=0;a<result.length;a++) {
			System.out.print(a+10+": ");
			
			for (int arr=result[a];arr>0;arr--)
			System.out.print("*");
			
			System.out.println();
		}
	}

}
