
public class Teacher extends Person {
	String subject;
	double salary;
	public Teacher(String name, int age, String gender, String sub, double sal) {
		super(name, age, gender);
		subject = sub;
		salary = sal;	
	}
	
	//Getters and setters
	public double getSalary(){
		return salary;
	}
	public String getSubject(){
		return subject;
	}
	public void setSalary(double s){
		salary = s;
	}
	public void setSubject(String s){
		subject = s;
	}
	
	//Uses super to do things done before.
	public String toString(){
		return super.toString() + ", Salary: " + salary + ", Subject: " + subject;
	}

}
