
public class Faculty {
	private int ID;
	private String name;
	private String surname;
	private String departmentName;
	private AssignInfo[] assignInfoList;
	
	public Faculty() {
		
	}
	
	public Faculty(int id,String name,String surname,String departmentName) {
		
	}
	
	public boolean withdrawAssignInfo(Course course) {
		
	}
	
	public void addAssignInfo(AssignInfo assisgnInfo) {
		
	}
	
	public void printCourseList() {
		
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public AssignInfo[] getAssignInfoList() {
		return assignInfoList;
	}

	public void setAssignInfoList(AssignInfo[] assignInfoList) {
		this.assignInfoList = assignInfoList;
	}
	
	

}
