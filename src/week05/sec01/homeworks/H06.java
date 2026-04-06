package week05.sec01.homeworks;

import java.util.Scanner;

public class H06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("정수를 입력:");
        int x =  input.nextInt();
        if(x>=10) System.out.printf("%s는 10보다 크거나 같습니다.", x);
        else System.out.printf("%s는 10보다 작습니다.", x);
    }
}
