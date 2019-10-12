package hogwarts;

public class Room {
	
	static int countRooms = 101;
	static int bedNumber = 1;
	// instance variables:
	
	private int roomNumber;
	private int bedCount;
	private boolean fullyOccupied;
	private Bed[] beds;
	private Student[] tenantList; //tenant 
	
	// constructors:
	
	Room(int bedCount){ //to do 
		this(countRooms, bedCount);
	}
	Room(int roomNumber, int bedCount){
		countRooms++;
		this.roomNumber = roomNumber;
		this.tenantList = new Student[bedCount];
		this.bedCount = bedCount;
		buildBeds(bedCount);
	}
	
	// methods:
	public void accommodateStudent(Student student) {
		for (int i =0; i<tenantList.length; i++) {
			if (tenantList[i]==null) {
				tenantList[i]=student;
				System.out.println(student + " is assigned room "+ roomNumber);
				if (i == (tenantList.length-1)) {
					System.out.println("Room " + roomNumber + " is full!");
				}
			return;	
			}
		}
		System.out.println("Room " + roomNumber + " is full!");
		System.out.println();
	}
	
	public int getNumberOfUnoccupiedBeds() {
		int counter =0;
		for (Student tenant : tenantList) {
			if (tenant == null) {
				counter++;
			}
		}
		return counter;
	}
	
	void buildBeds(int bedCount) {
		beds = new Bed [bedCount];
		for (int i =0; i<bedCount; bedCount++) {
			beds[i]=new Bed(bedNumber);
			bedNumber++;
		}
	}
	
	
	public String toString() {
		return("Room number " + roomNumber + " has " + beds.length + " beds" );
	}
	
	void assignBed() {
		
	}
	public Bed[] getBeds() {
		return beds;
	}
	
	
	
	
	// getters and setters: 

	
}
