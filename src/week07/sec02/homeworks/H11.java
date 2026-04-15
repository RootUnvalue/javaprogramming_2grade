package week07.sec02.homeworks;

public class H11 {
    //X^2-9X+14=0의 해를 구하고 구한 후에 멈추는 코드 작성.
    public static void main(String[] args) {
        System.out.println("x^2 - 9x + 14 = 0의 해를 구하면 멈추는 코오드");
        //해를 하나만? 구하면
        for (int i = 0; ; i++) {
            if((int)(Math.pow(i,2))-9*i + 14 != 0) continue;
            System.out.println("(첫번째) 해: " + i);
            break;
        }
    }
}
