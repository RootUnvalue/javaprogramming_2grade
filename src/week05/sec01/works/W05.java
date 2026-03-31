package week05.sec01.works;

public class W05 {
    public static void main(String[] args) {
        int score = 75;
        if(score >= 90) {
            System.out.println("점수가 100~90이다.");
            System.out.println("A등급이다.");
        } else if(score >= 80) {
            System.out.println("점수가 80~89이다.");
            System.out.println("B등급이다.");
        } else if(score >= 70) {
            System.out.println("점수가 70~79이다.");
            System.out.println("C등급이다.");
        } else {
            System.out.println("점수가 70 미만이다.");
            System.out.println("D등급이다.");
        }
    }
}