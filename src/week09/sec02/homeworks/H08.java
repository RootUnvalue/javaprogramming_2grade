package week09.sec02.homeworks;

import java.util.Scanner;

public class H08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("과목(배열)수 입력");
        int index_MAX = input.nextInt();
        int[] arr = new int[index_MAX];
        for (int i = 0; i < arr.length; i++){
            System.out.println("성적입력");
            arr[i] = input.nextInt();
        }

        int sum = 0;
        double avg;
        for (int j : arr) sum += j;
        avg = sum * 1.0 / arr.length;
        System.out.printf("성적의 총합: %d\n성적의 평균: %.2f", sum, avg);
    }
}
