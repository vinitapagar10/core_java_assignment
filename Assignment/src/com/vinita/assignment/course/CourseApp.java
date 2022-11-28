package com.vinita.assignment.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseApp {

	public static void main(String[] args) {

		System.out.println("Enter number of Math Courses");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		List<CourseVo> courselist = new ArrayList<CourseVo>();

		Course obj = new MathCourse();
		try {
			for (int index = 0; index < num; index++) {

				CourseVo vo = new CourseVo();
				vo.coursename = obj.addCourse();
				vo = obj.addFee(vo);
				
				courselist.add(vo);

			}
		} catch (AddFeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Enter number of English Courses");
		sc = new Scanner(System.in);
		num = sc.nextInt();

		obj = new EnglishCourse();
		try {
			for (int index = 0; index < num; index++) {

				CourseVo vo = new CourseVo();
				vo.coursename = obj.addCourse();
				vo = obj.addFee(vo);
				courselist.add(vo);

			}
		} catch (AddFeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Course Details  Are as follows With Discount and Without Discount");
		System.out.println("CourName" + "  " + "CourseFee" + "  " + "Discount(%)" + "  " + "Doscounted CourseFee");
		for (CourseVo vo : courselist) {
			obj.viewCourse(vo);

		}

	}

}
