package org.launchcode.java.studios.BaseDIsc;

public class DVD extends BaseDisc implements OpticalDisc {


        public DVD(String name, int storageCap, String discType) {
            super(name, storageCap, discType);
        }
        @Override
        public void spinDisc( ){
            System.out.println("A DVD spins at a rate of 32k rpm.");
        }
        @Override
        public void readData(){
            System.out.println("I'm sorry, we can't do that...");
            }

        }

        // TODO: Implement your custom interface.

        // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
        //  need to be declared separately.


