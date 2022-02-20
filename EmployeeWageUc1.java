package com.bridgelabz;

public class EmployeeWageUc1 {
	static void isPresent(double empCheck) {
	int IS_PRESENT = 1;
	if(empCheck == 1) {
		System.out.println("Employee is Present");
	} else
		System.out.println("Employee is Absent");
	}

	public static void main(String[] args) {
		EmployeeWageUc1 emp = new EmployeeWageUc1();
		double empCheck = Math.floor(Math.random() * 10) %2;
		emp.isPresent(empCheck);

	}

}
