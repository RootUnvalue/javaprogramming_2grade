package week07.sec02.homeworks;

import java.util.Scanner;

public class H09 {
    //처음 수와 마지막수를 입력 받아서 그 수들 사이의 숫자 중 7으로 끝나는 숫자만 출력하는 프로그램을 구성하시오.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.println("x -> y 7로 끝나는 수만 출력");
        System.out.println("x: ");
        x = input.nextInt();
        System.out.println("y: ");
        y = input.nextInt();
        System.out.println(x + "부터 " + y + "까지 7로 끝나는 수:");
        for (int i = x; i <= y; i++) {
            if (i % 10 != 7) continue;
            System.out.print(i + ", ");
        }
        System.out.println("\b\b");
    }
}
