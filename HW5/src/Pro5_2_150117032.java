import java.util.Scanner;

public class Pro5_2_150117032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		//it introduces the program
		System.out.println("Welcome to our program.");
		//it takes from the user the number which is the rolling number of dice
		System.out.print("Enter a string:");
		String str = scan.nextLine();
		System.out.print("Enter a number of steps:");
		Scanner input = new Scanner(System.in);
		int step = input.nextInt();
		
		//the code below find the size of array
		int x = 0; 
		char c = '-';
		for (int i=0;i<str.length();i++) {
			if(str.charAt(i)==c)
				++x;
		}
		
		int[] numbers=new int[x+1];
		
		int a=0;
			
		for(a=0;str.contains("-");a++) {
			numbers[a]= Integer.parseInt(str.substring(0,str.indexOf('-')));
			
			str=str.substring(str.indexOf('-')+1);
			}
			numbers[x]=Integer.parseInt(str);
			
			int[][] binary = new int[x+1][x+1];
			for (int m=0;m<x+1;m++) {
				int[] single=convertDectoB(numbers[m],x+1);
				
				for(int n=0;n<x+1;n++) {
					binary[m][n]=single[n];
				}
			
			
			}
			printArray(binary);
			
			for (int m=1;m<=step;m++) {	
			
				System.out.println("\n"+"It is converted to the following table after "+m+" st step: ");
			
			binary=convertArray(binary);
			
			printArray(binary);
			}
	  }
	
	
	public static int[] convertDectoB(int number,int size) {
		int[] single = new int[size]; 
		for (int a=size-1;a>-1;a--) {
			if(number>=2) {
			single[a]=number%2;
			number=number/2;
			}
			else if(number==1) {
			single[a]=1;
			number=number/2;
			}
			
		}
		
		return single;
	}


	public static void printArray(int[][] arr) {
		for (int m=0;m<arr.length;m++) {
			
			for(int k=0;k<4*arr[m].length+1;k++) {
				System.out.print("-");
			}
			System.out.println();
			for(int n=0;n<arr[m].length;n++) {
				System.out.print("| "+arr[m][n]+" ");
			}
			System.out.print("|"+"\n");
		
		}
		
		for(int o=0;o<4*arr[0].length+1;o++) {
			System.out.print("-");
		}
		
		
	}
	
	public static int[][] convertArray(int[][] arr) {
		
		for(int a1=0;a1<arr.length;a1++) {
			for (int b1=0;b1<arr.length;b1++) {
																				
				if(arr[a1][b1]==1) {
					int r=-2;
					for(int x1=a1;x1<=x1+1;x1++) {
						if(x1<=arr.length-1) {
						for (int y1=b1;y1<=y1+1;y1++) {
							if(y1<=arr.length-1) {
							if(arr[x1][y1]==1)
								r++;
						}}
					}}
					
					for(int x2=a1;x2>=0;x2--) {
						for (int y2=b1;y2>=0;y2--) {
							if(arr[x2][y2]==1)
								r++;
						}
					}
					
					int d=a1+1;
					int t=b1-1;
					if(d<=arr.length-1&&t>=0) {
						if(arr[d][t]==1)
							r++;
					}
					int d1=a1-1;
					int t1=b1+1;
					if(t1<=arr.length-1&&d1>=0) {
						if(arr[d1][t1]==1)
							r++;
					}
					
					   if(r<2||r>3)
						   arr[a1][b1]=0;
					   else if(r==3||r==2)
						   arr[a1][b1]=0;
					   
				}
					
				else if (arr[a1][b1]==0) {
					int r1=0;
					for(int x3=a1;x3<=x3+1;x3++) {
						if(x3<=arr.length-1) {
						for (int y3=b1;y3<=y3+1;y3++) {
							if(y3<=arr.length-1) {
							if(arr[x3][y3]==1)
								r1++;
						}}
					}}
					
					for(int x4=a1;x4>-1;x4--) {
						for (int y4=b1;y4>-1;y4--) {
							if(arr[x4][y4]==1)
								r1++;
						}
					}
					
					int d2=a1+1;
					int t2=b1-1;
					if(d2<=arr.length-1&&t2>=0) {
						if(arr[d2][t2]==1)
							r1++;
					}
					int d3=a1-1;
					int t3=b1+1;
					if(t3<=arr.length-1&&d3>=0) {
						if(arr[d3][t3]==1)
							r1++;
					}
					
					if(r1==3)
						arr[a1][b1]=1;
					else 
						arr[a1][b1]=0;
					}
					
		  }
		}
		return arr;
	}
}
