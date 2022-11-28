package com.vinita.assignment.course;

public class CourseVo {
	String coursename;
	int discount;
	double coursefee;
	double discountedcoursefee;
	
	
	
	public CourseVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CourseVo(String coursename, int discount, double coursefee, double discountedcoursefee) {
		super();
		this.coursename = coursename;
		this.discount = discount;
		this.coursefee = coursefee;
		this.discountedcoursefee = discountedcoursefee;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public double getCoursefee() {
		return coursefee;
	}
	public void setCoursefee(double coursefee) {
		this.coursefee = coursefee;
	}
	public double getDiscountedcoursefee() {
		return discountedcoursefee;
	}
	public void setDiscountedcoursefee(double discountedcoursefee) {
		this.discountedcoursefee = discountedcoursefee;
	}
	@Override
	public String toString() {
		return "CourseVo [coursename=" + coursename + ", discount=" + discount + ", coursefee=" + coursefee
				+ ", discountedcoursefee=" + discountedcoursefee + "]";
	}
	
	
	

}
