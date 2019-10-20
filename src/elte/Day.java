package elte;

import elte.io.FileLogger;
import elte.job.Job;
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
            //EXERCISE: Find a person who can complete the job and make them do it. (Gardener->GardeningJob, Crafter->CraftingJob)
            //EXERCISE: Log completed job and the person who completed it. example: 'Joe completed gardening job weeding'
        }
        //EXERCISE: Log every person who did not work on any job

        if (jobs.stream().anyMatch(job -> !job.isComplete())) {
            throw new Error("Jobs are not completed!");
        }
    }


}
