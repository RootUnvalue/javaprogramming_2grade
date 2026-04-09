package week06.sec02.homeworks;

import java.util.Scanner;

public class H17 {
    public static void main(String[] args) {
        System.out.println("x 부터 y까지의 곱");
        int x, y;
        Scanner input = new Scanner(System.in);
        System.out.println("x입력");
        x = input.nextInt();
        System.out.println("y입력");
        y = input.nextInt();
        long product_odd = 1;
        long product_even = 1;
        int i=1;
        while (i<=y){
            if (i%2==0){
                product_even *= i;
            }
            else {
                product_odd *= i;
            }
            i++;
        }
        System.out.println(x +"부터"+y+"까지\n짝수들의 곱: " + product_even +"\n홀수들의 곱: " + product_odd);
    }
}
