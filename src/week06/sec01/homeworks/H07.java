package week06.sec01.homeworks;

public class H07 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 19; i+=2){
            System.out.print(i + " + ");
            sum += i;
        }
        System.out.println("\b\b= " + sum);
    }
}
