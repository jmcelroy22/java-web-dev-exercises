package org.launchcode.java.studio.countingcharacters;


import java.util.HashMap;

public class CountingCharacters {
    public static void main(String[] args) {


        String quote = "If the product of two terms is zero then common sense " +
                "says at least one of the two terms has to be zero to start with.";
        HashMap<Character, Integer> quotes = new HashMap<>();
        for (int i = quote.length() -1; i > 0; i--){
            if(quotes.containsKey(quote.charAt(i))){
                int count = quotes.get(quote.charAt(i));
                quotes.put(quote.charAt(i), ++count);
            } else {
                quotes.put(quote
                        .charAt(i),1);
            }
        }
        System.out.println(quotes);
        //char[] charactersInString = quote.toCharArray();



        }

    }

