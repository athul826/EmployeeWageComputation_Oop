package com.bridgelabz;

public class EmployeeWageSwitchCase {
	final int IS_PRESENT = 1;
    final int FULL_TIME = 1;
    int wagePerHr = 20;
    int fullDayHr = 16;
    
    public boolean IsPresent(int empCheck){
        if(empCheck == IS_PRESENT){ 
            return true;
        }
        else { 
            return false;
        }
    }
    public void calcDailyEmpWage(int empType){
        int dailyEmpWage =  wagePerHr * fullDayHr;
        switch(empType) {
            case  FULL_TIME : 
                System.out.println("Employee Type : Full time");
                System.out.println("Daily Employee Wage :" + dailyEmpWage);
            break;
            default : 
                System.out.println("Employee Type : Part time");
                System.out.println("Daily Employee Wage :" + (dailyEmpWage / 2));
        }
        }

	public static void main(String[] args) {
		EmployeeWageSwitchCase emp = new EmployeeWageSwitchCase();
		int empCheck =(int)(Math.random() * 10 ) %2;
		int empType =(int)(Math.random() * 10 ) %2;
		if(emp.IsPresent(empCheck)) {
			emp.calcDailyEmpWage(empType);
		}
		else {
			System.out.println("Employee is Absent");
		}

	}

}
