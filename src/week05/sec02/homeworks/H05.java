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
            case 74, 73, 72, 71, 70 -> "C";
            case 69,68, 67, 66, 65, 64, 63, 62, 61, 60 -> "D";
            default -> "F";
        };
        System.out.printf("%s 점인 학생의 등급은 %s 입니다.", score, grade);
    }
}
