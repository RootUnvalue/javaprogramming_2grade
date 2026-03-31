package week05.sec01.homeworks;

import java.util.Scanner;

public class H01 {
    public static void main(String[] args) {
        System.out.println("정수입력...");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num >= 10) System.out.println("10이상이다.");
        if (num < 10 ) System.out.println("10이하이다.");
    }
}
