package week06.sec01.homeworks;

import java.util.Scanner;

public class H10 {
    public static void main(String[] args) {
        System.out.println("반복횟수입력");
        Scanner input = new Scanner(System.in);
        int n =  input.nextInt();
        for(int i = 1; i<=n; i++) if(i%2==0) System.out.println(i + "는 짝수입니다."); else System.out.println(i + "는 홀수입니다.");
    }
}
