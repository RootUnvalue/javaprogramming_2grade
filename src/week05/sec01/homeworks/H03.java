package week05.sec01.homeworks;

import java.util.Scanner;

public class H03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("정수1 입력.");
        int num1 = input.nextInt();
        System.out.println("정수2 입력.");
        int num2 = input.nextInt();
        while(true){
            System.out.println("명령입력.\n덧셈: 1\n뺄셈: 2\n곱셈: 3\n나눗셈: 4");
            char act = input.next().charAt(0);
            if (act=='1') {
                System.out.printf("%d + %d = %d\n",num1,num2,(num1+num2));
                break;
            }
            if (act=='2') {
                System.out.printf("%d - %d = %d\n",num1,num2,(num1-num2));
                break;
            }
            if (act=='3') {
                System.out.printf("%d * %d = %d\n", num1, num2, (num1 * num2));
                break;
            }
            if (act=='4') {
                System.out.printf("%d / %d = %d\n",num1,num2,(num1/num2));
                break;
            }
            System.out.println("다시 입력하세요.");
        }
    }
}
