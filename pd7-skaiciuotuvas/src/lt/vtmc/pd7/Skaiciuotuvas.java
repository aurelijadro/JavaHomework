package lt.vtmc.pd7;

import java.util.Scanner; // Import the scanner class

public class Skaiciuotuvas {
	public static void main (String [] args) {
		Scanner myObj = new Scanner(System.in); // Create a scanner object
		
		getNumber();
		
		System.out.println("Do you need more calculations (write: yes/no)?");
		String proceed = myObj.next();
		if (proceed.contentEquals("yes") || proceed.equals("Yes") || proceed.equals("YES")) {
			main(args);
			
			}else {
				System.out.println("Calculations complete!");
		}		
		
	}

	private static void getNumber() {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter a number"); // Read user input
		double num = myObj.nextDouble();
		chooseAction(num);
	}

	private static void chooseAction(double num1) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		System.out.println("Select action number: \n 1-add \n 2-substract \n 3-multiply \n 4-divide \n 5-find remainder \n 6-get square-root \n 7-square \n 8-exponent by n \n 9-sin \n 10-cos \n 11-tan \n 12-ctg \n 13-add percent \n 14-substract percent");
		int action = myObj.nextInt();
		double num2 =0;
		
		switch (action) {
		
		case 1:
			System.out.println("Enter second number");
			num2 = myObj.nextDouble();
			System.out.println("result: " + roundNumber((num1+num2)));
			break;
		case 2:	
			System.out.println("Enter second number");
			num2 = myObj.nextDouble();
			System.out.println("result: " + roundNumber((num1-num2)));
			break;
		case 3:
			System.out.println("Enter second number");
			num2 = myObj.nextDouble();
			System.out.println("result: " + roundNumber((num1*num2)));
			break;
		case 4:
			System.out.println("Enter second number");
			num2 = myObj.nextDouble();
			double division = num1/num2;
			System.out.println("result: " + roundNumber(division));
			break;
		case 5:
			System.out.println("Enter second number");
			num2 = myObj.nextDouble();
			double modulo = num1%num2;
			System.out.println("result: " + roundNumber(modulo));
			break;
		case 6:
			System.out.println("result: " + roundNumber(Math.sqrt(num1)));
			break;
		case 7:
			System.out.println("result: " + roundNumber(Math.pow(num1, 2)));
			break;	
		case 8:
			System.out.println("Enter exponent");
			num2 = myObj.nextDouble();
			System.out.println("result: " + roundNumber(Math.pow(num1, num2)));	
			break;
		case 9:
			System.out.println("result: " + roundNumber(Math.sin(num1)));
			break;
		case 10:
			System.out.println("result: " + roundNumber(Math.cos(num1)));	
			break;
		case 11:
			System.out.println("result: " + roundNumber(Math.tan(num1)));
			break;
		case 12:
			System.out.println("result: " + roundNumber((1/Math.tan(num1))));	
			break;
		case 13:
			System.out.println("Add n %");
			num2 = myObj.nextDouble();
			System.out.println("result: " + roundNumber((num1+(num1*num2/100))));
			break;
		case 14:
			System.out.println("Substract n %");
			num2 = myObj.nextDouble();
			System.out.println("result: " + roundNumber((num1-(num1*num2/100))));
			break;
		default:
			System.out.println("You chose an illeagal action");	
		}	
		
	}
	
	private static double roundNumber(double num) {
		double roundedNum = num * 10000;
		roundedNum = Math.round(roundedNum);
		roundedNum = roundedNum/10000;
		return roundedNum;
	}
}
