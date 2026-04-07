package week06.sec01.homeworks;

import java.util.Scanner;

public class H22 {
    public static void main(String[] args) {
        System.out.println("반복횟수입력");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long facto = 1;
        for (int i = 1; i<=n; i++) {
            System.out.print(i + " * " );
            facto *= i;
        }
        System.out.println("\b\b = " + facto);
    }
}
