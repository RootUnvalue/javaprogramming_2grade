package week06.sec01.works;

public class W05 {
    public static void main(String[] args) {
        float x;
        int i = 0;
        for(x=0.1f; x <= 1.0f; x+=0.1f) {
            i=i+1;
            System.out.println(x+"i="+i);
        }
        System.out.println("for 문 나온 x: " + x + ", i = " + i);
    }
}
