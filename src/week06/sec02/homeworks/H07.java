package week06.sec02.homeworks;

import java.util.Scanner;

public class H07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("stop입력시 종료. 숫자 입력시 종료전까지 입력된 총합, 평균 계산");
        int sum = 0, i = 0;
        float avg = 0;
        while(true){
            System.out.println("입력:");
            String x = input.nextLine();
            if(x.equals("stop")) {
                avg = (float) sum / i;
                System.out.println("입력된 수의 총합: " + sum + "\n입력된 수의 평균: " + avg + "\n반복횟수: " + i);
                break;
            }
            sum += Integer.parseInt(x);
            i++;
        }

    }
}
