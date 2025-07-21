package problemsolving;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateItem {
    public static int[] removeDuplicateItemTraditionalWay(int[] items) {
        if (items.length == 0) {
            System.out.println("List is empty");
            return items;
        }
        // Step 1: Sort the array
        Arrays.sort(items); // O(n log n)
        // Step 2: Remove duplicates in-place
        int[] temp = new int[items.length];
        int uniqueCount = 1;
        temp[0] = items[0];
        for (int i = 1; i < items.length; i++) {
            if (items[i] != items[i - 1]) {
                temp[uniqueCount++] = items[i];
            }
        }
        return Arrays.copyOf(temp, uniqueCount);
    }

    public static void main(String[] args) {
        int[] resultItems = removeDuplicate(new int[]{1, 4, 3, 2, 2, 3, 4, 9});
        System.out.println(Arrays.toString(resultItems));
    }

    public static int[] removeDuplicate(int[] items) {
        if (items.length == 0) {
            System.out.println("List is empty");
            return items;
        }
        Set<Integer> uniqueSet = new LinkedHashSet<>();
        for (int item : items) {
            uniqueSet.add(item);
        }
        int[] result = new int[uniqueSet.size()];
        int i = 0;
        for (int val : uniqueSet) {
            result[i++] = val;
        }
        return result;
    }
}

