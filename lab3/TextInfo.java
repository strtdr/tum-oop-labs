package com.company.Lab3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class TextInfo {
    public static int wordCount(String textToCheck) {
        int count = 0;
        char ch[] = new char[textToCheck.length()];
        for (int i = 0; i < textToCheck.length(); i++) {
            ch[i] = textToCheck.charAt(i);
            if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0)))
                count++;
        }
        return count;
    }

    public static int sentenceCount(String textToCheck) {
        int sentenceCount = 1;
        String SENTENCE_DELIMETERS = ".,::?!";
        for (int i = 0; i < textToCheck.length() - 1; i++) {
            for (int j = 0; j < SENTENCE_DELIMETERS.length(); j++) {
                if (textToCheck.charAt(i) == SENTENCE_DELIMETERS.charAt(j)) {
                    if (textToCheck.charAt(i + 1) == SENTENCE_DELIMETERS.charAt(j)) {
                        sentenceCount--;
                    }
                    sentenceCount++;
                }
            }
        }
        return sentenceCount;
    }

    public static void vowelsAndConsonants(String textToCheck) {
        int vowelsCount = 0;
        int consonantsCount = 0;
        //converting all the chars to lowercase
        textToCheck = textToCheck.toLowerCase();
        for(int i = 0; i < textToCheck.length(); i++) {
            char ch = textToCheck.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
                vowelsCount++;
            } else if ((ch >= 'a' && ch <= 'z')) {
                consonantsCount++;
            }
        }
        int nrOfLetters = vowelsCount + consonantsCount;
        System.out.println("Number of letters: " + nrOfLetters);
        System.out.println("Number of Vowels: " + vowelsCount);
        System.out.println("Number of Consonants: " + consonantsCount);
    }

    public static String longestWord(String textToCheck) {
        String[] words = textToCheck.split("[\\.?!,: ]");
        String maxLengthWord = "";
        for (int i = 0; i < words.length; i++){
            if(words[i].length() >= maxLengthWord.length()){
                maxLengthWord = words[i];
            }
        }

        return maxLengthWord;
    }
    public static void top5Words(String textToCheck) {
        System.out.println("Top 5 word are: ");
        String[] words = textToCheck.split("[\\.?!,:\\s+]");
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        // populate hashmap with words and their nr of repetition
        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i])) {
                Integer oldValue = hm.get(words[i]);
                hm.put(words[i], oldValue + 1);
            } else
                hm.put(words[i], 1);
        }


        TreeMap<String, Integer> sorted = new TreeMap<>();
        sorted.putAll(hm);
        words = new HashSet<String>(Arrays.asList(words)).toArray(new String[0]);
        int intArray[] = new int[words.length];
        for (int i = 0; i < words.length; i++) {

            intArray[i] = sorted.get(words[i]);
        }

        Arrays.sort(intArray);
        int[] arrayRemoveDuplicates = Arrays.stream(intArray).distinct().toArray();

        if (intArray.length >= 5) {

            for (int i = intArray.length - 1; i > intArray.length - 6; i = i - 1) {

                int keyNumber = Arrays.asList(sorted.values().toArray()).indexOf(intArray[i]);

                System.out.println(sorted.keySet().toArray()[keyNumber]);
                sorted.remove(sorted.keySet().toArray()[keyNumber]);
            }
        } else {
            for (int i = intArray.length - 1; i >= 0; i = i - 1) {

                int keyNumber = Arrays.asList(sorted.values().toArray()).indexOf(intArray[i]);
                System.out.println(sorted.keySet().toArray()[keyNumber]);
                sorted.remove(sorted.keySet().toArray()[keyNumber]);
            }
        }
    }

}
