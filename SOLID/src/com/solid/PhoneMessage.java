package com.solid;

import java.util.Scanner;
public class PhoneMessage implements MessageTransfer{

    Scanner in = new Scanner(System.in);
    private String receiverPhoneNumber;
    private String messageContent;

    public void getReceiver(){
        System.out.println("\nEnter receiver phone number =  ");
        this.receiverPhoneNumber = in.nextLine();
    }

    @Override
    public void getMessageContent() {
        System.out.println("\nEnter message= ");
        this.messageContent = in.nextLine();
    }

    @Override
    public void sentMessageConfirmation() {
        System.out.println("\nMessage sent to "+receiverPhoneNumber);
    }


}
