package week07.sec02.homeworks;

public class H08 {
    //1에서 73까지의 숫자 중 6으로 끝나는 숫자만 출력하는 프로그램을 구성하시오
    public static void main(String[] args) {
        for (int i = 1; i<74; i++) {
            if(i % 10 != 6) continue;
            System.out.print(i + ", ");
        }
        System.out.println("\b\b");
    }
}
