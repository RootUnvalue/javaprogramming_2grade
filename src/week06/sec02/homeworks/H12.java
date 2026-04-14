package week06.sec02.homeworks;

import java.util.Scanner;

public class H12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1, sum = 0;
        while (i <= 20) {
            if(i%2 != 0) {
                System.out.print(i + " + ");
                sum += i;
            }
            i++;
        }
        System.out.println("\b\b = " + sum);
    }
}

