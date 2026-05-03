package week09.sec02.homeworks;

import java.util.Arrays;

public class H03 {
    public static void main(String[] args) {
        int[] a = new int[] {1,2,3,4,5,6,7,8,9};
        int[] b = new int[a.length / 2 + 1];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] % 2 != 0) {
                b[index] = a[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
