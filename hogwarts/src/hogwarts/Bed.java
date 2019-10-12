package hogwarts;

public class Bed {
	
	
	
	// instance variables:
	
	private int bedNumber;
	private boolean isOccupied;
	private String studentName;
	
	// constructors:

	Bed(int bedNumber, boolean isOccupied, String studentName) {
		this.bedNumber = bedNumber;
		this.isOccupied = isOccupied;
		this.studentName = studentName;
	}

	Bed(int bedNumber) { // default value on creation is unoccupied and student name = null
		this(bedNumber, false, "");
		
	}
	
	public String toString() {
		if (isOccupied) {
			return("This bed is occupied, it belongs to " + getStudentName());
		} else {
			return("This bed is unoccupied.");
		}
	
	}

	// getters and setters:
	
	public void setOccupied(boolean isOccupied) {
		this.isOccupied = isOccupied;
	}

	public boolean isOccupied() {
		return isOccupied;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studententName) {
		this.studentName = studententName;
	}

}
