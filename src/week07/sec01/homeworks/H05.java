package week07.sec01.homeworks;

public class H05 {
    public static void main(String[] args) {
        int i = 1, product = 1;
        do product *= i++; while (i<11);
        System.out.println(product);
    }
}
