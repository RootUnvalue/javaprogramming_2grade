package week09.sec02.homeworks;

import java.util.Arrays;

public class H10 {
    public static void main(String[] args) {
        int[] arrEven = new int[26], arrOdd = new int[25];
        int i_even = 0, i_odd = 0;
        for(int i = 0; i <= 50; i++){
            if(i%2==0) arrEven[i_even++] = i;
            else arrOdd[i_odd++] = i;
        }
        System.out.println("짝수배열: " + Arrays.toString(arrEven));
        System.out.println("홀수배열: " + Arrays.toString(arrOdd));
    }
}
