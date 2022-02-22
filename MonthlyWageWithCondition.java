package com.bridgelabz;

	public class MonthlyWageWithCondition {
		
		final int IS_PRESENT = 1;
		final int FULL_TIME = 1;
		int FULL_DAY_HR= 16;
		int workingDays;
		int wagePerHr;
		int totalAttendance = 0;
		int totalHr = 0;
    
    public  MonthlyWageWithCondition(int workingDays , int wagePerHr){
    	this.workingDays = workingDays;
        this.wagePerHr = wagePerHr;
    }
    public MonthlyWageWithCondition() {
		
	}
	public boolean checkIsPresent(int empCheck){
        if(empCheck == IS_PRESENT){ 
            totalAttendance++;
            return true;
        }
        else{ 
            return false;
        }
    }
    public int calcDailyEmpWage(int empType){

        int dailyEmpWage = 0;
        switch(empType){
            case  FULL_TIME :
                totalHr += FULL_DAY_HR;
                dailyEmpWage =  wagePerHr * FULL_DAY_HR;
            break;
            default :
                totalHr += FULL_DAY_HR / 2; 
                dailyEmpWage = dailyEmpWage / 2;
        }
        return dailyEmpWage;
    }
    public int calcMonthlyWage(){

        int monthlyWage = 0;
        int dailyWage;
    
        while(totalAttendance <=20 && totalHr <=100){
            for(int day = 1; day<=workingDays; day++){
                int empCheck = (int)(Math.random() * 10) % 2;
                if(checkIsPresent(empCheck)){
                    int empType = (int)(Math.random() * 10) % 2;
                    dailyWage = calcDailyEmpWage(empType);   
                    monthlyWage += dailyWage;
                }
            }
        }
        return monthlyWage;
    }

	public static void main(String[] args) {
		
		MonthlyWageWithCondition emp = new MonthlyWageWithCondition(20 , 20);
		int wage = emp.calcMonthlyWage();
		System.out.println("Monthly wage :" + wage);

	}

}
