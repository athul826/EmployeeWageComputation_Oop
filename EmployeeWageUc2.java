package com.bridgelabz;

public class EmployeeWageUc2 {
	int IS_PRESENT = 1;
    int WAGE_PER_HR = 20;
    int FULL_DAY_HR = 8;

    public boolean checkIsPresent(double empCheck){
        if(empCheck == IS_PRESENT){
            return true;
        }
        else{
            return false;
        }
    }
    public int calcDailyEmpWage(){
        int dailyEmpWage =  WAGE_PER_HR * FULL_DAY_HR;
        return dailyEmpWage;
    }

	public static void main(String[] args) {
		EmployeeWageUc2 emp = new EmployeeWageUc2();
        double empCheck = Math.floor (Math.random() * 10) % 2;
        if(emp.checkIsPresent(empCheck)){
           
            System.out.println("Daily Employee Wage :" +  emp.calcDailyEmpWage());
        }
        else{
            System.out.println("Employee is absent");

	}

	}
}
