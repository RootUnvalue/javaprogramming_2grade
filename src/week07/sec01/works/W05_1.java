package week07.sec01.works;

public class W05_1 {
    public static void main(String[] args) throws Exception {
        for(char upper='A'; upper<='Z'; upper++) {
            for(char lower='a'; lower<='z'; lower++) {
                System.out.println(upper + " " + lower);
                if(lower=='g') {
                }
                break;
            }
        }
        System.out.println("프로그램 실행 종료");
    }
}