package lt.vtmc.pd6;

class JavaSintakse {
	
	static int theNumber = 102; //Class variable
	 	
	public static void main(String[] args) {
		// 6.1 Primitive JAVA types:
		byte num = 1; // 1 byte
		short num2 = 2; // 2 bytes
		int num3 = 3; // 4 bytes
		long num4 = 1234567890123456789L; // 8 bytes
		float num5 = 10.123F; // 4 bytes
		double num6 = 123456789.0123; // 8 bytes
		boolean correct=true; // 1 byte
		char randomletter='a'; // 2 bytes
		
		// 6.2 Print all different values
		System.out.println("6.2");
		System.out.println("byte: " + num);
		System.out.println("short: " + num2);
		System.out.println("int: " + num3);
		System.out.println("long: " + num4);
		System.out.println("float: " + num5);
		System.out.println("double: " + num6);
		System.out.println("boolean: " +correct);
		System.out.println("char: " + randomletter);
		
		// 6.3 JAVA operators
		// Arithmetic
		int first = 26;
		int second = 4;
		System.out.println("6.3" + (first + second));
		System.out.println(first - second);
		System.out.println(first * second);
		System.out.println(first / second); //because integer type only part of result will show
		System.out.println(first % second);
		System.out.println(first++ + ++second + ++first); // 59
		
		// Relational
		System.out.println(first == second);
		System.out.println(first != second);
		System.out.println(first > second);
		System.out.println(first < second);
		System.out.println(first >= second);
		
		// Bitwise
		System.out.println("6.3 Bitwise operators");
		int third = 5;
		int fourth = 15;
		int bin1 = 0b101;
		int bin2 = 0b1111;
		String thirdst = Integer.toBinaryString(third);
		String fourthst = Integer.toBinaryString(fourth);
		System.out.println(third +": " + thirdst);
		System.out.println(fourth +": " + fourthst);
		System.out.println(Integer.toBinaryString(bin1 & bin2)); //Binary AND Operator copies a bit to the result if it exists in both operands.
		System.out.println(Integer.toBinaryString(bin1 | bin2)); //Binary OR Operator copies a bit if it exists in either operand.
		System.out.println(Integer.toBinaryString(bin1 ^ bin2)); //Binary XOR Operator copies the bit if it is set in one operand but not both.
		System.out.println(Integer.toBinaryString( ~bin1)); //Binary Ones Complement Operator is unary and has the effect of 'flipping' bits.
		System.out.println("Bindary Right shift: " + (bin2 >> 2));//Binary Right Shift Operator. The left operands value is moved right by the number of bits specified by the right operand.
		System.out.println("Shift right zero fill: " + (bin2 >>> 2));//Shift right zero fill operator. The left operands value is moved right by the number of bits specified by the right operand and shifted values are filled up with zeros.
		
		// Logical
		boolean yes = true;
		boolean no = false;
		System.out.println(yes && no);
		System.out.println(yes || no);
		System.out.println(!(yes && no));
		
		// 6.4 Class/Static variables and local variables
		int anotherNumber = 103; //local variable
		System.out.println("6.4: " + (theNumber+anotherNumber));
		
		//6.5 Special String Symbols
		String specialChars ="6.5: \"\rLabas, \nšiandien\roras\tgeras\\puikus\" ";  //”\r \n \t \” \’ \\”;
		System.out.println(specialChars);
		
		//6.6 Order of different operators 
		boolean logical = yes && no || no;
		int i =1;
		int z = 2;
		int math = ++i + ++i * ++i - z--; 
		System.out.println("6.6: " + logical +" "+ math);
		
		//6.7 Different variables in one expression
		String greeting = "Hello, your number is: ";
		System.out.println("6.7: " + greeting + num4);
		
	}
	


}