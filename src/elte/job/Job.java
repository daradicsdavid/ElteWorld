package elte.job;

import elte.person.Person;

public abstract class Job {
    boolean complete = false;
    final Integer id;

    Job(Integer id) {
        this.id = id;
    }

    public abstract void complete(Person person);

    public boolean isComplete() {
        return complete;
    }


    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
