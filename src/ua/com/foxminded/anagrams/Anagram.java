package ua.com.foxminded.anagrams;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Anagram {

    private static final String LETTER_REGEX = "\\p{L}";

    public void createAnagramFromSentence(String sentence) {
        List<String> wordList = new ArrayList<>();
        String[] words = sentence.split(" ");

        for (String word : words) {
            wordList.add(reverseWord(word));
        }
        String anagram = String.join(" ", wordList);
        System.out.println(" " + sentence + " =>" + " " + anagram);
    }

    private String reverseWord(String word) {
        String[] symbols = word.split("");
        List<String> symbolsList = new LinkedList<>();

        int count = 0;

        for (String symbol : symbols) {
            if (symbol.matches(LETTER_REGEX)) {
                symbolsList.add(0, symbol);
            }
        }

        for (String symbol : symbols) {
            count++;
            if (!symbol.matches(LETTER_REGEX)) {
                symbolsList.add(count - 1, symbol);
            }
        }
        return String.join("", symbolsList);
    }
}
