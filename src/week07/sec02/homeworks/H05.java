package week07.sec02.homeworks;

public class H05 {
    public static void main(String[] args) {
        System.out.println("x^2-9X+14=0");
        int x;
        for(x = 0; ;x++) if((int)(Math.pow(x,2) - 9*x + 14) == 0) break;
        System.out.println("0으로부터 가장 가까운 해는 : " +  x);
    }
}
