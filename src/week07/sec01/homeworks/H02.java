package week07.sec01.homeworks;

import java.util.Scanner;

public class H02 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        String act, inputted = "";
        int sum = 0, avg = 0, i = 0;
        do {
            System.out.println("**q를 통해 종료**\n숫자 입력:");
            act = input.nextLine();
            if(!act.equals("q")) {
                sum += Integer.parseInt(act);
                inputted = inputted + act + ", ";
                i++;
            }
        } while (!act.equals("q"));
        System.out.println("입력받은 내역\n" + inputted + "\b\b");
        System.out.println("-----결과-----");
        System.out.println("sum: " + sum);
        avg = sum / i;
        System.out.println("avg: " + avg);
    }
}
