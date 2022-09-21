package org.launchcode.java.studios.BaseDIsc;

public class Main {


        public static void main(String[] args){

            // TODO: Declare and initialize a CD and a DVD object.

            // TODO: Call each CD and DVD method to verify that they work as expected.
            CD cd = new CD("Nevermind", 34000, "CD");
            DVD dvd = new DVD("War Games", 5000, "DVD");

            cd.spinDisc();
            dvd.spinDisc();

            cd.readData();
            dvd.readData();

            System.out.println(cd.getDiscInfo());
            System.out.pringln(dve.getDiscInfo());
        }
    }
}
