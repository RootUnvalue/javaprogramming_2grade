package week03.sec02.homeworks;

import java.util.Scanner;

public class H7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int price, used1000W, used500W, used100W;

        System.out.println("물건의 가격을 입력하라!");
        price =  input.nextInt();
        System.out.println("1000원을 투입 개수는?");
        used1000W = input.nextInt();
        System.out.println("500원 투입 개수는");
        used500W = input.nextInt();
        System.out.println("100원 투입 개수는");
        used100W = input.nextInt();

        int vPrice = used1000W*1000 + used500W*500 + used100W*100;
        System.out.println("받은 돈: " + vPrice);
        vPrice = vPrice - price;
        if (vPrice < 0) {
            System.out.println("돈이 모자름 -> 프로그램 종료");
            return;
        }
        else if (vPrice == 0) {
            System.out.println("받은돈이 물건값과 일치! 거스름돈 없습니다~");
        }
        System.out.println("총 거스름 돈: " + vPrice);

        int return1000W=0, return500W=0, return100W=0;
        while (vPrice >= 1000) {
            vPrice = vPrice - 1000;
            return1000W++;
        }
        while (vPrice >= 500) {
            vPrice = vPrice - 500;
            return500W++;
        }
        while (vPrice >= 100){
            vPrice = vPrice - 100;
            return100W++;
        }
        System.out.printf("천원 %s 개, 오백원 %s개, 백원 %s개 반환됨.", return1000W, return500W, return100W);
    }
}
