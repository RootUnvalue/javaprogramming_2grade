package week03.sec02.homeworks;

import java.util.Scanner;

public class H1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x,y;
        System.out.println("첫 번째 정수 입력: ");
        x = input.nextInt();
        System.out.println("두 번째 정수 입력: ");
        y = input.nextInt();

        int addition = x + y;
        int subtraction = x - y;
        int multiplication = x * y;
        double division = (double) x / y;
        if (Double.isNaN(division)||Double.isInfinite(division)) {
            System.out.println("나눗셈불가");
            division = 0;
        }
        System.out.println("덧: " + addition);
        System.out.println("뺄: " + subtraction);
        System.out.println("곱: " + multiplication);
        System.out.println("나: " + division);


    }
}
