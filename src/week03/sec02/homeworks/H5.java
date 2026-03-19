package week03.sec02.homeworks;

import java.util.Scanner;

public class H5 {
    public static void main(String[] args) {
        //배열 써도 되나요..? 안되겠죠?
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.println("첫 번째 정수 입력..");
        a = input.nextInt();
        System.out.println("두 번째 정수 입력..");
        b = input.nextInt();
        System.out.println("세 번째 정수 입력..");
        c = input.nextInt();

        double avg = (double) (a +  b + c) / 3;
        System.out.println("평균: " + avg);
    }
}
