package ua.kpi.fpm.pma.oop.lecture7.badexperience;

public class ToBeNotified1 {
    public void notifyAboutUpdate(Subject subject, String newState) {
        System.out.println("object1 notified that Subject: " + subject + " updated with new state: \"" + newState + "\"");
    }
}
