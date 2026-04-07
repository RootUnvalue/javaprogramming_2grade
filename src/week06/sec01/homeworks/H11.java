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
        for(int i = x; i<=y; i++) if(i%2==0) System.out.println(i + "는 짝수입니다."); else System.out.println(i + "는 홀수입니다.");
    }
}
