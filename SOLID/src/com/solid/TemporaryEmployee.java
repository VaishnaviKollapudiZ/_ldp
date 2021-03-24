package com.solid;

public class TemporaryEmployee extends Employee implements PayrollInterface, WageDetailsInterface {

    static final String EMP_STATUS = "Temporary Employee";
    public TemporaryEmployee(){}

    public TemporaryEmployee(String empName,int empId,double empSalary){
        super(empName,empId,empSalary);
    }

    public double getBonus(){
        return 0.1*getEmpSalary();
    }
    public String toString(){
        return "Employee ID = "+getEmpId()+"\nEmployee Status = "+EMP_STATUS+"\nEmployee Name = "+getEmpName()+ "\nEmployee Salary = "+getEmpSalary()+"\nEmployee Bonus = "+getBonus();
    }
    @Override
    public double getMinimumWage() {
        return 40000;
    }
}
