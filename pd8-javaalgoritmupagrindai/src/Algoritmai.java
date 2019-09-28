import java.util.Scanner; // Import the scanner class

public class Algoritmai {
	static boolean doingWell = true;
	static boolean taskComplete = false;
	static double salary = 1000;
	public static void main (String [] args) {
		//8.1 if-then, if-then-else, switch
		testDecissionMakingStatements();
		//8.2 for, while, do-while
		testLoopingStatements();
	}
	
	private static void testDecissionMakingStatements() {
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
}