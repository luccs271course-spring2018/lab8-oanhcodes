package edu.luc.cs271.wordcount;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestWordCounter {

    private Map<String, Integer> wordMap;
    ;
    private WordCounter fixture;

    @Before
    public void setUp() {
        wordMap = new HashMap<>();
        fixture = new WordCounter(wordMap);
    }

    @After
    public void tearDown() {
        wordMap = null;
        fixture = null;
    }

    @Test
    public void testGetCountEmpty() {
        assertEquals(true, fixture.getCounts().isEmpty());
    }

    @Test
    public void testGetCountNonEmpty() {
        Iterator<String> wordList = Arrays.asList("asdf", "oiu", "qwer", "asdf").iterator();
        fixture.countWords(wordList);
        assertEquals(false, fixture.getCounts().isEmpty());
        assertEquals(2, fixture.getCount("asdf"));
        assertEquals(1, fixture.getCount("qwer"));
        try {
            fixture.getCount("apple");
            fixture.getCount("banana");
            fail("java.lang.NullPointerException expected");
        } catch (final NullPointerException ex) {
            // exception occurred => all good
        }
    }
}
