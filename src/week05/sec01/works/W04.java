package week05.sec01.works;

import java.util.Scanner;
public class W04 {
    public static void main(String[] args) {
// int score = 85;
        Scanner scanner = new Scanner(System.in);
        System.out.print("수입력: ");
        int score = scanner.nextInt();
        if(score>=90) {
            System.out.println("점수가 90보다 크다.");
            System.out.println("A등급이다.");
        } else {
            System.out.println("점수가 90보다 작다.");
            System.out.println("B등급이다.");
        }
    }
}