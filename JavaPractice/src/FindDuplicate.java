package array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {3, 14, 2, 6, -9, 10, 11, 2, 45, 77, 3, 67};
        findDuplicates(arr);
        usingMap(arr);
        usingHashSet(arr);
    }

    public static void findDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    public static void usingMap(int[] arr) {
        Map<Integer, Integer> dups = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            if (dups.containsKey(arr[i])) {
                dups.put(arr[i], dups.get(arr[i]) + 1);
            }
            if (!dups.containsKey(arr[i])) {
                dups.put(arr[i], count + 1);
            }
        }
        for (Integer x : dups.keySet())
            if (dups.get(x) > 1)
                System.out.println("duplicate numbers :" + x + "-> " + dups.get(x));
    }

    public static void usingHashSet(int[] arr) {
        Set<Integer> noDups = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (!noDups.add(arr[i])) {
                System.out.println(arr[i]);
            }
        }
    }
}
