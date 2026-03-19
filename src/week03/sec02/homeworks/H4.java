package week03.sec02.homeworks;

import java.util.Scanner;

public class H4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("정수를 입력...");
        int x = input.nextInt();

        System.out.println("x가 증가 x: " + ++x);
        System.out.println("x가 증가? x: " + x++);
        System.out.println("x가 증가 x: " + x);

    }
}
