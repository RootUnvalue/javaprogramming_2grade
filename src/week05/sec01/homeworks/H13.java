package week05.sec01.homeworks;

import java.util.Scanner;

public class H13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---명령---\n원의 둘레 계산: 1\n원의 넓이 계산: 2\n정삼각형의 둘레 계산: 3\n정삼각형의 넓이 계산: 4\n사각형의 둘레 계산: 5\n사각형의 넓이 계산: 6\n----------\n");
        System.out.println("명령입력...");
        char act = input.next().charAt(0);

        if(act=='1') {
            System.out.println("지름 입력:");
            double r = input.nextDouble();
            double l = 2 * Math.PI * r;
            System.out.printf("지름이 %.2f인 원의 둘레: %.2f", r, l);
        } else if(act=='2') {
            System.out.println("지름 입력:");
            double r = input.nextDouble();
            double s = Math.PI * r * r;
            System.out.printf("지름이 %.2f인 원의 넓이: %.2f", r, s);
        } else if(act=='3') {
            System.out.println("정삼각형의 한 변의 길이 입력:");
            double r = input.nextDouble();
            double c = r * 3;
            System.out.printf("한 변이 %.2f인 정삼각형의 둘레: %.2f: ", r, c);
        } else if(act=='4') {
            System.out.println("정삼각형의 한 변의 길이 입력:");
            double r = input.nextDouble();
            double c = Math.sqrt(3) / 4 * Math.pow(r, 2);
            System.out.printf("한 변이 %.2f인 정삼각형의 넓이: %.2f", r, c);
        } else if(act=='5') {
            System.out.println("가로변 입력:");
            double x = input.nextInt();
            System.out.println("세로변 입력:");
            double y = input.nextInt();
            double z = (x + y) * 2;
            System.out.printf("가로 %.2f, 세로 %.2f인 사각형의 둘레: %.2f", x, y, z);
        } else if(act=='6') {
            System.out.println("가로변 입력:");
            double x = input.nextInt();
            System.out.println("세로변 입력:");
            double y = input.nextInt();
            double z = x * y;
            System.out.printf("가로 %.2f, 세로 %.2f인 사각형의 넓이: %.2f", x, y, z);
        } else System.out.println("명령오류.");
    }
}
