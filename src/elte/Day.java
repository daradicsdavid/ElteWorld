package elte;

import elte.io.FileLogger;
import elte.job.CraftingJob;
import elte.job.GardeningJob;
import elte.job.Job;
import elte.person.Crafter;
import elte.person.Gardener;
import elte.person.Person;

import java.util.List;

class Day {
    private FileLogger logger = FileLogger.getInstance();
    private final List<Job> jobs;
    private final List<Person> people;

    Day(List<Job> jobs, List<Person> people) {
        this.jobs = jobs;
        this.people = people;
    }

    final void complete() {
        for (Job job : jobs) {
            //EXERCISE: Find a person who is not working and can do the job.
            // Then after the person finished the job, log: person finished job! (use toString())
            // Gardener -> GardeningJob
            // Crafter -> CraftingJob
        }

        //EXERCISE: Log every person who did not work: person did not work! (use toString())

        GardeningJob search = new GardeningJob(1);
        //EXERCISE: Find job that equals search in the job list (override and use equals())

        if (jobs.stream().anyMatch(job -> !job.isComplete())) {
            throw new Error("Jobs are not completed!");
        }
    }


}
