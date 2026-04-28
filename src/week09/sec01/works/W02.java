package week09.sec01.works;

import java.util.Arrays;

public class W02 {
    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;
        int[] arr3;
        arr1 = new int[] {1,2,3,4};
        arr2 = new int[] {1,2,3,5};
        arr3 = arr2;
        System.out.println(arr1 == arr2);
        System.out.println(arr2 == arr3);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
