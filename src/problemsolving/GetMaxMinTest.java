package problemsolving;

import java.util.Arrays;

public class GetMaxMinTest {
    public static void main(String[] args) {
        int[] arr = {2,7,4,3,6, 7};
        System.out.println("Get [max, min]: "+ Arrays.toString(getMaxMin(arr)));
    }

    public static int[] getMaxMin(int[] a){
        int max = a[0], min = a[0];
        for(int i=1;i<a.length;i++){
            if(a[i] > max){
                max = a[i];
            } else if(a[i] < min){
                min = a[i];
            }
        }
        return new int[]{max, min};
    }
 }
