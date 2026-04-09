package week06.sec02.homeworks;

import java.util.Scanner;

public class H08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int money = 0;
        String action;
        boolean loop = true;
        while (loop) {
            System.out.println("-------명령 메뉴-------\n1. 예금\n2. 출금\n3. 잔액확인\n4. 종료\n\n입력: ");
            action = input.nextLine();
            switch (action) {
                case "예금":
                    System.out.println("입금할 금액을 입력하세요.");
                    action = input.nextLine();
                    money += Integer.parseInt(action);
                    System.out.println("잔액: " + money);
                    break;
                case "출금":
                    System.out.println("출금할 금액을 입력하세요.");
                    action = input.nextLine();
                    if((Integer.parseInt(action) - money) < 0) {
                        System.out.println("잔액부족");
                        break;
                    }
                    else {
                        money -= Integer.parseInt(action);
                        System.out.println("잔액: " + money);
                        break;
                    }
                case "잔액확인":
                    System.out.println("현재 잔액: " + money);
                    break;
                case "종료":
                    System.out.println("프로그램 종료");
                    loop = false;
                    break;
                default:
                    System.out.println("명령을 알 수 없음");
                    break;
            }
        }
    }
}
