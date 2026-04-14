package week07.sec02.homeworks;

public class H02 {
    public static void main(String[] args) {
        System.out.print("7과 5의 최소공배수");
        int i = 1;
        while (true) {
            if(i%7 == 0 && i%5 == 0) break;
            i++;
        }
        System.out.println(": " + i);
    }
}
