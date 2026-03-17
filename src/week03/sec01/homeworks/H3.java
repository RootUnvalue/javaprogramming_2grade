package week03.sec01.homeworks;

import java.util.Scanner;

public class H3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("첫 번째 값 입력: ");
        int i1 = input.nextInt();
        System.out.println("두 번째 값 입력: ");
        int i2 = input.nextInt();
        System.out.println("덧: " + (i1 + i2));
        System.out.println("뺄: " + (i1 - i2));
        System.out.println("곱: " + (i1 * i2));
        System.out.println("나: " + (i1 / i2));

        System.out.println("반지름입력..! ");
        double r =  input.nextDouble();
        System.out.println("둘레 : " + (2 * Math.PI * r));
        System.out.println("넓이 : " + (Math.PI * r * r));
        System.out.println("부피 : " + (4 * r * r * r * Math.PI / 3));

        System.out.println("밑변 입력!");
        double x = input.nextDouble();
        System.out.println("높이 입력!");
        double h = input.nextDouble();

        System.out.println("삼각형의 넓이 :  " + (x*h/2));
        System.out.println("사각형의 넓이 :  " + (x*h));


    }
}
