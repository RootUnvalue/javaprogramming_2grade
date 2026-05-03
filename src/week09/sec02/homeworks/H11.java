package week09.sec02.homeworks;

import java.util.Scanner;

public class H11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char action;
        int[] scores = null;
        while(true){
            System.out.println("명령입력");
            System.out.println("1.학생수입력 2.점수입력 3.점수리스트 4.분석 5.종료");
            action = input.next().charAt(0);
            if(action=='1'){
                System.out.println("학생 수를 입력하시오");
                scores = new int[input.nextInt()];
                System.out.println("입력된 학생 수 : " + scores.length);
            } else {
                if (scores == null && action != 5) {
                    System.out.println("먼저 학생의 수를 입력하시오");
                    continue;
                }
                if (action == '2') {
                    for (int i = 0; i < scores.length; i++) {
                        System.out.println((i + 1) + "번쨰 학생의 점수입력");
                        scores[i] = input.nextInt();
                    }
                } else if (action == '3') {
                    System.out.println("점수 리스트");
                    for(int i = 0; i < scores.length; i++) System.out.println((i+1) + "번 학생의 점수 : " + scores[i]);
                } else if (action == '4') {
                    int sum = 0, max = scores[0];
                    double ave;
                    for(int i = 0; i<scores.length; i++) {
                        if(max<scores[i]) max = scores[i];
                        sum += scores[i];
                    }
                    ave = sum * 1.0 / scores.length;
                    System.out.println("최고 점수 : " + max);
                    System.out.printf("평균 점수 %.2f%n: ", ave);
                } else if(action == '5') {
                    break;
                } else System.out.println("잘못된 명령");
            }
        }
    }
}
