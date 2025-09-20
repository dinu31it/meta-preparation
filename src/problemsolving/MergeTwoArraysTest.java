package problemsolving;

import java.util.Arrays;

public class MergeTwoArraysTest {
    public static void main(String[] args) {
        int[] arrA = {1,3,3,5,7,9};
        int[] arrB = {2,4,6,8,10};
        System.out.println("Merge two arrays : "+ Arrays.toString(mergedArrays(arrA, arrB)));
    }

    public static int[] mergedArrays(int[] a, int[] b){
        int i=0, j=0, k=0;
        int[] c = new int[a.length+b.length];
        while(i<a.length){
         c[k++] = a[i++];
        }
        while(j<b.length){
            c[k++] = b[j++];
        }
        Arrays.sort(c);
        return c;
    }

}
