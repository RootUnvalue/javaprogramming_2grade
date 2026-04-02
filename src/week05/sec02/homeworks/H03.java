package week05.sec02.homeworks;

import java.util.Scanner;

public class H03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---메뉴---\n김치찌개: 9,000원\n소머리국밥: 10,500원\n된장찌개: 8,500원\n냉면: 7,700원\n모든 메뉴는 취사병 출신 주방장이 만들어 드립니다.");
        System.out.println("메뉴를 선택");
        String menu =  input.nextLine();
        System.out.println("얼마나 주문?");
        int menuOut = input.nextInt();
        int price = switch (menu) {
            case "김치찌개" -> 9000;
            case "소머리국밥" -> 10500;
            case "된장찌개" -> 8500;
            case "냉면" -> 7700;
            default -> {
                System.out.println("그런 메뉴는 없지만 만들어 드릴 수 있습니다.\n주방장은 육군 조리병 출신으로 병장 만기 전역하여 대부분의 메뉴를 소화 가능한 인재입니다.\n 우리 주방장의 약력으로는 7사단 신병교육대 수로 후 22사단 산하 모 중대에서 근무, 상병진누1회, 병장진누1회, 대대장 주관 대대조리병 경연대회 자문위위를 지낸 바 있습니다.");
                yield 0;
            }
        };
        System.out.printf("선택한 메뉴 %s, 주문 개수 %d개, 총 가격 %d원", menu, menuOut, price*menuOut);
    }
}
