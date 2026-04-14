package week07.sec01.works;

import java.util.Scanner;

public class W02 {
    public static void main(String[] args) {
        System.out.println("메시지 입력");
        System.out.println("종료 하려면 \"q\" 입력");

        Scanner input = new Scanner(System.in);
        String inputStr;

        do{
            System.out.println(">");
            inputStr = input.nextLine();
            System.out.println(inputStr);
        } while (!inputStr.equals("q"));

        System.out.println();
        System.out.println("프로그램 종료");

    }
}
