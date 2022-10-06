package org.launchcode.java.studios.BaseDIsc;

public class BluRay extends DVD {
    public BluRay(String name, int storageCap, String discType) {
        super(name, storageCap, discType);
    }

    @Override
    public void spinDisc(){
        System.out.println("A bluray spins at 75x rmp.");
    }
}
