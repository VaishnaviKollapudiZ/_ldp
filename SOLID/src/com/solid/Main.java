package com.solid;

//import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

//        Employee emp1 = new PermanentEmployee("Vakula", 1, 55000);
//        System.out.println(emp1);

        ArrayList<WageDetailsInterface> empList = new ArrayList<>();
        empList.add(new PermanentEmployee("Arjun",1,65000));
        empList.add(new TemporaryEmployee("Vakula",2,47000));
        empList.add(new Intern("Dharma",3,25000));

        for(WageDetailsInterface emp : empList){
            System.out.println(emp.getMinimumWage());
        }

        //FACTORY METHOD
//
//        MesssageFactory messsageFactory = new MesssageFactory();
//        MessageTransfer messageTransfer = MesssageFactory.sendMessageVia("EMAIL");
//        emp1.sendMail(messageTransfer);


//        MessageTransfer messageTransfer = new MailSender();
//        emp1.sendMail(messageTransfer);
//        MessageTransfer messageTransfer = new PhoneMessage();
//        emp1.sendMail(messageTransfer);



    }
}
























//        ArrayList<WageDetailsInterface> empList = new ArrayList<>();
//        empList.add(new PermanentEmployee("Hema",3,58000));
//        empList.add(new TemporaryEmployee("Vennela",4,47000));
//        empList.add(new Intern("Rudra",5,20000));

//        for(WageDetailsInterface emp: empList){
//            System.out.println(emp);
//            System.out.println("Employee minimum wage = "+emp.getMinimumWage());
//            System.out.println();
//        }



