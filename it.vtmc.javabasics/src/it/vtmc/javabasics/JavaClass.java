/**
 * 
 */
/**
 * @author aurelija
 * @version 0.1
 */

package it.vtmc.javabasics;

	

public class JavaClass {
	/**
	 * 
	 * @param args
	 */

	private static String name;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b1 = false;
		boolean b2 = false;
		b2 &= b1;
		boolean b3 = b1 && b2;
		
		byte numberOne = 127;
		byte numberTwo = 127;
		byte result = (byte)(numberOne + numberTwo);
		
		
		long longNumber = 987654324583135844L; 
		
		int intNumber = -1245;
		int intNumber2 = 1245;
		System.out.println(Integer.toBinaryString(intNumber));
		System.out.println(Integer.toBinaryString(intNumber2));
		
		int a = 10;
		int b = 2;
		int resultab = a++ + ++b;
		System.out.println(resultab);
		
		byte bb1 =8;
		byte bb2 = (byte)(bb1 >> 2);
		System.out.println(bb2);
		
		char ch1 = '\t';
		
		double nn1 = 10.0;
		double nn2 = 0.0;
		System.out.println(nn1/nn2);
		
		System.out.println((byte)(numberOne + numberTwo)); //kastinimas
		System.out.println();
	}
	
	public static void count(int a, int b) {
		
	}
	

}
