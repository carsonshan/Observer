package ua.kpi.fpm.pma.oop.lecture7.observer;

public class ObserverExampleRunner {
    public static void main(String[] args) {
        MessageDataVO dataVO = new MessageDataVO();
        //create Observers for above dataVo object
        dataVO.addObserver(new MessageUIObserver());
        dataVO.addObserver(new MessagSaveObserver());
        dataVO.addObserver(new MessageLogObserver());
        //now all observers are registered for receiving message updates.
        //now we will change the message in dataVO
        dataVO.setMessage("This is Observer test message");
        //all Observers will receive this message via notification
    }
}
