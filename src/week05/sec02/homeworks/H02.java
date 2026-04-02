package week05.sec02.homeworks;

import java.util.Scanner;

public class H02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("달을 입력");
        int month = input.nextInt();
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println(month +" 는 31일");
                break;
            case 4, 6, 9, 11:
                System.out.println(month + "는 30일");
                break;
            case 2:
                System.out.println(month + "는 28일 아니면 29일");
                break;
            default:
                System.out.println("그런 달은 없는걸요");
                break;
        }
    }
}
