package week05.sec02.homeworks;

import java.util.Scanner;

public class H04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("정수를 입력.");
        int num = input.nextInt();
        switch (num) {
            case 1,2,3,4,5,6,7,8,9,10:
                System.out.println("10이하입니다.");
                break;
            case 11, 12, 13, 14, 15, 16, 17, 18, 19, 20:
                System.out.println("11이상 20이하입니다.");
                break;
            case 21, 22, 23, 24, 25, 26, 27, 28, 29, 30:
                System.out.println("21이상 30이하입니다.");
                break;
            default:
                System.out.println("범위 밖의 숫자입니다.");
                break;
        }
    }
}
