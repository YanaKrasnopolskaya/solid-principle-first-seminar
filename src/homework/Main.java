package homework;

import homework.persister.Persisterable;
import homework.persister.impl.Persister;
import homework.report.impl.UserReport;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        Persisterable persister = new Persister();
        UserReport userReport = new UserReport();
        persister.save(user);
        userReport.report(user);
    }
}