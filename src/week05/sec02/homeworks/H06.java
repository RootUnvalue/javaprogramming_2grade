package week05.sec02.homeworks;

import java.util.Scanner;

public class H06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("달을 입력");
        int month =  input.nextInt();
        System.out.println("월을 입력");
        int day =  input.nextInt();
        if(0 < day && day <= 31) {
            String qufwkfl = switch (month) {
                case 1 -> {
                    if (day <= 19) yield "염소자리";
                    else yield "물병자리";
                }
                case 2 -> {
                    if (day <= 18) yield "물병자리";
                    else yield "물고기자리";
                }
                case 3 -> {
                    if (day <= 20) yield "물고기자리";
                    else yield "양자리";
                }
                case 4 -> {
                    if (day <= 19) yield "양자리";
                    else yield "황소자리";
                }
                case 5 -> {
                    if (day <= 20) yield "황소자리";
                    else yield "쌍둥이자리";
                }
                case 6 -> {
                    if (day <= 21) yield "쌍둥이자리";
                    else yield "게자리";
                }
                case 7 -> {
                    if (day <= 22) yield "게자리";
                    else yield "사자자리";
                }
                case 8 -> {
                    if (day <= 22) yield "사자자리";
                    else yield "처녀자리";
                }
                case 9 -> {
                    if (day <= 22) yield "처녀자리";
                    else yield "천칭자리";
                }
                case 10 -> {
                    if (day <= 22) yield "천칭자리";
                    else yield "전갈자리";
                }
                case 11 -> {
                    if (day <= 22) yield "전갈자리";
                    else yield "궁수자리";
                }
                case 12 -> {
                    if (day <= 21) yield "궁수자리";
                    else yield "염소자리";
                }
                default -> {
                    System.out.println("month가 잘못되었습니다..\n입력된 month: " + month);
                    yield "알 수 없음";
                }
            };
            System.out.printf("%s 월 %s 일 생인 당신의 별자리는 바로!\n%s 랍니다", month, day, qufwkfl);
        }
        else System.out.println("day가 잘못되었습니다..\n입력된 day: " + day);
    }
}
