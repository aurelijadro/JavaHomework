package lt.vtmc.pd7;

import java.util.Scanner; // Import the scanner class

public class Skaiciuotuvas {
	public static void main (String [] args) {
		Scanner myObj = new Scanner(System.in); // Create a scanner object
	
		System.out.println("Enter first number"); // Read user input
		float num1 = myObj.nextInt();
		
		System.out.println("Select action number: 1-add, 2-substract, 3-multiply, 4-divide, 5-find remainder, 6-get square-root, 7-squared, 8-exponent by, 9-sin, 10-cos, 11-tan, 12-ctg");
		int action = myObj.nextInt();
		float num2 =0;
		
		switch (action) {
		
		case 1:
			System.out.println("Enter second number");
			num2 = myObj.nextInt();
			System.out.println("result: " + (num1+num2));
			break;
		case 2:	
			System.out.println("Enter second number");
			num2 = myObj.nextInt();
			System.out.println("result: " + (num1-num2));
			break;
		case 3:
			System.out.println("Enter second number");
			num2 = myObj.nextInt();
			System.out.println("result: " + (num1*num2));
			break;
		case 4:
			System.out.println("Enter second number");
			num2 = myObj.nextInt();
			float division = num1/num2;
			System.out.println("result: " + division);
			break;
		case 5:
			System.out.println("Enter second number");
			num2 = myObj.nextInt();
			float modulo = num1%num2;
			System.out.println("result: " + modulo);
			break;
		case 6:
			System.out.println("result: " + Math.sqrt(num1));
			break;
		case 7:
			System.out.println("result: " + Math.pow(num1, 2));
			break;	
		case 8:
			System.out.println("Enter exponent");
			num2 = myObj.nextInt();
			System.out.println("result: " + Math.pow(num1, num2));	
			break;
		case 9:
			System.out.println("result: " + Math.sin(num1));
			break;
		case 10:
			System.out.println("result: " + Math.cos(num1));	
			break;
		case 11:
			System.out.println("result: " + Math.tan(num1));
			break;
		case 12:
			System.out.println("result: " + (1/Math.tan(num1)));	
			break;
		default:
			System.out.println("You chose an illeagal action");	
		}	
			
		System.out.println("Do you need more calculations (write: yes/no)?");
		String proceed = myObj.next();
		if (proceed == "yes" || proceed =="Yes" || proceed =="YES") {
				Skaiciuotuvas.main(args);
		}
		
		
		
		
		
	}
}
