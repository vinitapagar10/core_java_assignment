import java.util.Comparator;

public class StudentGradeCompare implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
	

		return o1.grade.compareTo(o2.grade);
	
	}

}
