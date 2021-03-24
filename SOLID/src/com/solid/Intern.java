package com.solid;

public class Intern extends Employee implements WageDetailsInterface {

    static final String EMP_STATUS = "Intern";
    public Intern(){}

    public Intern(String empName, int empId, double empSalary){
        super(empName,empId,empSalary);
    }
    @Override
    public double getMinimumWage() {
        return 15000;
    }

    public String toString(){
        return "Employee ID = "+getEmpId()+"\nEmployee Status = "+EMP_STATUS+"\nEmployee Name = "+getEmpName()+ "\nEmployee Salary = "+getEmpSalary()+"\nIntern gets no bonus.";
    }
}
