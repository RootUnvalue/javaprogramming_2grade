package week05.sec02.homeworks;

import java.util.Scanner;

public class H05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("점수를 입력하세요.");
        int score = input.nextInt();
        String grade = switch (score) {
            case 100, 99, 98, 97, 96, 95 -> "A+";
            case 94, 93, 92, 91, 90 -> "A";
            case 89, 88, 87, 86, 85 -> "B+";
            case 84, 83, 82, 81, 80 -> "B";
            case 79, 78, 77 ,76 ,75 -> "C+";
            default -> "F";
        };
    }
}
