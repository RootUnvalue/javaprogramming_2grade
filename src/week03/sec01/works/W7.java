package week03.sec01.works;

import java.util.Scanner;

public class W7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input X:");
        String strX = scanner.nextLine();
        int x = Integer.parseInt(strX);

        System.out.println("input Y:");
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY);

        int result = x + y;
        System.out.println("X + Y = " + result);

        while(true){
            System.out.println("Input Q.");
            String data = scanner.nextLine();
            if(data.equals("Q")){
                break;
            }
            System.out.println("inputted data: " + data);
            System.out.println(" ");
        }

        System.out.println("END");
    }
}
