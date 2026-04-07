package week06.sec01.homeworks;

import java.util.Scanner;

public class H16 {
    public static void main(String[] args) {
        System.out.println("x -> y 까지의 곱");
        Scanner input = new Scanner(System.in);
        System.out.println("x입력");
        int x = input.nextInt();
        System.out.println("y입력");
        int y = input.nextInt();
        long product_odd = 1;
        long product_even = 1;
        for(int i = x; i<=y; i++) if(i%2==0) product_even *= i; else product_odd *= i;
        System.out.println(x + "부터" + y +"까지의 짝수 들의 곱" + product_even);
        System.out.println(x + "부터" + y +"까지의 홀수 들의 곱" + product_odd);
    }
}
