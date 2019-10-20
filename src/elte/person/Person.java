package elte.person;

public abstract class Person {

    private final String name;
    private boolean working = false;

    Person(String name) {
        this.name = name;
    }


    public boolean isWorking() {
        return working;
    }

    public void setWorking() {
        this.working = true;
    }

    @Override
    public String toString() {
        return name;
    }
}
