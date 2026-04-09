package week06.sec02.homeworks;

import java.util.Scanner;

public class H19 {
    public static void main(String[] args) {
        System.out.println("n! 출력");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 1;
        long factorial = 1;
        while(i<=n){
            factorial = factorial * i;
            System.out.printf(i + " * ");
            i++;
        }
        System.out.println("\b\b= " + factorial);
    }
}
