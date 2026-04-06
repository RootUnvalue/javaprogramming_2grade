package week05.sec01.homeworks;

import java.util.Scanner;

public class H07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("정수1 입력.");
        int num1 = input.nextInt();
        System.out.println("정수2 입력.");
        int num2 = input.nextInt();
        System.out.println("명령입력.\n덧셈 or 뺄셈: 1\n곱셈 or 나눗셈: 1외의 다른 키\n");
        char act = input.next().charAt(0);
        if (act=='1') {
            System.out.println("명령입력. \n덧셈: 1\n뺄셈: 1외의 다른 키 ");
            act = input.next().charAt(0);
            if (act=='1') System.out.printf("%d + %d = %d\n",num1,num2,(num1+num2));
            else System.out.printf("%d - %d = %d\n",num1,num2,(num1-num2));
        } else {
            System.out.println("명령입력. \n곱셈: 1\n나눗셈: 1외의 다른 키 ");
            act = input.next().charAt(0);
            if (act=='1') System.out.printf("%d * %d = %d\n", num1, num2, (num1 * num2));
            else System.out.printf("%d / %d = %d\n",num1,num2,(num1/num2));
        }
    }
}
