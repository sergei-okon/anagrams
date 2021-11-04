package com.foxminded.okon.task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Anagram {

    private String reverseWord(String word) {
        String[] splitWord = word.split("");
        List<String> symbolsList = new LinkedList<>();
        int count = 0;

        for (String symbol : splitWord) {
            if (symbol.matches("\\p{L}")) {
                symbolsList.add(0, symbol);
            }
        }

        for (String symbol : splitWord) {
            count++;
            if (!symbol.matches("\\p{L}")) {
                symbolsList.add(count - 1, symbol);
            }
        }
        return String.join("", symbolsList);
    }

    public void createAnagramFromSentence(String sentence) {
        List<String> wordList = new ArrayList<>();
        String[] words = sentence.split(" ");

        for (String word : words) {
            wordList.add(reverseWord(word));
        }
        String anagram = String.join(" ", wordList);
        System.out.println(" " + sentence + " =>" + " " + anagram);
    }
}
