package week02.sec01;

import java.util.Scanner;

public class VariableInitializationExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("정수를 입력.");
        int value = input.nextInt();
        int result = value + 10;
        System.out.println(value + "에 10을 더한 결과: "  + result);

    }
}
