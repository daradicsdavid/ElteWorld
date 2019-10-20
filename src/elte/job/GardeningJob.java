package elte.job;

import elte.person.Gardener;
import elte.person.Person;

public class GardeningJob extends Job {
    public GardeningJob(String name) {
        super(name);
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
}
