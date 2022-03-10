
public class Course {
	private String department;
	private String name;
	private int credits;
	private int prereqYear;
	private int maxEnrollment;
	private int reservedStates;
	private Student[] studentList;
	private Student[] replacementList;
	private Faculty instructor;
	
	public Course() {
		
	}
	
	public Course(String deparment,String name,int credits,int prereqYear,int maxEnrollment,int reservedSeats) {
		
	}
	public RegisterInfo registerCourse(Student std) {
		
	}
	
	public AssignInfo assignInstructor(Faculty instructor,boolean force) {
		
	}
	
	public void registerReplacementList() {
		
	}
	
	public void printStudentList() {
		
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public int getPrereqYear() {
		return prereqYear;
	}
	public void setPrereqYear(int prereqYear) {
		this.prereqYear = prereqYear;
	}
	public int getMaxEnrollment() {
		return maxEnrollment;
	}
	public void setMaxEnrollment(int maxEnrollment) {
		this.maxEnrollment = maxEnrollment;
	}
	public int getReservedStates() {
		return reservedStates;
	}
	public void setReservedStates(int reservedStates) {
		this.reservedStates = reservedStates;
	}

	public Student[] getStudentList() {
		return studentList;
	}

	public void setStudentList(Student[] studentList) {
		this.studentList = studentList;
	}

	public Student[] getReplacementList() {
		return replacementList;
	}

	public void setReplacementList(Student[] replacementList) {
		this.replacementList = replacementList;
	}

	public Faculty getInstructor() {
		return instructor;
	}

	public void setInstructor(Faculty instructor) {
		this.instructor = instructor;
	}
	
	
}
