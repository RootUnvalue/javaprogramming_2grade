package week05.sec01.works;

import java.util.Scanner;

public class W02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("수 입력:");
        int score = scanner.nextInt();
        if (score <= 90) {
            System.out.println("점수가 90보다 크다.");
            System.out.println("A등급이다.");
        }
        if (score < 90)
            System.out.println("점수가 90보다 작다.");
            System.out.println("B등급이다.");
    }
}
