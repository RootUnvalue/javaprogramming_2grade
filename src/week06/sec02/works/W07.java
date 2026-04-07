package week06.sec02.works;

public class W07 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while(i<=100){
            sum += i;
            i++;
        }
        System.out.println("1부터 " + (i-1) + " 의 합:" + sum);
    }
}
