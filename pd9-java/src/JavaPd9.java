import java.util.Scanner; // Import the scanner class

public class JavaPd9 {

	public static void main(String[] args) {
		// 9.1 check if triangle is rectangled
		isRectangled();

	}
	
	private static void isRectangled() {
		boolean isRectangled = false;
		Scanner myObj = new Scanner(System.in); // Create a scanner object
		System.out.println("Pleasi input lenght of the first side of the triangle");
		float firstSide = myObj.nextFloat();
		if (firstSide <= 0) {
		System.out.println("Your input is invalid");
		isRectangled();}
		
		System.out.println("Pleasi input lenght of the second side of the triangle");
		float secondSide = myObj.nextFloat();
		if (secondSide <= 0) {
		System.out.println("Your input is invalid");
		isRectangled();}
		
		System.out.println("Pleasi input lenght of the third side of the triangle");
		float thirdSide = myObj.nextFloat();
		if (thirdSide <= 0) {
		System.out.println("Your input is invalid");
		isRectangled();}
		
		if ((firstSide > secondSide) && (firstSide > thirdSide)) {
			if(Math.pow(firstSide, 2)==(Math.pow(secondSide, 2)+Math.pow(thirdSide, 2))) {
				isRectangled = true;}
		}
		if ((secondSide > firstSide) && (secondSide > thirdSide)) {
			if (Math.pow(secondSide, 2) == (Math.pow(firstSide, 2)+Math.pow(thirdSide, 2))) {
				isRectangled = true;}}
		
		if ((thirdSide > firstSide) && (thirdSide > secondSide)) {
			if(Math.pow(thirdSide, 2) == (Math.pow(firstSide, 2)+Math.pow(secondSide, 2))) {
				isRectangled = true;}}
		
		if (isRectangled) {
			System.out.println("Your triangle is rectangled!");}
		else {System.out.println("Your triangle is not rectangled!");}
	}	
	
}	

