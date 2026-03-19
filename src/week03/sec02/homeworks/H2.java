package week03.sec02.homeworks;

import java.util.Scanner;

public class H2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y;
        System.out.println("첫 번째 정수 입력: ");
        x = input.nextInt();
        System.out.println("두 번째 정수 입력: ");
        y = input.nextInt();

        System.out.println("x > y : " + (x > y));
        System.out.println("x >= y : " + (x >= y));
        System.out.println("x < y : " + (x < y));
        System.out.println("x <= y : " + (x <= y));
        System.out.println("x == y : " + (x == y));
        System.out.println("x != y : " + (x != y));

    }
}
