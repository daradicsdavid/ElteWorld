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
            Person person = findPersonForJob(job);
            job.complete(person);
            person.setWorking();
            logger.log(person + " completed " + job + "!");
        }

        for (Person person : people) {
            if (!person.isWorking()) {
                logger.log(person + " did not work!");
            }
        }

        if (jobs.stream().anyMatch(job -> !job.isComplete())) {
            throw new Error("Jobs are not completed!");
        }
    }

    private Person findPersonForJob(Job job) {
        for (Person person : people) {
            if (!person.isWorking() && canDoJob(person, job)) {
                return person;
            }
        }
        throw new Error("Job cannot be completed!");
    }

    private static boolean canDoJob(Person person, Job job) {
        return (person instanceof Gardener && job instanceof GardeningJob)
                || (person instanceof Crafter && job instanceof CraftingJob);
    }


}
