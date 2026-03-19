package week03.sec02.homeworks;

import java.util.Scanner;

public class H6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1) + "번째 학생의 성적입력..");
            sum += input.nextInt();
        }
        double avg = (double) sum / 5;
        System.out.println("평균: " + avg);
    }
}
