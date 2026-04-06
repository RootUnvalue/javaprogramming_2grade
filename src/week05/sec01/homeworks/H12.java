package week05.sec01.homeworks;

import java.util.Scanner;

public class H12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("면접 점수 입력:");
        int score_Greeting =  input.nextInt();
        System.out.println("코딩 테스트 점수 입력:");
        int score_codingTest =  input.nextInt();
        System.out.println("인성시험 점수 입력:");
        int score_character = input.nextInt();

        int total_Score = score_Greeting + score_character + score_character;
        if ((total_Score/3) >= 70) {
            System.out.println("최종 합격입니다.");
        } else if ((total_Score/3) >= 50) {
            System.out.println("예비 합격입니다.");
        }
        else {
            System.out.println("불합격 입니다.");
        }

    }
}
