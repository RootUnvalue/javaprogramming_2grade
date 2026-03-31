package week05.sec01.homeworks;

import java.util.Scanner;

public class H05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---명령---\n원의 둘레 계산: 1\n원의 넓이 계산: 2\n삼각형의 둘레 계산: 3\n삼각형의 넓이 계산: 4\n사각형의 둘레 계산: 5\n사각형의 넓이 계산: 6\n----------\n");
        System.out.println("명령입력...");
        char act = input.next().charAt(0);

        double x, y, r;
        if(act=='1'){
            System.out.println("지름 입력.");
            r = input.nextDouble();
            double l = 2 * Math.PI * r;
            System.out.printf("지름이 %.2f인 원의 둘레: %.2f", r, l);
        }
        if(act=='2'){
            System.out.println("지름 입력.");
            r = input.nextDouble();
            double s = Math.PI * r * r;
            System.out.printf("지름이 %.2f인 원의 넓이: %.2f", r, s);
        }
    }
}
