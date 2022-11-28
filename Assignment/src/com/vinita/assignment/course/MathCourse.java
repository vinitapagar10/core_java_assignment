package com.vinita.assignment.course;

import java.util.Scanner;

class MathCourse implements Course {
	String Coursename;

	@Override
	public String addCourse() { // TODO Auto-generated method stub

		System.out.println("Enter Math Course Name:");
		Scanner sc1 = new Scanner(System.in);
		String coursename = sc1.next();

		return coursename;

	}

	@Override
	public void viewCourse(CourseVo vo) {
		// TODO Auto-generated method stub

		System.out.println(vo.getCoursename() + " " + vo.getCoursefee() + "  " + vo.getDiscount() + "  "
				+ vo.getDiscountedcoursefee());

	}

	@Override
	public CourseVo addFee(CourseVo vo) throws AddFeeException {
		// TODO Auto-generated method stub

		System.out.println("Enter Course Fee:");
		Scanner sc2 = new Scanner(System.in);
		double coursefee = sc2.nextDouble();
		vo.coursefee = coursefee;
		if (coursefee >= 500 && coursefee <= 1000) {
			vo.discount = 0;
			vo.discountedcoursefee = coursefee;
		} else if (coursefee > 1000 && coursefee <= 2000) {
			System.out.println("Here You Will get 10% Discount");
			double discount = (coursefee * 10) / 100;
			coursefee = coursefee - discount;
			vo.discount = 10;
			vo.discountedcoursefee = coursefee;
			System.out.println("CurrentDiscount is" + (discount));
		} else if (coursefee<500 || coursefee > 2000 ) {
			throw new AddFeeException("Course fee below 500 and above 2000 is not allowed");
		}

		return vo;

	}

}