package week09.sec02.homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class H06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[]  arr = new int[5];
        for (int i = 0; i < arr.length; i++){
            System.out.println("arr[" + i + "] 에 들어갈 값을 입력");
            arr[i] = input.nextInt();
        }
        System.out.println("완성된 배열: " + Arrays.toString(arr));
    }
}
