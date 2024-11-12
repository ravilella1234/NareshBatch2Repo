package icici.loans.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCountExample 
{
	public static void main(String[] args) 
	{
        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) 
        {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Count: " + wordCount);
    }

}
