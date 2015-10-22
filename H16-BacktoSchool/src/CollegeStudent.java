

public class CollegeStudent extends Student {
	String major;
	int year;
	public CollegeStudent(String name, int age, String gender, String idNum,
			double gpa, int year, String major) {
		super(name, age, gender, idNum, gpa);
	}
	
	public int getYear(){
		return year;
	}
	
	public String getMajor(){
		return major;
	}
	
	public void setYear(int y){
		year = y;
	}
	public void setMajor(String m){
		major = m;
	}
	
	public String toString(){
		return super.toString() + ", Year: " + getYear() + ", Major: " + getMajor();
	}

}
