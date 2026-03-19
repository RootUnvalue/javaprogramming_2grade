package week03.sec02.works;

public class W5 {
    public static void main(String[] args) {
        int x = 5;
        double y = 0.0;
        double z = x / y;
        //wrong code
        //double z = x % y;
        System.out.println(x + 2);
        if(Double.isNaN(z) || Double.isInfinite(z)){
            System.out.println("산출 x");
        }
        else
        {
            System.out.println(x + 2);
        }
    }
}
