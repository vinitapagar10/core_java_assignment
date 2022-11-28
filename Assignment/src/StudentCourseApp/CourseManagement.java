package StudentCourseApp;

interface CourseManagement {
	public String addCourse() ;

	public void viewCourse(StudentCourse cs);

	public StudentCourse addFee(StudentCourse cs) throws AddFeeException1;
}
