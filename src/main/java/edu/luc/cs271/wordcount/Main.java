package edu.luc.cs271.wordcount;

import java.util.*;

public class Main {

  public static void main(final String[] args) throws InterruptedException {

    // set up the scanner so that it separates words based on space and punctuation
    final Scanner input = new Scanner(System.in).useDelimiter("[^\\p{Alnum}]+");

    // Map<String, Integer> wordMap = new HashMap<>();
    Map<String, Integer> wordMap = new TreeMap<>();

    WordCounter wc = new WordCounter(wordMap);

    List<String> wordList = new ArrayList<>();
    while (input.hasNext()) {
      String word = input.next();
      wordList.add(word);
    }

    wc.countWords(wordList.iterator());

    Map<String, Integer> wordCountMap = wc.getCounts();

    int mapSize = wordCountMap.size();

    List<Map.Entry<String, Integer>> mapList = new ArrayList<>(mapSize);

    for (Map.Entry<String, Integer> pair : wordCountMap.entrySet()) {
      mapList.add(pair);
    }

    // Collections.sort(List, Comparator);
    Collections.sort(mapList, new DescendingByCount());
    for (int i = 0; i < 10; i++) {
      System.out.println(mapList.get(i).getKey() + " = " + mapList.get(i).getValue());
    }

    // Done complete this main program
    // 1. Done create a WordCounter instance
    // 2. Done use this to count the words in the input
    // 3. Done determine the size of the resulting map
    // 4. Done create an ArrayList of that size and
    // 5. Done store the map's entries in it (these are of type Map.Entry<String, Integer>
    // 6. Done sort the ArrayList in descending order by count
    //    using Arrays.sort and an instance of the provided comparator (after fixing the latter)
    // 7. Done print the (up to) ten most frequent words in the text

  }
}
