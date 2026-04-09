package week06.sec02.homeworks;

import java.util.Scanner;

public class H14 {
    public static void main(String[] args) {
        System.out.println("x부터 y까지의 홀/짝수의 합 출력");
        int x, y;
        Scanner input = new Scanner(System.in);
        System.out.println("x입력");
        x = input.nextInt();
        System.out.println("y입력");
        y = input.nextInt();
        System.out.println("짝수만 출력: 짝\n홀수만 출력: 홀");
        char act = input.next().charAt(0);
        int i = x, sum = 0;
        switch (act) {
            case '짝':
                while (i<=y){
                    if(i%2==0) sum += i;
                    i++;
                }
                System.out.printf("%d 부터 %d 까지의 짝수의 합: %d", x, y, sum);
                break;
            case '홀':
                while (i<=y){
                    if(i%2!=0) sum += i;
                    i++;
                }
                System.out.printf("%d 부터 %d 까지의 홀수의 합: %d", x, y, sum);
                break;
            default:
                System.out.println("알수없는명령");
                break;
        }
    }
}
