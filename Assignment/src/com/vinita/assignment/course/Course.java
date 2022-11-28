package com.vinita.assignment.course;

interface Course {

	public String addCourse() ;

	public void viewCourse(CourseVo vo);

	public CourseVo addFee(CourseVo vo) throws AddFeeException;

}
