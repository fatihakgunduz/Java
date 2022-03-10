import java.util.Scanner;

public class Pro2_150117032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner pps = new Scanner(System.in);
	
	System.out.println("Enter your montly salary : ");
	
	//it takes the amount of salary from the user
	double salary = pps.nextDouble(); 
	
	System.out.println("Enter the percent of your salary to save : ");
	
	//it takes the rate of saving from the user
	double save = pps.nextDouble(); 
	
	//it converts the value of saving rate to decimal
	double saving = (salary/100)*save;
	
	System.out.println("Enter the montly interest rate : ");
	
	//it takes the value of interest rate from the user
	double InterestRate = pps.nextDouble(); 
	
	//it converts the value of interest rate to decimal
	double irate =InterestRate/100;

	System.out.println("Enter your goverment support rate : ");
	
	//it takes the value of goverment support rate from the user
	double GovermentRate = pps.nextDouble(); 
	
	//it converts the value of goverment support rate to decimal
	double grate = GovermentRate/100;
	
	//calculations below give the monthly values of the account 
	double month1 = saving*(1+irate)*(1+grate);
	
	double month2 = (month1+saving*(1+grate))*(1+irate);
	
	double month3 = (month2+saving*(1+grate))*(1+irate);
	
	double month4 = (month3+saving*(1+grate))*(1+irate);
	
	double month5 = (month4+saving*(1+grate))*(1+irate);
	
	double month6 = (month5+saving*(1+grate))*(1+irate);
	
	System.out.println("After the first month, the account value is "+(int)(month1*100)/100.0);
	
	System.out.println("After the second month, the account value is "+(int)(month2*100)/100.0);

	System.out.println("After the third month, the account value is "+(int)(month3*100)/100.0);

	System.out.println("After the fourth month, the account value is "+(int)(month4*100)/100.0);

	System.out.println("After the fifth month, the account value is "+(int)(month5*100)/100.0);
	
	System.out.println("After the sixth month, the account value is "+(int)(month6*100)/100.0);

	System.out.println("In total, you saved "+(int)((6*saving)*100)/100.0+"TLs and your total profit is "+(int)((month6-6*saving)*100)/100.0);

	
	
	

	}

}
