package it.vtmc.javabasics;

public class PrimitiveTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkByte();
		//checkShort(); // byte ir short pagal nutyleijma sukastinami iki int!
		//checkInt();
		//checkLong();
		//checkFloat(); floatAI megsta infinity
		checkDouble();
		// TODO: read --> IEEE745	
			

	}
	private static void checkByte() {
		byte byteMinValue = Byte.MIN_VALUE;
		byte byteMaxValue = Byte.MAX_VALUE;
		System.out.println("Byte range from  " + byteMinValue 
				+ " to " + byteMaxValue);
	
	byte byteValue = 127;
	byte result = byteValue++; //perpildymas - prarandama pradine reiksme, prarandami duomenys
	System.out.println(result);
	System.out.println(byteValue);
	//System.out.println(byteValue/0); negalima dalinti is 0!
	System.out.println(byteValue%12);
	
	byte otherValue = -12;
	byte otherResult = (byte) (byteValue - otherValue); //negali int sutalpinti i byte'a. bando automatiskai kastinti
		
	}
	
	private static void checkShort() {
		short shortMinValue = Short.MIN_VALUE;
		short shortMaxValue = Short.MAX_VALUE;
		System.out.println("Short range from  " + shortMinValue 
				+ " to " + shortMaxValue);
		short shortValue = 15456;
		//System.out.println(shortValue/0); negalima dalinti is 0!!!
		short otherValue = 456;
		short result = (short) (shortValue+otherValue);
		System.out.println(result);
	
	}
	
	private static void checkInt() {
		int intMinValue = Integer.MIN_VALUE;
		int intMaxValue = Integer.MAX_VALUE;
		System.out.println("Integer range from  " + intMinValue 
				+ " to " + intMaxValue);
		int intValue = 1121531253;
		// System.out.println(intValue/0); negalima dalinti is 0!!!
	
		int otherValue = 2076542174;
		System.out.println(intValue+otherValue);
	}
	
	private static void checkLong() {

		
		long longMinValue = Long.MIN_VALUE;
		long longMaxValue = Long.MAX_VALUE;
		System.out.println("Long from  " + longMinValue 
				+ " to " + longMaxValue);
		long longValue = 1121531253456L;
		//System.out.println(longValue/0); negalima dalinti is 0!!!
	
		long otherValue = 2076542174456L;
		System.out.println(longValue+otherValue);
		
		short shortValue =5555;
		int intValue = 145678;
		long result = longValue + shortValue + intValue; //short'as kastinamas i long'a
		System.out.println(result);
	}

	private static void checkFloat(){
		float floatMinValue = Float.MIN_VALUE;
		float floatMaxValue = Float.MAX_VALUE; 
		System.out.println("Float range from  " + floatMinValue 
				+ " to " + floatMaxValue);
		float floatValue = 45785.333333F;
		System.out.println(floatValue/0); // infinity!
		System.out.println(floatValue % 10); //liekana
		
		int intValue=10;
		System.out.println(intValue/3);
		System.out.println("ba"+ (0.0/0.0) + "A");
		System.out.println(0.1f+0.1f+0.1f+0.1f+0.1f
				+0.1f+0.1f+0.1f+0.1f+0.1f); //paklaida
		float result = floatValue + intValue;
		System.out.println(result);
		System.out.println(floatMaxValue+floatMaxValue);//Infinity!
		
	}
	
	private static void checkDouble() {
		double doubleMinValue = Double.MIN_VALUE;
		double doubleMaxValue = Double.MAX_VALUE;
		System.out.println("Double range from: " + doubleMinValue + " to " + doubleMaxValue);
		
		double doubleValue = 1.5E308;
		System.out.println(doubleValue/0); // infinity!
		double nan = 0.0/0.0;
		System.out.println(nan); //NaN!
		System.out.println(doubleMaxValue+doubleMaxValue); //Infinity
	}

}
