import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> stdlist = new ArrayList<>();

		stdlist.add(new Student("Reshma", 90, "A"));
		stdlist.add(new Student("Reyansh", 80, "A"));
		stdlist.add(new Student("Ronil", 70, "B"));
		stdlist.add(new Student("Vinita", 50, "C"));
		//stdlist.add(new Student("Reshma", 70, "A"));
		System.out.println("Here is My List Before Sorting");
		System.out.println("");
		//System.out.println("Name" + "  " + " Marks" + "  " + "Grade"+"  ");
		for (Student o : stdlist) {

			System.out.println("Name:   "+ o.sname +"    "+ "Marks:   " +  o.marks+"    " + "Grade:   " +  o.grade);
		}
	
		while (true) {
			System.out.println("Student Application List");
			System.out.println("1.View Student Name");
			System.out.println("2.View Student Marks");
			System.out.println("3.View Student Grade");
			System.out.println("4.View Student Name,Marks,Grade");
			System.out.println("Select Option");
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			switch (i) {

			case 1:
				System.out.println("All the Student Name Display in sorting Order");
				Collections.sort(stdlist, new StudentNameCompare());
				for (Student o : stdlist) {

					System.out.println(o.sname);
				}
				break;

			case 2:
				System.out.println("All the Student Marks Display in sorting Order");
				Collections.sort(stdlist, new StudentMarkCompare());
				for (Student o : stdlist) {

					System.out.println(o.marks);
				}
				break;

			case 3:
				System.out.println("All the Student Grade Display in sorting Order");
				Collections.sort(stdlist, new StudentGradeCompare());
				for (Student o : stdlist) {

					System.out.println(o.grade);
				}
				break;
			case 4:
				System.out.println("All The Students Sorting Along with Name,Marks and Grade");
				Collections.sort(stdlist, new StudentNameCompare()
						.thenComparing(new StudentMarkCompare().thenComparing(new StudentGradeCompare())));
				for (Student o : stdlist) 
				{

					System.out.println(o.sname+" "+o.marks+" "+o.grade);
				}
			break;
			
			case 5:System.exit(0);
			
			
			}
		}

	}
}