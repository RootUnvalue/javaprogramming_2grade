package week07.sec02.homeworks;

public class H06 {
    public static void main(String[] args) {
        //구구단 짝수만 continue 써서
        for(int i = 2; i<10; i++) {
            for(int j = 1; j<10; j++) {
                if(i*j % 2 != 0) continue;
                else System.out.println(i + " * " + j + " = " + i*j);;
            }
        }
    }
}
