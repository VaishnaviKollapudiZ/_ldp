package com.solid;

import java.util.Scanner;

public class MailSender implements MessageTransfer{

    Scanner in  =new Scanner(System.in);
    private String messageContent;
    private String receiverMail;
    public void getReceiver(){
        System.out.println("\nEnter receiver mail id= ");
        this.receiverMail = in.nextLine();
    }

    @Override
    public void getMessageContent() {
        System.out.println("\nEnter mail content= ");
        this.messageContent = in.nextLine();
    }

    @Override
    public void sentMessageConfirmation() {
        System.out.print("sent an email to "+receiverMail);
    }
}
