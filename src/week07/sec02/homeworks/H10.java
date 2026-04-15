package week07.sec02.homeworks;

public class H10 {
    //100 이하의 자연수 중에 5의 배수이자 7의 배수인 정수를 전부출력하고, 그 수를 세어보는 프로그램
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 101; i++) {
            if (!(i % 5 == 0 && i % 7 == 0)) continue;
            System.out.print(i + ", ");
            count++;
        }
        System.out.println("\b\b");
        System.out.println("개수 : " + count);
    }
}
