package week06.sec01.homeworks;

import java.util.Scanner;

public class H11 {
    public static void main(String[] args) {
        System.out.println("x -> y 반복");
        Scanner input = new Scanner(System.in);
        System.out.println("x입력:");
        int x = input.nextInt();
        System.out.println("y 입력");
        int y =  input.nextInt();
        int sum_odd = 0, sum_even = 0;
        for(int i = x; i<=y; i++) if(i%2==0) sum_even += i; else sum_odd += i;
        System.out.printf("%d 부터 %d 까지\n홀수들의 합: %d\n짝수들의 합: %d", x, y, sum_odd, sum_even);
    }
}
