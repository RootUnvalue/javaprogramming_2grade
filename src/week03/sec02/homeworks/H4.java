package week03.sec02.homeworks;

import java.util.Scanner;

public class H4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("정수를 입력...");
        int x = input.nextInt();
        int y;
        System.out.println("입력받은 x: " + x);
        y = x++;
        System.out.println("y = x++ : " + y);
        y = ++x;
        System.out.println("y = ++x : " + y);

    }
}
