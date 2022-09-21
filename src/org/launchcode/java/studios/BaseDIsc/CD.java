package org.launchcode.java.studios.BaseDIsc;

public class CD extends BaseDisc {

    //constructor
    public CD(String name, int storageCap, String discType){
        super(name, storageCap, discType);
    }
   // @Overide
    public void spinDisc(){
        System.out.println("A CD spins at a rate of 23k rpm");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}

