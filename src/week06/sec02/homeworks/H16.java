package week06.sec02.homeworks;

public class H16 {
    public static void main(String[] args) {
        int i = 3;
        long product = 1;
        while(i<=30){
            product *= i;
            i++;
        }
        System.out.println("3부터 30까지의 곱: " + product);
    }
}
