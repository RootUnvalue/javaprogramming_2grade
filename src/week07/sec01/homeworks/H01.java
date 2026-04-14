package week07.sec01.homeworks;

import java.util.Scanner;

public class H01 {
    public static void main(String[] args) {
        int x,y, result = 0;
        char act;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("x: ");
            x = input.nextInt();
            System.out.println("y: ");
            y = input.nextInt();
            System.out.println("+ - * / 로 연산 선택. q시 종료. 다른값 입력시 xy다시 입력");
            act = input.next().charAt(0);
            if (act == '+') {
                result = x + y;
                break;
            } else if (act == '-') {
                result = x - y;
                break;
            } else if (act == '*') {
                result = x * y;
                break;
            } else if (act == '/') {
                result = x / y;
                break;
            }
        } while ( act != 'q' );
        System.out.printf("%d %c %d = %d", x, act, y, result);
    }
}
