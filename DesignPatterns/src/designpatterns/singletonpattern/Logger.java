package designpatterns.singletonpattern;

import java.io.*;

public class Logger {

    private final String logFile = "logFile.txt";
    PrintWriter writer;
    //private static Logger logger = null;

    private Logger(){
        try{
            FileWriter fw = new FileWriter(logFile);
            writer = new PrintWriter(fw,true);
        }catch(IOException e){}
    }
//    public static synchronized Logger getInstance(){
//        if(logger == null)
//            logger = new Logger();
//        return logger;
//    }

    //Bill Pugh
    private static class SingletonHelper{
        private static final Logger INSTANCE = new Logger();
    }

    public static Logger getInstance(){
        return SingletonHelper.INSTANCE;
    }
    public void logWithdraw (String account, double amount) {
        writer.println("WITHDRAW ("+ account +"):"+ "Rs. "+amount);
    }
    public void logDeposit (String account, double amount) {
        writer.println("DEPOSIT ("+ account + "): " + "Rs. "+amount);
    }
    public void logTransfer (String fromAccount, String toAccount, double amount) {
        writer.println("TRANSFER (" + fromAccount + "->" + toAccount + "): " + "Rs. "+amount );
    }




}
