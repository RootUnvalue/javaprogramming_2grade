package week06.sec01.homeworks;

import java.util.Scanner;

public class H15 {
    public static void main(String[] args) {
        System.out.println("x -> y 까지의 곱");
        Scanner input = new Scanner(System.in);
        System.out.println("x입력");
        int x = input.nextInt();
        System.out.println("y입력");
        int y = input.nextInt();
        long product = 1;
        for(int i = x; i<=y; i++) product *= i;
        System.out.println(x + "부터" + y +"까지의 곱" + product);
    }
}
