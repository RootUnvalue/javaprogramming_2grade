package week06.sec01.homeworks;

import java.util.Scanner;

public class H06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("x 부터 y까지 반복.");
        System.out.println("x 입력:");
        int x = input.nextInt();
        System.out.println("y 입력:");
        int y = input.nextInt();
        int sum = 0;
        for(int i = x; i<=y; i++){
            sum += i;
        }
        System.out.printf("%s 부터 %s 까지의 합: %s", x,y,sum);
    }
}
