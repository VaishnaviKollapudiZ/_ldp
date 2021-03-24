package com.solid;

public class PermanentEmployee extends Employee implements PayrollInterface, WageDetailsInterface {

    static final String EMP_STATUS = "Permanent Employee";
    public PermanentEmployee(){}

    public PermanentEmployee(String empName,int empId,double empSalary){
        super(empName,empId,empSalary);
    }

    public double getBonus(){
        return 0.2*getEmpSalary();
    }

    @Override
    public double getMinimumWage() {
        return 50000;
    }

    public String toString(){
        return "Employee ID = "+getEmpId()+"\nEmployee Status = "+EMP_STATUS+"\nEmployee Name = "+getEmpName()+ "\nEmployee Salary = "+getEmpSalary()+"\nEmployee Bonus = "+getBonus();
    }
}
