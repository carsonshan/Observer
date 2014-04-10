package ua.kpi.fpm.pma.oop.lecture7.badexperience;

public class ToBeNotified2 {
    public void notifyAboutUpdate(Subject subject, String newState) {
        System.out.println("object2 notified that Subject: " + subject + " updated with new state: \"" + newState + "\"");
    }
}
