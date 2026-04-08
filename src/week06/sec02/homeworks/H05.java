package week06.sec02.homeworks;

public class H05 {
    public static void main(String[] args) {
        int i = 1, product = 1;
        while(i<=10){
            product *= i;
            i++;
        }
        System.out.println("10! = " + product);
    }
}
