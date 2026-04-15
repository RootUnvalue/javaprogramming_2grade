package week07.sec02.homeworks;

public class H07 {
    public static void main(String[] args) {
        //1부터 100까지 중 홀수만 더하는 프로그램을 작성하세요
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) continue;
            sum += i;
        }
        System.out.println("1부터 100까지 홀수만 더한 결과: " + sum);
    }
}
