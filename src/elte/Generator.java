package elte;

import elte.job.CraftingJob;
import elte.job.GardeningJob;
import elte.job.Job;
import elte.person.Crafter;
import elte.person.Gardener;
import elte.person.Person;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Generator {

    static List<Job> generateJobs(Integer gardeningJobs, Integer craftingJobs) {
        Stream<GardeningJob> gardeningJobStream = IntStream.range(0, gardeningJobs)
                .mapToObj(GardeningJob::new);

        Stream<CraftingJob> craftingJobStream = IntStream.range(0, craftingJobs)
                .mapToObj(CraftingJob::new);
        List<Job> jobs = Stream.concat(gardeningJobStream, craftingJobStream).collect(Collectors.toList());
        Collections.shuffle(jobs);
        return jobs;
    }

    static List<Person> generateWorkers(Integer gardeningJobs, Integer craftingJobs) {
        Stream<Person> gardenerStream = IntStream.range(0, gardeningJobs)
                .mapToObj(i -> new Gardener("gardener " + i));

        Stream<Person> crafterStream = IntStream.range(0, craftingJobs)
                .mapToObj(i -> new Crafter("crafter " + i));
        List<Person> people = Stream.concat(gardenerStream, crafterStream).collect(Collectors.toList());
        Collections.shuffle(people);
        return people;
    }


}
