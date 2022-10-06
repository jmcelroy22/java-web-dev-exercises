package org.launchcode.java.studios.BaseDIsc;

public class Main {


        public static void main(String[] args){

            // TODO: Declare and initialize a CD and a DVD object.

            // TODO: Call each CD and DVD method to verify that they work as expected.
            CD cd = new CD("Nevermind", 34000, "CD");
            DVD dvd = new DVD("War Games", 5000, "DVD");
            BluRay bluray = new BluRay("The Martian", 7000, "BluRay");

            cd.spinDisc();
            dvd.spinDisc();
            bluray.spinDisc();

            cd.readData();
            dvd.readData();
            bluray.readData();

            System.out.println(cd.getDiscInfo());
            System.out.println(dvd.getDiscInfo());

            System.out.println(cd.getDiscInfo());
            System.out.println(dvd.getDiscInfo());
        }
    }

