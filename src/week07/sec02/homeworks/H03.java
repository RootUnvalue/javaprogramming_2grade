package week07.sec02.homeworks;

import java.util.Scanner;

public class H03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("어서오세요");
        int count = 0;
        char act;
        while(true){
            System.out.println("메뉴를 선택하세요");
            System.out.println("1.돈까스 2.파스타 3.피자 4.김치찌개 5.주문종료");
            act = input.nextLine().charAt(0);
            if (act == '5') break;
            count++;
        }
        System.out.println("주문이 완료되었습니다.");
        System.out.println("지금까지 주문하신 메뉴의 개수: " + count);

    }
}
