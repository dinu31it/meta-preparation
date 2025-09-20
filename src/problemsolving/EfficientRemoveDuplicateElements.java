package problemsolving;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class EfficientRemoveDuplicateElements {
    public static void main(String[] args) {
        int[] resultItems = new int[]{1, 4, 3, 2, 2, 3, 4, 9};

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        for(int arr: resultItems){
            linkedHashSet.add(arr);
        }
//        HashSet<Integer> hashSet = new HashSet<>();
//        for(int arr: resultItems){ 
//            hashSet.add(arr);
//        }
//        System.out.println("display HashSet: --"+hashSet);
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int arr: resultItems){
            hashMap.put(arr, hashMap.getOrDefault(arr, 0)+1);
        }
        System.out.println("display hashmap:--->>> "+hashMap);
        System.out.println("display LinkedHashSet: --"+linkedHashSet);

    }
}
