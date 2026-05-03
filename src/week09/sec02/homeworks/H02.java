package week09.sec02.homeworks;

import java.util.Arrays;

public class H02 {
    public static void main(String[] args) {
        int[] a = new int[] {1,2,3,4,5,6,7,8,9};
        int[] b = new int[a.length / 3];
        for(int i=0;i<a.length;i++) if(a[i]%3==0){ b[i/3] = a[i];}
        System.out.println(Arrays.toString(b));
    }
}
