import java.util.Scanner; // Import the scanner class

public class Algoritmai {
	static boolean doingWell = true;
	static boolean taskComplete = false;
	static double salary = 1000;
	public static void main (String [] args) {
		//8.1 if-then, if-then-else, switch
		testDecisionMakingStatements();
		//8.2 for, while, do-while
		testLoopingStatements();
		//8.3 break, continue, return
		testBranchingStatements();
		//8.4 labeled return and continue
		testLabeledBranching();
		//8.5 use return which returns a value - countSum method!
		//8.6 has a couple different decision making statements - generateName method
		generateName();
		//8.7 reads user input and detects type
		detectInputType();
		//8.8 demonstrate usage of switch statement - generateName method!
		
	}
	
	private static void testDecisionMakingStatements() {
		increaseSalary(doingWell); //if-then
		checkIfDoingWell(taskComplete); //if-then-else
		chooseNewTask(); //switch
	}
	
	private static void increaseSalary(boolean doingWell) {
		if (doingWell) {
			salary++;
			System.out.println("New salary is: " + salary);
		}
	}
	private static void checkIfDoingWell(boolean taskComplete) {
		if(taskComplete) {
			doingWell =true;
			System.out.println("You're doing well!");
		} else {
			doingWell=false;
			System.out.println("Keep on working!");
		}
	}
	private static void chooseNewTask() {
		Scanner myObj = new Scanner(System.in); // Create a scanner object
		System.out.println("Select a new task number:\n 1 Wash Dishes \n 2 Clean Floors \n 3 Paint Walls");
		int newTask = myObj.nextInt();
		
		switch(newTask){
		case 1:
			System.out.println("Hurry up! Do the dishes before the dinnertime!");
			break;
		case 2:
			System.out.println("The mop is waiting for you!");
			break;
		case 3:
			System.out.println("Do you prefer black or white walls? Go to work!");
			break;
		default:
			System.out.println("Hard to choose right? Add cleaning bathroom to your To-Do!");
		}
			
		}
	
	private static void testLoopingStatements() {
		countToTen(); // while
		countBackwards(); // do-while
		countFactorial(10); //for
	}
	private static void countToTen() {
		int num = 1;
		while (num <= 10){
			System.out.print(num + " ");
			num++;
		}
	System.out.println();	
}
	private static void countBackwards() {
		int num = 10;
		do {
			System.out.print(num + " ");
			num--;
		}while (num>0);
	System.out.println();	
	}
	private static void countFactorial(int num) {
		int factorial=1;
		if (num==0) {
			System.out.println(0);
		} else {
	
			for(int i =num; i>0; i--) {
				factorial*=i;
				}
			System.out.println("Factorial of " + num+ " = " + factorial);
			}
	}

	private static void testBranchingStatements(){
		breakLoop(); //break
		continueStatement(); //continue
		getSum(); //return
	}
	private static void breakLoop() {
		for(int i =0; i<5; i++) {
			System.out.print("Itteration: " + i + ":");
			for(int j=0; j<10; j++) {
				if (j==5) {
					break; //terminate loop if j equals 5
				}
			System.out.print(j+ " ");	
			}
		System.out.println();	
		}
	System.out.println("Loops completed");	
	}
	private static void continueStatement() {
		// prints 3 numbers in a row
		for(int i=1; i<=12; i++) {
			System.out.print(i + " ");
			if (i%3 != 0) {
				continue;
			}
			System.out.println();
		}
	}
	private static void getSum() {
		int sum = countSum(3,7);
		System.out.println("Sum is: " + sum);
		
	}
	private static int countSum(int num1, int num2) {
		return num1+num2;
	}

	private static void testLabeledBranching() {
		part1:
			for (int i=0; i<4; i++) {
				for (int j=0; j<3; j++) {
					if (i ==1) {
						continue part1; //skips [i=1; j=0] [i=1;j=1] [i=1; j=2]
					}System.out.print("[i=" +i +"; j=" +j +"] ");
				}
			}
		System.out.println();
		part2:
			for(int i=0; i<3; i++) {
				for (int j=0; j<10; j++) {
					if (i==1) {
						break part2; // stops entire loop once i ==1!
					}System.out.print("[i=" +i +"; j=" +j +"] ");
				} 
	
	}
	}
	
	private static void generateName() {
		Scanner myObj = new Scanner(System.in); // Create a scanner object
		System.out.println("Press \"1\" for a boy name \nPress \"2\" for a girl name");
		int gender = myObj.nextInt();
		int randomNum = ((int)(Math.random()*5+1));
		String name = "";
		if (gender == 1) {
			switch (randomNum) {
				case 1:
					name = "Tom";
					break;
				case 2: 
					name = "John";
					break;
				case 3:
					name = "Peter";
					break;
				case 4:
					name = "Harry";
					break;
				case 5:
					name = "Steve";
					break;
			}
			System.out.println(name + " is a perfect name!");
		} else if (gender == 2) {
			switch (randomNum) {
			case 1:
				name = "Anna";
				break;
			case 2:
				name = "Miranda";
				break;
			case 3:
				name = "Kate";
				break;
			case 4:
				name = "Siuzi";
				break;
			case 5:
				name = "Tiffani";
				break;
			}System.out.println(name + " is a beautiful name for a princess!");
		} else {
			System.out.println("Input incorrect!");
		}
	}

	private static void detectInputType() {
		Scanner myObj = new Scanner(System.in); // Create a scanner object
		System.out.println("What's your input");
		if (myObj.hasNextInt())
			System.out.println("Input type is integer");
		else if (myObj.hasNextLong())
			System.out.println("Input type is long");
		else if (myObj.hasNextBoolean())
			System.out.println("Input type is boolean");
		else if (myObj.hasNextFloat())
			System.out.println("Input type is float");
		else if (myObj.hasNextDouble())
			System.out.println("Input type is double");
		else if (myObj.hasNextLine())
			System.out.println("Input type is string");
		
	}
}