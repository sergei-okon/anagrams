package ua.com.foxminded.anagrams;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Anagram {

    private static final String LETTER_REGEX = "\\p{L}";

    public String createAnagram(String[] sentences) {
        if (sentences == null) {
            throw new NullPointerException("Error: The entered value is null");
        }

        if (sentences.length == 0) {
            throw new IllegalArgumentException("Error: The entered value is empty");
        }

        String sentence = String.join(" ", sentences);
        List<String> wordList = new ArrayList<>();
        String[] words = sentence.split(" ");

        if (words.length == 0) {
            throw new IllegalArgumentException("Error: The entered argument has no value");
        }

        for (String word : words) {
            if (word.trim().length() <= 1) {
                throw new IllegalArgumentException("Error: The entered value has less than two characters");
            }
            wordList.add(reverseWord(word));
        }

        return String.join(" ", wordList);
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
