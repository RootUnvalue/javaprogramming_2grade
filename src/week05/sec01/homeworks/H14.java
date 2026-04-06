package week05.sec01.homeworks;

import java.util.Scanner;

public class H14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("면접 점수 입력:");
        int score_Greeting =  input.nextInt();
        System.out.println("코딩 테스트 점수 입력:");
        int score_codingTest =  input.nextInt();
        System.out.println("인성시험 점수 입력:");
        int score_character = input.nextInt();

        if(score_character >= 80){
            if((score_codingTest >= 80) & (score_Greeting >= 80)){
                System.out.println("합격입니다.");
            } else if (score_codingTest < 80) {
                System.out.println("코딩 테스트가 80점 미만이므로 불합격입니다.");
            } else if (score_Greeting < 80) {
                System.out.println("면접 점수가 80점 미만이므로 불합격입니다.");
            }
        } else System.out.println("인성테스트 점수가 80 미만입니다. 불합격입니다.");
    }
}
