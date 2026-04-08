package week06.sec02.homeworks;

import java.util.Scanner;

public class H02 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("반복 횟수 입력:");
        int i = 0, n = input.nextInt();
        while(i < n) {
            System.out.println("Hello Java");
            i++;
        }
    }
}
