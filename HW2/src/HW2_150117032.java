import java.util.Scanner;
public class HW2_150117032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to FA Motor Cars");
		
		//prompt the user to select the model
		System.out.println("What model of car do you want?"+"\nCompact (C)"+"\nLuxury (L)"+"\nMidsize (M)"+"\nPickup (P)"+"\nSUV (S)");
        String model = scan.nextLine();
        char c = model.toUpperCase().charAt(0);
        double totalcost;
       
        switch(c) {
        
        //case if the user select compact car
        case 'C':{
        	totalcost=16000;
        	//prompt the user to select the options
        	System.out.println("Do you want protective undercoating for $125? (Y or N)");
        	String pro = scan.nextLine();
        	char p =pro.toUpperCase().charAt(0);
        	System.out.println("Do you want security package for $800? (Y or N)");
        	String sec = scan.nextLine();
        	char s =sec.toUpperCase().charAt(0);

        	 double additionalcost=0;
        	//the conditions for the options
        	if (p=='Y')
        		additionalcost+=125;
        	if (s=='Y')
        		additionalcost+=800;
        		
        	//it calculates the total cost and taxes
        	totalcost += additionalcost; 
        	double tax1=(totalcost*35)/100;
        	totalcost+=tax1;
        	double tax2=(totalcost*18)/100;
        	totalcost+=tax2;
        	
        	//the output of the program
        	System.out.println("You ordered a Compact car with a base price of $16000.0");
        	System.out.println("Your additional cost is $"+additionalcost);
        	System.out.println("Sales Tax :  $"+(tax1+tax2));
        	System.out.println("Total cost of car & options : $"+totalcost);
      
        	break;
        }
        
        //case if the user select luxury car
        case 'L':{
        	totalcost=39000;
        	//prompt the user to select the options
        	System.out.println("Do you want protective undercoating for 125$? (Y or N)");
        	String pro = scan.nextLine();
        	char p =pro.toUpperCase().charAt(0);
        	System.out.println("Do you want multimedia package for 1250$? (Y or N)");
        	String mult = scan.nextLine();
        	char m =mult.toUpperCase().charAt(0);
        	
        	double additionalcost=0;
        	//the conditions for the options
        	if (p=='Y') 
        		 additionalcost+=125;
        	
        	if(m=='Y') 
        		 additionalcost+=1250;
        	
        	if(p=='Y'&&m=='Y') {
        		 additionalcost=1375;
        		 additionalcost-=(1375*5)/100.0;
        		 }
        	//it calculates the total cost and taxes
        	totalcost += additionalcost; 
        	double tax1=(totalcost*40)/100.0;
        	totalcost+=tax1;
        	double tax2=(totalcost*18)/100.0;
        	totalcost+=tax2;
        	
        	//the output of the program
        	System.out.println("You ordered a Luxury car with a base price of $39000.0");
        	System.out.println("Your additional cost is $"+additionalcost);
        	System.out.println("Sales Tax :  $"+(tax1+tax2));
        	System.out.println("Total cost of car & options : $"+totalcost);
      
        	break;
        	}
        	
        //case if the user select midsize car
        case 'M':{
        	totalcost=26000;
        	//prompt the user to select the options
        	System.out.println("Do you want protective undercoating for $125? (Y or N)");
        	String pro = scan.nextLine();
        	char p =pro.toUpperCase().charAt(0);
        	System.out.println("Do you want automatic transmission for $2000? (Y or N)");
        	String aut = scan.nextLine();
        	char a =aut.toUpperCase().charAt(0);
        	System.out.println("Do you want sunroof for $1500? (Y or N)");
        	String roo = scan.nextLine();
        	char r =roo.toUpperCase().charAt(0);
        	System.out.println("Do you want multimedia package for $750? (Y or N)");
        	String mult = scan.nextLine();
        	char m =mult.toUpperCase().charAt(0);
        	System.out.println("Do you want security package for $1000? (Y or N)");
        	String  sec = scan.nextLine();
        	char s =sec.toUpperCase().charAt(0);
        	System.out.println("Do you want sports package for an increased 5.0% This will increase your cost by $1300.0? (Y or N)");
        	String spt = scan.nextLine();
        	char t =spt.toUpperCase().charAt(0);
        	
        	double additionalcost=0;
        	//the conditions for the options
        	if (p=='Y')
        		additionalcost=125;
        	 if (a=='Y')
        		additionalcost+=2000;
        	 if (r=='Y')
        		additionalcost+=1500;
        	 if (m=='Y')
        		additionalcost+=750;
        	 if (s=='Y')
        		additionalcost+=1000;
        	 if (t=='Y')
        		additionalcost+=1300;
        	
        	if (r=='Y'&&m=='Y')
        		additionalcost-=250;
        	
        	if (s=='Y'&&a=='Y')
        		additionalcost-=300;
        	
        	//it calculates the total cost and taxes
            totalcost += additionalcost; 
            double tax1;
        	double tax2;
            
            if (totalcost<35000) {
        	 tax1=(totalcost*35)/100.0;
        	totalcost+=tax1;
        	}
        	else {
             tax1=(totalcost*40)/100.0;
        	totalcost+=tax1;
        	} 
        	tax2=(totalcost*18)/100.0;
        	totalcost+=tax2;
 
        	//the output of the program
        	System.out.println("You ordered a Midsize car with a base price of $26000.0");
        	System.out.println("Your additional cost is $"+additionalcost);
        	System.out.println("Sales Tax :  $"+(tax1+tax2));
        	System.out.println("Total cost of car & options : $"+totalcost);
      
        	break;
        	
        }
        //case if the user select pickup 
        case 'P':{
        	totalcost=19500;
        	//prompt the user to select the options
        	System.out.println("Do you want protective undercoating for $150? (Y or N)");
        	String pro = scan.nextLine();
        	char p =pro.toUpperCase().charAt(0);
        	System.out.println("Do you want multimedia package for $750? (Y or N)");
        	String mult = scan.nextLine();
        	char m =mult.toUpperCase().charAt(0);

        	 double additionalcost=0;
        	//the conditions for the options
        	if (p=='Y') 
        		 additionalcost+=150;
        	
        	if(m=='Y') 
        		 additionalcost+=750;
        		
        	//it calculates the total cost and taxes	
        	totalcost += additionalcost; 
        	double tax3=(totalcost*35)/100.0;
        	totalcost+=tax3;
        	double tax4=(totalcost*18)/100.0;
        	totalcost+=tax4;
        	
        	//the output of the program
        	System.out.println("You ordered a Pickup car with a base price of $19500.0");
        	System.out.println("Your additional cost is $"+additionalcost);
        	System.out.println("Sales Tax :  $"+(tax3+tax4));
        	System.out.println("Total cost of car & options : $"+totalcost);
      
        	break;
        }
        //case if the user select SUV car
        case 'S':
        	
        	totalcost=29000;
        	//prompt the user to select the options
        	System.out.println("Do you want protective undercoating for $200? (Y or N)");
        	String pro = scan.nextLine();
        	char p =pro.toUpperCase().charAt(0);
        	System.out.println("Do you want automatic transmission for $2500? (Y or N)");
        	String aut = scan.nextLine();
        	char a =aut.toUpperCase().charAt(0);
        	System.out.println("Do you want sunroof for $2300? (Y or N)");
        	String roo = scan.nextLine();
        	char r =roo.toUpperCase().charAt(0);
        	System.out.println("Do you want multimedia package for $1000? (Y or N)");
        	String mult = scan.nextLine();
        	char m =mult.toUpperCase().charAt(0);
        	System.out.println("Do you want security package for $1350? (Y or N)");
        	String  sec = scan.nextLine();
        	char s =sec.toUpperCase().charAt(0);
        	System.out.println("Do you want sports package for an increased 5.0% This will increase your cost by $1450.0? (Y or N)");
        	String spt = scan.nextLine();
        	char t =spt.toUpperCase().charAt(0);
        	
        	double additionalcost=0;
        	//the conditions for the options
        	if (p=='Y')
        		additionalcost=200;
        	 if (a=='Y')
        		additionalcost+=2500;
        	 if (r=='Y')
        		additionalcost+=2300;
        	 if (m=='Y')
        		additionalcost+=1000;
        	 if (s=='Y')
        		additionalcost+=1350;
        	 if (t=='Y')
        		additionalcost+=1450;
        	
        	if((a=='Y'&&r=='Y'&&m=='Y'&&s=='Y')&&t=='Y') {
        		additionalcost=8600;
        	System.out.println("You won protective undercoating for free!");
        	}
        	else if((a=='Y'&&r=='Y'&&m=='Y'&&s=='Y')&&t=='N') {
        		additionalcost=7150;
        	System.out.println("You won protective undercoating for free!");
        	}
        	//it calculates the total cost and taxes
            totalcost += additionalcost; 
            double tax1;
        	double tax2;
            
            if (totalcost<35000) {
        	 tax1=(totalcost*35)/100.0;
        	totalcost+=tax1;
        	 tax2=(totalcost*18)/100.0;
        	totalcost+=tax2;
        	}
        	else {
             tax1=(totalcost*40)/100.0;
        	totalcost+=tax1;
        	 tax2=(totalcost*18)/100.0;
        	totalcost+=tax2;
            }
        	
            //the output of the program
        	System.out.println("You ordered a SUV car with a base price of $29000.0");
        	System.out.println("Your additional cost is $"+additionalcost);
        	System.out.println("Sales Tax :  $"+(tax1+tax2));
        	System.out.println("Total cost of car & options : $"+totalcost);
      
        	break;
        	
        	
        	default: System.out.println("invalid input");
            
        }
	}

}
        
        
        
        
        
        
    
