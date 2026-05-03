package week09.sec02.homeworks;

import java.util.Arrays;

public class H09 {
    public static void main(String[] args) {
        int[] arr = new int[50/10];
        int index = 0;
        for (int i = 1; i <= 50; i++) if(i%10==7) arr[index++] = i;
        System.out.println(Arrays.toString(arr));
    }
}
