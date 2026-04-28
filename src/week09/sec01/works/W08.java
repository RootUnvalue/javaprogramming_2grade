package week09.sec01.works;

public class W08 {
    public static void main(String[] args) {
        String ssn = "9506241230123";
        int length = ssn.length();
        if(length == 13) System.out.println("주민등록번호 자릿수가 맞음.");
        else System.out.println("주민등록번호 자릿수가 맞지않음.");
    }
}
