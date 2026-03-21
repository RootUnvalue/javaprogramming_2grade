package week03.sec02.homeworks;

import java.util.Scanner;

public class H8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sA, sB, sC, sD;//sold per menu
        System.out.println("A 메뉴가 얼마나 팔렸는가?");
        sA = input.nextInt();
        System.out.println("B 메뉴가 얼마나 팔렸는가?");
        sB = input.nextInt();
        System.out.println("C 메뉴가 얼마나 팔렸는가?");
        sC = input.nextInt();
        System.out.println("D 메뉴가 얼마나 팔렸는가?");
        sD = input.nextInt();

        System.out.println("가격표");
        int pA, pB, pC, pD;//price per menu
        pA = 2500; pB = 3800; pC = 5200; pD = 2200;
        System.out.printf("A 메뉴의 가격: %d%nB메뉴의 가격: %d%nC메뉴의 가격: %d%nD메뉴의 가격: %d%n%n", pA, pB, pC, pD);

        System.out.println("원가표");
        int mA, mB, mC, mD;//make price per menu
        mA = 1000; mB = 3000; mC = 4200; mD = 1600;
        System.out.printf("A 메뉴의 원가: %d%nB메뉴의 원가: %d%nC메뉴의 원가: %d%nD메뉴의 원가: %d%n%n", mA, mB, mC, mD);

        int totalSales = sA*pA + sB*pB + sC*pC + sD*pD;
        System.out.println("총 수익: " + totalSales);
        int profit = totalSales - (sA*mA + sB*mB + sC*mC + sD*mD);
        System.out.println("순익: " + profit);
    }
}
