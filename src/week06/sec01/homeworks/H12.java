package week06.sec01.homeworks;

import java.util.Scanner;

public class H12 {
    public static void main(String[] args) {
        System.out.println("구구단 단수를 입력");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        for (int i = 1; i<=9; i++) System.out.println(x + " * " + i + " = " + (x*i));
    }
}
