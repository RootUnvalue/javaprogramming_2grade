package week07.sec02.homeworks;

public class H04 {
    public static void main(String[] args) {
        System.out.println("f(x, y) = 4x + 5y");
        System.out.println("x, y가 0부터 시작, f(x, y) = 60를 만족하면 바로 종료");
        String pairs = "";
        qksqhr: for(int x = 0; x <= 15; x++){
            for(int y = 0; y <= 12; y++){
                if (4 * x == 60 - 5 * y) {
                    pairs = pairs + "f(" + Integer.toString(x) + ", " + Integer.toString(y) + "), ";
                    break qksqhr;
                    //if, make break qksqhr; to comment
                    //get all f(x,y) when x,y are positive integer
                }
            }
        }
        System.out.println(pairs + "\b\b");
    }
}
