package week05.sec02.homeworks;

import java.util.Scanner;

public class H05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("점수를 입력하세요.");
        int score = input.nextInt();
        String grade = switch (score/10) {
            case 9 -> (score >= 95) ? "A+":"A";
            case 8 -> (score >= 85) ? "B+":"B";
            case 7 -> (score >= 75) ? "C+":"C";
            case 6 -> (score >= 65) ? "D+":"D";
            default -> "F";
        };
        System.out.printf("%s 점인 학생의 등급은 %s 입니다.", score, grade);
    }
}
