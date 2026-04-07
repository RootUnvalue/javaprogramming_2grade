package week05.sec02.homeworks;

import java.util.Scanner;

public class H05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("점수를 입력하세요.");
        int score = input.nextInt();
        String grade = switch (score/10) {
            case 10 -> "A+";
            case 9 -> switch (score%10) {
                case 5,6,7,8,9 -> "A+";
                default -> "A";
            };
            case 8 -> switch (score%10) {
                case 5,6,7,8,9 -> "B+";
                default -> "B";
            };
            case 7 -> switch (score%10) {
                case 5,6,7,8,9 -> "C+";
                default -> "C";
            };
            case 6 -> switch (score%10) {
                case 5,6,7,8,9 -> "D+";
                default -> "D";
            };
            default -> "F";
        };
        System.out.printf("%s 점인 학생의 등급은 %s 입니다.", score, grade);
    }
}
