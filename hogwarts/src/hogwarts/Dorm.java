package hogwarts;

public class Dorm {

	private int rooms;
	private int doubleRooms;
	private int tripleRooms;
	private int quadrupleRooms;
	private Room[] dormRooms;

	Dorm(int rooms, int doubleRooms, int tripleRooms, int quarupleRooms) {
		this.rooms = rooms;
		this.doubleRooms = doubleRooms;
		this.tripleRooms = tripleRooms;
		this.quadrupleRooms = quarupleRooms;
		createRooms(rooms, doubleRooms, tripleRooms, quadrupleRooms);
	}

	void createRooms(int rooms, int doubleRooms, int tripleRooms, int quadrupleRooms) {
		dormRooms = new Room[rooms];
		for (int i = 0; i < rooms; i++) {
			if (i < doubleRooms) {
				dormRooms[i] = new Room(2); // create double rooms
			} else if (i < (doubleRooms + tripleRooms)) {
				dormRooms[i] = new Room(3); // create triple rooms
			} else {
				dormRooms[i] = new Room(4); // create quadruple rooms
			}

		}

	}

	public void accommodateStudents(Student[] students) {
		int studentsLeftToAccommodate = students.length;
		for (int room = 0, accommodatedStudents = 0; room < dormRooms.length; room++) {
			int freeBeds = dormRooms[room].getNumberOfUnoccupiedBeds();
			for (int z = freeBeds; z > 0; z--) {
				if (studentsLeftToAccommodate > 0) {
					dormRooms[room].accommodateStudent(students[accommodatedStudents]);
					accommodatedStudents++;
					studentsLeftToAccommodate--;

				}
			}

			if (studentsLeftToAccommodate == 0) {
				System.out.println("All students are assigned rooms and beds. Great Success!");
				break;
			}
		}
		if (studentsLeftToAccommodate > 0) {
			System.out.println("The dorm is full, " + studentsLeftToAccommodate
					+ "students are sleeping in the Great Hall on the floor.");
		}

	}
	
	
	
	
	
	

	public String toString() {
		return ("Dorm has " + rooms + " rooms. " + doubleRooms + " rooms are double, " + tripleRooms
				+ " are triple and " + quadrupleRooms + " rooms are quadruple.");

	}

	// getters and setters:

	public Room[] getDormRooms() {
		return dormRooms;
	}

}
