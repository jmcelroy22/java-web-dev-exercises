package org.launchcode.java.studios.countingcharacters;


import java.util.HashMap;

public class CountingCharacters {
    public static void main(String[] args) {
        HashMap<Character, Integer> characterCount = new HashMap<>();
        String quote = "If the product of two terms is zero then common sense " +
                "says at least one of the two terms has to be zero to start with.";
             ]
        //convert string to array
        char charactersFromString[] = quote.toCharArray();

        System.out.println(charactersFromString);
        //for each letter in characterFromString were gonna pull one out and put it in letter
        for(char letter: charactersFromString){
            if(charactersFromString.contains(letter)){
                characterCount.put(letter, characterCount.get(leter) + 1);

            } else {
                characterCount.put(letter, 1);
            } else {
                characterCount.put(letter, 1);
            }

            }
        for(Map.Entry<Character, Integer> letter: characterCount.entrySet()){
            System.out.println(Letter.getKey() +)": " + letter.getValue();
        }
        }
//        HashMap<Character, Integer> quotes = new HashMap<>();
//        for (int i = quote.length() -1; i > 0; i--){
//            if(quotes.containsKey(quote.charAt(i))){
//                int count = quotes.get(quote.charAt(i));
//                quotes.put(quote.charAt(i), ++count);
//            } else {
//                quotes.put(quote
//                        .charAt(i),1);
//            }
//        }
//        System.out.println(quotes);
//        //char[] charactersInString = quote.toCharArray();
//
//
//
//        }
//
//    }


