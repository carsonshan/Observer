package ua.kpi.fpm.pma.oop.lecture7.badexperience;

public class BadExperienceRunner {
    public static void main(String[] args) {
        ToBeNotified1 object1 = new ToBeNotified1();
        ToBeNotified2 object2 = new ToBeNotified2();
        ToBeNotified3 object3 = new ToBeNotified3();
        ToBeNotified4 object4 = new ToBeNotified4();
        ToBeNotified5 object5 = new ToBeNotified5();

        Subject subject = new Subject("old state");
        subject.setState("new state");
        object1.notifyAboutUpdate(subject, "new state");
        object2.notifyAboutUpdate(subject, "new state");
        object3.notifyAboutUpdate(subject, "new state");
        object4.notifyAboutUpdate(subject, "new state");
        object5.notifyAboutUpdate(subject, "new state");
    }
}
