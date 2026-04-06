package week05.sec01.homeworks;

import java.util.Scanner;

public class H08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("원금입력.");
        double baseMoney =  input.nextDouble();
        System.out.println("이자율 입력.(예: 0.5)");
        double ratio = input.nextDouble();
        System.out.println("기간입력.(단위: 년)");
        double year = input.nextDouble();

        System.out.println("명령입력.\n단리: 1\n복리: 1을 제외한 다른 키를 입력");
        char act = input.next().charAt(0);
        if(act=='1'){
            System.out.println("단리 계산.");
            double simple_interest = baseMoney*ratio*year;
            System.out.printf("원금 %.2f, 이율 %.2f%%, 기간 %.0f년인 경우\n총 단리 이자: %.2f\n",baseMoney, ratio*100, year, simple_interest);
        }
        else{
            System.out.println("복리 계산.");
            double compound_interest = baseMoney* Math.pow((1 + ratio), year);
            System.out.printf("원금 %.2f, 이율 %.2f%%, 기간 %.0f년인 경우\n총 복리 이자: %.2f\n", baseMoney, ratio*100, year, compound_interest);
        }
    }
}
