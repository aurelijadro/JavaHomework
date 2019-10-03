package it.vtmc.javabasics;

public class JavaContinueBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i =0; i<=10; i++) {
			System.out.println(i);
			if (i==5) {
				break; // nutraukia ciklo veikima
			}
			
		}
		
		for (int j =0; j<=10; j++) {
		if (j%2 == 0) {
			if (j==6) {
				continue; //nespausdina 6
			}
			System.out.println(j);
			}
			
		}
	}

}
