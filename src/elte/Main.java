package elte;

import elte.io.FileLogger;
import elte.job.Job;
import elte.person.Person;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Integer gardeningJobs = 5;
        Integer craftingJobs = 7;
        List<Job> jobs = Generator.generateJobs(gardeningJobs, craftingJobs);
        List<Person> people = Generator.generateWorkers(gardeningJobs, craftingJobs);
        new Day(jobs, people).complete();

        FileLogger.getInstance().close();
    }
}
