package ua.com.foxminded.anagrams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
    Anagram anagram;

    @BeforeEach
    public void setUp() {
        anagram = new Anagram();
    }

    @Test
    void createAnagram_ShouldException_whenInputNull() {
        assertThrows(NullPointerException.class, () ->
                anagram.createAnagram(null));
    }

    @Test
    void createAnagram_shouldException_whenInputEmptyString() {
        String[] args = new String[]{};
        assertThrows(IllegalArgumentException.class, () ->
                anagram.createAnagram(args));
    }

    @Test
    void createAnagram_shouldException_whenInputOneCharacter() {
        String[] args = new String[]{"h"};
        assertThrows(IllegalArgumentException.class, () ->
                anagram.createAnagram(args));
    }

    @Test
    void createAnagram_shouldException_whenInputSingleSpace() {
        String[] args = new String[]{" "};
        assertThrows(IllegalArgumentException.class, () ->
                anagram.createAnagram(args));
    }

    @Test
    void createAnagram_shouldException_whenInputMultipleSpaces() {
        String[] args = new String[]{"   "};
        assertThrows(IllegalArgumentException.class, () ->
                anagram.createAnagram(args));
    }

    @Test
    void createAnagram_Success_whenInputLettersAndSymbols() {
        String[] args = new String[]{"a1bcd efg!h"};
        assertEquals("d1cba hgf!e", anagram.createAnagram(args));
    }

    @Test
    void createAnagram_Success_whenInputLowerAndUpperCaseCharacters() {
        String[] args = new String[]{"aaaAAA"};
        assertEquals("AAAaaa", anagram.createAnagram(args));
    }

    @Test
    void createAnagram_Success_whenInputMultipleSameLetter() {
        String[] args = new String[]{"aaa"};
        assertEquals("aaa", anagram.createAnagram(args));
    }

    @Test
    void createAnagram_Success_whenInputOnlySymbols() {
        String[] args = new String[]{"!!!12//"};
        assertEquals("!!!12//", anagram.createAnagram(args));
    }

    @Test
    void createAnagram_Success_whenInputSeveralWords() {
        String[] args = new String[]{"olleH dlrow"};
        assertEquals("Hello world", anagram.createAnagram(args));
    }
}

