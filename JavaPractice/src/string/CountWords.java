package string;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * 1. split into worlds
 * 2. create a map to store word:count
 * 3. traverse to the array and store into map, if already in there increase count
 */
public class CountWords {
    public static void main(String[] args) {
        String str = "I am learning java language. java and python are very popular language. learning java is easier than python.";

        String[] words = str.split(" ");
        Map<String, Integer> duplicates = new TreeMap<>();

        for (int i = 0; i < words.length; i++) {
            //increment if duplicate
            if (!duplicates.containsKey(words[i])) {
                duplicates.put(words[i], 1);
            } else {
                duplicates.put(words[i], duplicates.get(words[i]) + 1);
            }
        }

//        for(Map.Entry<String,Integer> word: duplicates.entrySet()){
//           // if(word.getValue()>1)
//            System.out.println(word);
//        }

        //OR


        for (String word : duplicates.keySet()) {
            System.out.println(word + " -> " + duplicates.get(word));
        }

    }
}
