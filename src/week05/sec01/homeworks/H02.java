package week05.sec01.homeworks;

import java.util.Scanner;

public class H02 {
    public static void main(String[] args) {
        System.out.println("정수입력..");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num < 10) System.out.println("10미만임.");
        if ((30 > num)&(num>=10)) System.out.println("10이상 30미만임.");
        if (num >= 30) System.out.println("30이상임.");
    }
}
