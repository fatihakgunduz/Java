import java.util.Scanner;

public class Pro1_150117032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner coordinates = new Scanner(System.in);
	
	//it prints a message on the screen
	System.out.println("Enter the value of x1 : " ); 
	
	//it takes an input from the user
	double x1 = coordinates.nextDouble();
	
	System.out.println("Enter the value of y1 : " ); 
	
	//it takes an input from the user
	double y1 = coordinates.nextDouble();

	System.out.println("Enter the value of x2 : " ); 
	
	//it takes an input from the user
	double x2 = coordinates.nextDouble();

	System.out.println("Enter the value of y2 : " ); 
	
	//it takes an input from the user
	double y2 = coordinates.nextDouble();
	
	//it computes the x value of midpoint 
	double midx = (x1+x2)/2;
	
	//it computes the y value of midpoint
	double midy = (y1+y2)/2;
	
	//it computes the slope of the line between those two points
	double slope = (y2-y1)/(x2-x1);
	
	/*it computes the slope of the perpendicular bisector  of the line
	segment between two points*/
	double pbslope = -1/slope;
	
	//it computes the value of y intercept
	double yintercept = midy-pbslope*midx;
	
	
	System.out.println("The equation of the perpendicular"
			+ " bisector of the line segment between " + "("+x1+","+y1+")"+" and "+"("+x2+","+y2+")"+" is  y="+pbslope+"x"+"+"+yintercept);
	
	
	
	



	}

}
