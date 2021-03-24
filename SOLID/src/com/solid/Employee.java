package com.solid;

public class Employee /*implements PayrollInterface*/ {

    private String empName;
    private int empId;
    private double empSalary;
    //private MailSender mail;
    public Employee(){

    }
    public Employee(String empName,int empId,double empSalary){
        this.empName = empName;
        this.empId = empId;
        this.empSalary = empSalary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }


    public void sendMail(MessageTransfer messageTransfer){


        messageTransfer.getReceiver();
        messageTransfer.getMessageContent();
        System.out.println(getEmpName());messageTransfer.sentMessageConfirmation();
    }

//    @Override
//    public double getBonus() {
//        return 0.05*getEmpSalary();
//    }


    //O : Open for extension, closed for modification
    //If i want to add bonus according to the employment status, whether permanent employee/temporary employee then
    //i would have declared private String empStatus; add it into the constructor and addBonus method would become
    //    public double addBonus(){
    //        double bonus;
    //        if(empGetStatus == "Permanent Employee"{
    //           bonus = 0.2*getEmpSalary();
    //        }
    //        else{
    //           bonus = 0.1*getEmpSalary();
    //        }
    //        return bonus;
    //    }
    //    This is a violation of 'O'
        /*So we create a new BonusInterface (addBonus() method) and Employee class implements it
        new classes permanent employee,temporary employee extend Employee*/


    /* L - Liskov Substitution Principle
    * But say if we have Intern who extends Employee class, and intern doesn't get any bonus.
    * So, inside the addBonus(), if we throw an exception that violates 'L'
    * So when we create
    * Employee emp3 = new Intern(......), this would not work.
    *
    * So we create a new Interface MinimumWage and make Intern class implement
    * it, and BonusInterface is implemented by Permanent and temporary employee.
    *
    *
    * */

    //D : Dependency Inversion principle
    // sendEmail() in employee depends upon the concrete Email class.We don't want to send a mail, instead want to
    //send a phone message, then we will have change the entire email to message, instead we can create a Imessage
    //interface, which has the method sendMessage().
    //employee sending a mail is another concern, so it should be considered in another class.
//    public void sendEmail(Email email){
//        System.out.println(getEmpName()+" sent a mail to "+email.getReceiverName());
//    }
    public String toString(){
        return "Employee ID = "+empId+"\nEmployee Name = "+empName+ "\nEmployee Salary = "+empSalary;
    }
//    public void sendMail(){
//
//    }
//

}
