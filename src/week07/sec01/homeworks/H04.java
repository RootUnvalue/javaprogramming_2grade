package week07.sec01.homeworks;

public class H04 {
    public static void main(String[] args) {
        int i = 1, sum = 0;
        do sum += i++; while (i<11);
        System.out.println(sum);
    }
}
