package elte.job;

import elte.person.Person;

public abstract class Job {
    boolean complete = false;
    private final String name;

    Job(String name) {
        this.name = name;
    }

    public abstract void complete(Person person);

    public boolean isComplete() {
        return complete;
    }


    @Override
    public String toString() {
        return name;
    }
}
