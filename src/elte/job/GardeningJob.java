package elte.job;

import elte.person.Gardener;
import elte.person.Person;

import java.util.Objects;

public class GardeningJob extends Job {
    public GardeningJob(Integer id) {
        super(id);
    }

    @Override
    public final void complete(Person person) {
        if (person instanceof Gardener && !person.isWorking()) {
            complete = true;
        } else {
            throw new Error("This person cannot complete this job!");
        }
    }

    @Override
    public String toString() {
        return "gardening job " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GardeningJob)) return false;
        GardeningJob job = (GardeningJob) o;
        return Objects.equals(id, job.id);
    }
}
