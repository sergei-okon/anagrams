package ua.com.foxminded.anagrams;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        String createdAnagram = anagram.createAnagram(args);

        System.out.println(" " + Arrays.toString(args) + " =>" + " " + createdAnagram);
    }
}

