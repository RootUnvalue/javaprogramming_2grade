package week06.sec01.homeworks;

import java.util.Scanner;

public class H21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("n! 출력, n 입력");
        int n = input.nextInt();
        long facto = 1;
        for (int i = 0; i<=n; i++) facto *= i;
        System.out.println(n + "! = " + facto);
    }
}
