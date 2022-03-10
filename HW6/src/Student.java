
public class Student {
	private String name;
	private String surname;
	private String major;
	private int ID;
	private int year;
	private RegisterInfo[] registerList;
	
	public Student() {
		
	}
	
	public Student(String name,String surname,String major,int ID,int year) {
		this.name=name;
		this.surname=surname;
		this.major=major;
		this.ID=ID;
		this.year=year;
	} 
	
	public void addRegisterInfo(RegisterInfo registerInfo) {
		for (int i=0;i<registerList.length;i++) {
			if(registerList[i]==null)
				registerList[i]=registerInfo;
			else
				registerList[i+1]=registerInfo;
		}
		
	}
	
	public boolean removeRegisterInfo(Course course) {
		
		
	}
	
	public void printCourseList() {
		
	}
	
	public int getTotalCredit() {
		
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

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public RegisterInfo[] getRegisterList() {
		return registerList;
	}

	public void setRegisterList(RegisterInfo[] registerList) {
		this.registerList = registerList;
	}
	
	

}
