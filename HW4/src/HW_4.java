
//the purpose of this program is to execute the given options by using methods.
//fatih akgündüz 150117032

import java.util.Scanner;

public class HW_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		//the infinite loop for program to run without interruption
		while (-1<0) {
		//writes the options to screen
		System.out.println("Welcome to our String Analyzer Program."+"\n\t1. Count number of chars\n\t2. Print the words in a sentence\n\t3. Delete substring"
				+ "\n\t4. Replace substring\n\t5. Sort characters\n\t6. Hash code of a string\nPlease enter your menu choice: ");
		//it prompt the user the enter an option
		String option = scan.nextLine();
		
		//case for option that user's entered
		switch(option.toLowerCase()) {
		//case for exit
		case "exit" :	
			System.out.println("Program ends. Bye :) ");
			System.exit(1);
			
			break;
		//case for quit	
		case "quit" :
			System.out.println("Program ends. Bye :) ");
			System.exit(1);
			break;
		//case for option 1	
		case "1" :
			System.out.println("Enter an input string:");
			String s = scan.nextLine();
			System.out.println("Enter an input char:");
			String c = scan.nextLine();
			System.out.println("The number of "+"'"+c+"'"+" in Hello is "+numOfChars(s,c)+".");
			
			break;
		//case for option 2	
		case "2" :
			System.out.println("Enter an input string: ");
			String sentence = scan.nextLine();
			System.out.println("The output is: "+"\n"+printWords(sentence));

			break;
		//case for option 3
		case "3" :
			System.out.println("Enter an input string: ");
			String str3 = scan.nextLine();
			System.out.println("Enter a substring: ");
			String sub = scan.nextLine();
			System.out.println("Enter a type");
			String type = scan.nextLine();
			System.out.println(delete(str3,sub,type));
			
			break;
		//case for option 4	
		case "4" :
			System.out.println("Enter an input string: ");
			String str4 = scan.nextLine();
			System.out.println("Enter the first substring: ");
			String sub1 = scan.nextLine();
			System.out.println("Enter the second substring: ");
			String sub2 = scan.nextLine();
			System.out.println(replace(str4,sub1,sub2));
			
			break;
		//case for option 5		
		case "5" :
			System.out.println("Enter an input string: ");
			String str5 = scan.nextLine();
			System.out.println("Enter a type: ");
			String type1 = scan.nextLine();
			System.out.println(sort(str5,type1));
			
			break;
		//case for option 6
		case "6" :
			System.out.println("Enter an input string: ");
			String str6 = scan.nextLine();
			System.out.println("Enter a value for b: ");
			String b = scan.nextLine();
			System.out.println("The hash code for "+str6+" is "+hashCode(str6,b)+".");
			
			break;
			
		default : System.out.println("Invalid input.Try again");
		}
		//it moves the cursor to the next line for display the options again
		System.out.println("\n");
		
		}
	}
	public static int numOfChars(String a,String b) {
		int x = 0;
		//it convert String to char 
		char c = b.charAt(0);
		//loop to count the chars which entered by user in the string that entered 
		for (int i=0;i<a.length();i++) {
			
			if(a.charAt(i)==c)
				++x;
		}
			return x;
		
		
	}

	public static String printWords(String str) {
		//empty String to find the answer
		String word ="";
		
		//it deletes the whitespace characters in the String 
		str =str.trim();
		//loop to delete given characters and it prints the words inside the String  
		for(int i = 0; i<str.length();i++) {
			//statements to delete given characters
			if(str.charAt(i)==','||str.charAt(i)=='!'||str.charAt(i)=='_'||str.charAt(i)=='('||str.charAt(i)=='.'||str.charAt(i)=='?'||str.charAt(i)==')') {
			}
			else if(str.charAt(i)==' ') {
			word+= "\n";
			}
			else if(str.charAt(i)=='-') {
				word+= "\n";
			}
			//statement to print words
			else 
			word= word+str.charAt(i);
		}
		
		return word;
		
		
		
	}
	
	public static String delete(String str,String sub,String type) {
		//empty String to find the answer
		String ans = "";
		int x;
		//condition for type 0
		if(type.equals("0")) {
			//loop to delete first occurrence of given subString inside the String
		for (x=0;x<str.length();x++){
			if(x==str.indexOf(sub))
			x=x+sub.length();
			char a = str.charAt(x);
			ans += a;	
		}
	}
		//condition for type 1
		if(type.equals("1")) {
			//loop to delete all occurrences of given subString inside the String
			do {
			for (x=0;x<str.length();x++){
				if(x==str.indexOf(sub))
				x=x+sub.length();
				char a = str.charAt(x);
				ans += a;
			}
				str=ans;
				ans="";
			}while (str.indexOf(sub)!=-1);
			
			ans =str;
					
	      }
		return ans.trim();
	}
	
	public static String replace(String str,String str1,String str2) {

		int x;
		//empty String to find answer 
		String ans ="";
		//nested loop that finds the subString entered and replace it 
		do {
			for (x=0;x<str.length();x++){
				
				if(x==str.indexOf(str1)) {
					//loop to replace 
					for(int i=0;i<str2.length();i++)
						ans+=str2.charAt(i);
				    	x=x+str1.length();
				}
				char a = str.charAt(x);
				ans += a;
			}
				str=ans;
				ans="";
			}while (str.indexOf(str1)!=-1);
			
			ans =str;
		return ans;
		
	}
	
	public static String sort(String str,String type) {
		//Strings to find the answer 
		String ans ="";
		String k ="";
		String l ="";
		String m ="";
		String n ="";
		String o ="";
		String p ="";
		String r ="";
		int a;
		//loop to find the order 
		for (a=0;a<str.length();a++) {
			char c=str.charAt(a);
			//condition for ascii values from low to high
			if(c>31&&c<48)
				k+=c;
			if (Character.isDigit(c))
				l+=c;
			if(c>57&&c<65)
				m+=c;
			if (c>64&&c<91)
				n+=c;
			if(c>90&&c<97)
				o+=c;
			if (c>96&&c<123)
				p+=c;
			if(c>122&&c<128)
				r+=c;	
		}
		//condition for type 0
		if(type.equals("0"))
			ans = k+l+m+n+o+p+r;
		//condition for type 1
		if(type.equals("1"))
			ans = p+n+l+k+m+o+r;
		return ans;
	}

	public static int hashCode(String str, String b) {
		int num = 0;
		//it converts a String to integer
		int i = Integer.parseInt(b);
		//it is the lenght of entered String 
		double x=str.length();
		//it computes the has code value 
		for(int a=0;a<str.length();a++) {
			//formula of hash code value
			num += str.charAt(a)*(Math.pow(i,--x));
		}
		
		return num;
	} 

}




