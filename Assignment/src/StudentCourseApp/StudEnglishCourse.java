package StudentCourseApp;

import java.util.Scanner;

import com.vinita.assignment.course.AddFeeException;

public class StudEnglishCourse implements CourseManagement{

	@Override
	public String addCourse() {
		// TODO Auto-generated method stub
		System.out.println("Enter English Course Name:");
		Scanner sc1 = new Scanner(System.in);
		String coursename = sc1.next();

		return coursename;

		
	}

	@Override
	public void viewCourse(StudentCourse cs) {
		// TODO Auto-generated method stub
		
		System.out.println(cs.getCoursename()+" "+cs.getCoursefee()+" "+cs.getDiscount()+"% "+cs.getDiscountedcoursefee());
		
		
	}

	@Override
	public StudentCourse addFee(StudentCourse cs) throws  AddFeeException1 {
		// TODO Auto-generated method stub
		System.out.println("Enter Course Fee:");
		Scanner sc2 = new Scanner(System.in);
		double coursefee = sc2.nextDouble();
		cs.coursefee = coursefee;
		if (coursefee >= 500 && coursefee <= 1000) {
			cs.discount = 0;
			cs.discountedcoursefee = coursefee;
		} else if (coursefee > 1000 && coursefee <= 2000) {
			System.out.println("Here You Will get 10 percent Discount");
			double discount = (coursefee * 10) / 100;
			coursefee = coursefee - discount;
			cs.discount = 10;
			cs.discountedcoursefee = coursefee;
			System.out.println("CurrentDiscount is" + (discount));
		} else if (coursefee<500 || coursefee > 2000 ) {
			throw new AddFeeException1("Course fee Can not be Applicable below 500 and above 2000 is not allowed");
		}
		return cs;

		
	}

}
