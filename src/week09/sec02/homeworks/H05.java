package week09.sec02.homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class H05 {
    public static void main(String[] args) {
        int[] arr = new int[] {5,2,0,23,2346,1,15};
        System.out.println("기존: " + Arrays.toString(arr));

        Scanner input = new Scanner(System.in);
        System.out.println("index(위치) 변경");
        System.out.println("index 선택");
        int index1 = input.nextInt();
        if (index1 < 0 || index1 > arr.length) {
            System.out.println("index를 잘못 선택함");
            return;
        }
        System.out.println("바꿀 index 선택");
        int index2 = input.nextInt();
        if (index2 < 0 || index2 > arr.length) {
            System.out.println("index를 잘못 선택함");
            return;
        }
        int temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;

        System.out.println("바뀜: " + Arrays.toString(arr));

    }
}
