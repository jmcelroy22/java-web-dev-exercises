package org.launchcode.java.studios.BaseDIsc;


import java.util.ArrayList;

public class BaseDisc {
        private String name;
        private int storageCap;

        private String discType;
        private ArrayList<String> contents = new ArrayList<>();

        public BaseDisc(String name, int storageCap, String discType){
            this.name = name;
            this.storageCap = storageCap;
            this.discType = discType;
        }

        public int getRemainingCap(){
            return this.storageCap = this.capacityUsed;
        }

        public String getDiscInfo(){
            return "Name " + this.name + " Space used: " + this.capicityUsed;
        }
    }
}
