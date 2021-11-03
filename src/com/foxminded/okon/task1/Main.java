package com.foxminded.okon.task1;


public class Main {
    public static void main(String[] args) {
        String sentence = String.join("", args);
        Anagram anagram = new Anagram();
        anagram.createAnagramFromSentence(sentence);
    }
}
