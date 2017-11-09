package edu.luc.cs271.wordcount;

import java.util.*;

public class Main {

    public static void main(final String[] args) throws InterruptedException {

        // set up the scanner so that it separates words based on space and punctuation
        final Scanner input = new Scanner(System.in).useDelimiter("[^\\p{Alnum}]+");

        // TODO complete this main program
        // 1. create a WordCounter instance
        // 2. use this to count the words in the input
        // 3. determine the size of the resulting map
        // 4. create an ArrayList of that size and
        // 5. store the map's entries in it (these are of type Map.Entry<String, Integer>
        // 6. sort the ArrayList in descending order by count
        //    using Arrays.sort and an instance of the provided comparator (after fixing the latter)
        // 7. print the (up to) ten most frequent words in the text

        Map<String, Integer> wordMap = new HashMap<String, Integer>();

        WordCounter wc = new WordCounter(wordMap);

        Iterator<String> wordList = Arrays.asList("asdf", "oiu", "qwer", "asdf").iterator();

        wc.countWords(wordList);

        System.out.println(wc.getCount("asdf"));

    }
}
