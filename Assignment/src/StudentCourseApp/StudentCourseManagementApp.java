package StudentCourseApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class StudentCourseManagementApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.println("Enter number of Math Courses"); 
		 Scanner sc = new
		 Scanner(System.in); int num = sc.nextInt();
		 
		List<StudentCourse > courselist = new ArrayList<StudentCourse>();
		
		CourseManagement obj = new StudMathCourse();
		try {
			for (int index = 0; index < num; index++) {

				StudentCourse cs = new StudentCourse();
				cs.coursename = obj.addCourse();
				cs =  obj.addFee(cs);
				
				courselist.add(cs);

			}
		} catch (AddFeeException1 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		System.out.println("Enter number of English  Courses");
		 sc = new Scanner(System.in);
		num = sc.nextInt();

		 obj = new StudEnglishCourse();
		try {
			for (int index = 0; index < num; index++) {

				StudentCourse cs = new StudentCourse();
				cs.coursename = obj.addCourse();
				cs =  obj.addFee(cs);
				
				courselist.add(cs);

			}
		} catch (AddFeeException1 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Course Details  Are as follows With Discount and Without Discount");
		System.out.println("CourseName" + "  " + "CourseFee" + "  " + "Discount(%)" + "  " + "Discounted CourseFee");
		for (StudentCourse cs : courselist) {
			obj.viewCourse(cs);


	}

}

	}


