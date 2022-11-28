
public class Student {
	
	 
	 String sname;
	 int marks;
	 String grade;
	public Student(String sname, int marks, String grade) {
		super();
		this.sname = sname;
		this.marks = marks;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", marks=" + marks + ", grade=" + grade + "]";
	}
	
}
