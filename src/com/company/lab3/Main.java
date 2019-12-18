package com.company.lab3;

public class Main{
    public static void main(String[] args){
        TextEdit te = new TextEdit("Here are some letters, so that we can test our algorithm. We have a point so that there is more than one sentence. One more sentence here just for flexibility.");
        System.out.println("Number of words: " + te.nrofwords() + " Number of sentences: " + te.nrofsentences());
        System.out.println("Total number of words: " + te.letters().length + " Number of vowels: " + te.getVowCount() + " Number of consonants: " + te.getConsCount());
        System.out.println("The longest word is: " + te.getLongest());
    }
}