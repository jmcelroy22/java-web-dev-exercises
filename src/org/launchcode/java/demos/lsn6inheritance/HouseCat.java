package org.launchcode.java.demos.lsn6inheritance;

public class HouseCat extends Cat {
    private String name;
    private String species = "Felis catus";


    public HouseCat(String aName, double aWeight) {
        super(aWeight);
        //super allows the subclass to access the constructor from the base class.
        //The call to the base class constructor must be the first line of the
        //subclass constructor. subclass constructor extends the original constructor
        //by setting an additional property "name"
        name = aName;
    }

    public boolean isSatisfied() {
        return !isHungry() && !isTired();
    }

    @Override
    public String noise() {
        return "Hello, my name is " + name + "!";
    }

    public String purr() {
        return "I'm a HouseCat";
    }
}
