package week05.sec02.homeworks;

import java.util.Scanner;

public class H01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1부터 5까지의 숫자를 입력.");
        char nums = input.next().charAt(0);

        switch (nums) {
            case '1', '일':
                System.out.println("벌칙은 휴대폰 1시간 제한");
                break;
            case '2', '이':
                System.out.println("벌칙은 1부터 1000까지 숫자 세기");
                break;
            case '3', '삼':
                System.out.println("벌칙은 10분동안 영어만 쓰기");
                break;
            case '4', '사':
                System.out.println("벌칙은 면제!");
                break;
            case '5', '오':
                System.out.println("벌칙은 재입대.");
                break;
            default:
                System.out.println("X");
                break;
        }
    }
}