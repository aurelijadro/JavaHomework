package hogwarts;

import java.util.Arrays;

/**
 * @author aurelija
 * 
 */
public class JavaClassesAndObjects {

	public static void main(String[] args) {
//		Student tomas = new Student("Tomas", 25); // "new" always creates new object
////		tomas.name = "Tomas";
////		tomas.age = 25;
//		System.out.println(tomas);
//		
//		Student dave = new Student("Dave", 30);
////		dave.name = "Dave";
////		dave.age = 30;
//		System.out.println(dave);
//		String studentName = tomas.getName();
//		System.out.println(studentName);
		
		// Create students:
		
		Student [] students = {new Student ("Hermione", 16), new Student ("Luna", 15), new Student ("Ron", 16),
				new Student ("Harry", 16), new Student ("Nymphadora", 13), new Student ("Lily", 17)};
		
		// Build a Dorm:
		
		Dorm griffindoorDorm = new Dorm (3, 1, 1, 1); // Build a dorm with 3 rooms - 1 double, 1 triple and 1 quadruple
		Room[] griffindoorRooms = griffindoorDorm.getDormRooms();
		
		System.out.println(griffindoorDorm.toString());
		
		for (Room dormRoom : griffindoorDorm.getDormRooms()) {
			System.out.println(dormRoom.toString());
			
		}
		
		griffindoorDorm.accommodateStudents(students);
		
//		for (Room room : griffindoorRooms) {
//			Bed [] beds = room.getBeds();
//			for (Bed bed : beds) {
//				System.out.println(bed.toString());
//			}
//		}
		
	
	}

}
