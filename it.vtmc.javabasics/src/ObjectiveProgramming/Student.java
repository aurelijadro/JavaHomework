package ObjectiveProgramming;
// kol nera nei vieno konstruktoriaus, yra sukuriamas default'inis konstruktorius


public class Student {

	private String name; // Class fields = Object data
	private int age;
	
//	Student(){} //konstruktorius - specialus metodas leidziantis paimti ir irasyti parametrus.
	// defaultinis konstruktorius, kai norime sukurti obekta be jokiu savybiu

		
	Student (String name, int age){
		if(name == null) {
			// New exception!
			System.out.println(":/");
		} else if(age == 0){
			// New exception!
			System.out.println(":/");
		} else {
		this.name = name;
		this.age = age;	
		}
		
	}
	// getters and setters
	
	public String getName() {
		return name.toUpperCase();
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Student [My name is=" + name + ", age=" + age + "]";
	}
	
//	@Override
//	public String toString() {
//		
//		return "I am a student";
//		                       
//	}

}
