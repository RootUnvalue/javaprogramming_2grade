package week06.sec02.homeworks;

import java.util.Scanner;

public class H04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("원하는 단수를 입력:");
        int i = 1, n = input.nextInt();
        while(i <= 9) {
            System.out.println(n + " * " + i + " = " + (i*n));
            i++;
        }
    }
}
