package it.vtmc.javabasics;

public class JavaFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		checkFor();

	}
	
	public static void checkFor() {
		for (int i = 0; i <=10; i++)
			System.out.print(i+" ");
		
// infinite loop!!!!!! 		
//		for (;;) {
//			System.out.println("infinity");
//		}
		
		System.out.println();

			for (int i = 0; i <=10;) {
				System.out.print(i+" ");
				i++;
			}
		System.out.println();		
				
		int j = 0;
		for (;;) {
			if (j <= 10) {
				System.out.print(j + " ");
				j++;
			} 
			break;
		}
	
		System.out.println();
	
		for (int x=0, z=10; x<z; x++, z--) {
			System.out.println("x: " + x + " z: " + z);
		}
		
		String text = "Text for cycle...";
		for (int y =0; y<text.length(); y++ ) {
			
			System.out.print(text.charAt(y)+ " ");
			
			}
		
		int [] [] numbersArray = {{1,2,3,4,5},{1,2,3,4,5}};
		
		System.out.println(numbersArray.length);
		
		for(int a = 0; a < numbersArray.length; a++) {
			for (int b =0; b<numbersArray[a].length; b++) {
				System.out.print(numbersArray[a][b]+ " ");
			}
			System.out.println();
		}
		
		}
}
		
	


