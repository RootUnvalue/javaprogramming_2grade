package week06.sec02.homeworks;

import java.util.Scanner;

public class H11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("처음 수 입력: ");
        int x = input.nextInt();
        System.out.println("나중 수 입력: ");
        int y = input.nextInt();
        int i = x, sum= 0;
        while (i <= y) {
            sum += i;
            i++;
        }
        System.out.printf("%d 부터 %d 까지의 합: %d", x, y, sum);
    }
}
