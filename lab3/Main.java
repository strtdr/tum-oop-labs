package com.company.Lab3;

public class Main {

    public static void main(String[] args) {

//        System.out.println(sentenceCount);
        String myText = "I have 2 cats: one big cat, one small cat.";
        System.out.println(myText);
        System.out.println(TextInfo.wordCount(myText) + " words.");
        System.out.println(TextInfo.sentenceCount(myText)+ " sentences.");
        TextInfo.vowelsAndConsonants(myText);
        System.out.println("Longest word is: " + TextInfo.longestWord(myText));
        TextInfo.top5Words(myText);
    }
}
