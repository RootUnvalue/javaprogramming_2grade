package week09.sec02.homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class H07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("배열의 길이 입력");
        int index_MAX =  input.nextInt();
        if(index_MAX < 0){
            System.out.println("배열의 길이는 0보다 작을 수 없음");
            return;
        }
        int[] arr = new int[index_MAX];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr["+i+"] 에 들어갈 값을 입력");
            arr[i] = input.nextInt();
        }
        System.out.println("완성된 배열\n" + Arrays.toString(arr));
    }
}
