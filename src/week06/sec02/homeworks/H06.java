package week06.sec02.homeworks;

import java.util.Scanner;

public class H06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char act;
        int result = 0;
        System.out.println("첫 번째 수 입력:");
        int x = input.nextInt();
        System.out.println("두 번째 수 입력:");
        int y = input.nextInt();
        while(true){
            System.out.println("명령안내:\n덧셈: +\n뺄셈: -\n곱셈: *\n나눗셈: /\n나머지연산: %");
            act = input.next().charAt(0);
            if (act == '+') result = x+y;
            else if (act == '-') result = x-y;
            else if (act == '*') result = x*y;
            else if (act == '/') result = x/y;
            else if (act == '%') result = x%y;
            else {
                System.out.println("알 수 없는 명령");
                continue;
            }
            System.out.printf("%d %c %d = %d", x, act, y, result);
            break;
        }
    }
}
