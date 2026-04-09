package week06.sec02.homeworks;

import java.util.Scanner;

public class H15 {
    public static void main(String[] args) {
        System.out.println("단수 입력");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 1;
        while ( i <= 9) {
            System.out.printf("%d * %d = %d%n ", i, n, (i*n));
            i++;
        }
    }
}
