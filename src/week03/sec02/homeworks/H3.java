package week03.sec02.homeworks;

import java.util.Scanner;

public class H3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age, height;
        System.out.println("나이를 입력: ");
        age = input.nextInt();
        System.out.println("키를 입력: ");
        height = input.nextInt();

        if ((age == 15) && (height > 150)) {
            System.out.println("나이가 15이고 키가 150을 넘었다!");
        }
        else {
            System.out.println("나이가 15가 아니거나 키가 150을 못넘었다!");
        }

    }
}
