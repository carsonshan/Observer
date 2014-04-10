package ua.kpi.fpm.pma.oop.lecture7.observer;

import java.util.Observable;

public class MessageDataVO extends Observable {
    private String message;

    public void setMessage(String message) {
        this.message = message;
        setChanged();
        notifyObservers(message);
    }

    public String getMessage() {
        return message;
    }
}
