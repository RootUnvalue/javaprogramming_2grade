package week09.sec01.homeworks;

public class H06 {
    public static void main(String[] args) {
        String str = "김민혁은 바보다, 김민혁은 게이다, 김민혁은 투기꾼이다";
        String[] strs = str.split(", ");
        for(String s: strs){
            System.out.println(s);
        }
    }
}
