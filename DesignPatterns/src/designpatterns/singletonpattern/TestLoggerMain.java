package designpatterns.singletonpattern;//Creational Design Pattern

//MAIN METHOD
public class TestLoggerMain {
    public static void main(String[] args){

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        Logger logger3 = Logger.getInstance();
        logger1.logDeposit("0001", 80);
        logger2.logWithdraw("0002", 100);
        logger1.logTransfer("0001", "0003", 40);
        logger3.logDeposit("0004", 60);
        logger2.logWithdraw("0005", 30);

    }
}
