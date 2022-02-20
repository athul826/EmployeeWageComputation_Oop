package com.bridgelabz;

public class Main {

	public static void main(String[] args) {
		
		EmployeeWage emp = new EmployeeWage(20,20);
		int wage = emp.calcMonthlyWage();
		System.out.println("Monthly wage :"+ wage);
		
		EmployeeWage emp1 = new EmployeeWage(20,20);
		int wage1 = emp1.calcDailyEmpWage(1);
		System.out.println("dailyWage :"+ wage1);
		
		

	}

}
