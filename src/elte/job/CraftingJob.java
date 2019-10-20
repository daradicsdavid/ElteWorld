package elte.job;

import elte.person.Crafter;
import elte.person.Person;

public class CraftingJob extends Job {
    public CraftingJob(String name) {
        super(name);
    }

    @Override
    public final void complete(Person person) {
        if (person instanceof Crafter && !person.isWorking()) {
            complete = true;
        } else {
            throw new Error("This person cannot complete this job!");
        }
    }

    @Override
    public String toString() {
        return "crafting job " + super.toString();
    }
}
