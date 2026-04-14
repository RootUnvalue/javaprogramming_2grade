package week07.sec01.homeworks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class H03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("7x^2 + 4y 를 구한다");
        System.out.println("종료하려면 아무때나 q를 입력");
        int x,y;
        boolean loop = true;
        do{
            System.out.println("x:");
            String line = input.nextLine();
            if(line.equals("q")){
                loop = false;
            } else {
                x = Integer.parseInt(line);
                System.out.println("y:");
                line = input.nextLine();
                if (line.equals("q")) {
                    loop = false;
                } else {
                    y = Integer.parseInt(line);
                    System.out.printf("x = %d, y = %d\n7x^2 + 4y = %d%n", x, y, (int)(7 * Math.pow(x, 2) + 4 * y));
                }
            }
        } while (loop);
        System.out.println("종료");

//        useTry_Catch();
    }

//    public static void useTry_Catch() {
//        System.out.println("7x^2 + 4y 를 구한다");
//        System.out.println("종료를 원하면 언제든 q를 입력!");
//        Scanner input = new Scanner(System.in);
//        try {
//            do {
//                System.out.println("x: ");
//                int x = input.nextInt();
//                System.out.println("y: ");
//                int y = input.nextInt();
//                System.out.printf("x = %s, y = %s 인 경우\n", x, y);
//                System.out.println("결과는 이렇다. " + 7 * Math.pow(x, 2) + 4 * y);
//            } while (true);
//        } catch (InputMismatchException e) {
//            System.out.println("종료");
//        }
//    }
}
