package week06.sec02.works;

import java.util.Scanner;

public class W09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean run = true;
        int speed = 0;
        while(run){
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("명령 선택");
            String strNum = scanner.next();

            switch (strNum){
                case "1":
                    speed++;
                    break;
                case "2":
                    speed--;
                    break;
                default:
                    run = false;
            }
        }

        System.out.println("프로그램 종료");
    }
}
