package it.vtmc.javabasics;

public class JavaOperators {

	public static void main(String[] args) {
		// checkArithmetic();
		// checkRelational();
		// checkLogical();
		// checkAssignment();
		// checkBitwise(); 
		
	}

	private static void checkArithmetic() {
		//byte, short, int, long, float, double, char
		// char mazosios ir didziosios raides skiriasi 32 numeriais
		int intValue = 10;
		int intValue2 = 2;
		System.out.println(intValue+intValue2);
		System.out.println(intValue-intValue2);
		System.out.println(intValue*intValue2);
		System.out.println(intValue/intValue2);
		
		char charValue = 'a'; //konvertuoja i simbolio numeri
		System.out.println(intValue+charValue);
		System.out.println((char)(charValue-32));
		System.out.println(Character.toUpperCase(charValue));
		
	}
	private static void printBinary(long value, long size) {
		for (long i=size-1; i>=0; i--) {
			long mask = 1 << i;
			long result = (mask & value) >> i;
			System.out.print(result);
		}
		System.out.println();
	}

	private static void checkBitwise() {
		int intNumber = 23;
		int intNumber2 = 45;
		printBinary(intNumber, 32);
		System.out.println(Integer.toBinaryString(intNumber));
			
	}
	
	private static void checkRelational() {
			int a = 10;
			int b = 20;
			System.out.println("a == b = " + (a == b) );
			System.out.println("a != b = " + (a != b) );
			System.out.println("a > b = " + (a > b) );
			System.out.println("a < b = " + (a < b) );
			System.out.println("b >= a = " + (b >= a) );
			System.out.println("b <= a = " + (b <= a) );
			}
	
	private static void checkLogical() {
		boolean a = true;
		boolean b = false;
		System.out.println("a && b = " + (a&&b));
		System.out.println("a || b = " + (a||b) );
		System.out.println("!(a && b) = " + !(a && b));
	}
	
	private static void checkAssignment() {
		int a = 10, b = 20, c = 0;
		c = a + b;
		System.out.println("c = a + b = " + c );
		c += a ;
		System.out.println("c += a = " + c );
		c -= a ;
		System.out.println("c -= a = " + c );
		c *= a ;
		System.out.println("c *= a = " + c );
		a = 10;
		c = 15;
		c /= a;
		System.out.println("c /= a = " + c );
		a = 10;
		c = 15;
		c %= a;
		System.out.println("c %= a = " + c );
	}
}


