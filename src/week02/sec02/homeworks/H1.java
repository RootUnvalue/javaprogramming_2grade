package week02.sec02.homeworks;

public class H1 {
    public static float dCTodF(float c) {
        return c*9/5 + 32;
    }

    public static double dFTodD(double f) {
        return (f-32) * 5 / 9;
    }

    public static float getCircleS(int r){
        return (float) Math.PI * r * r;
    }

    public static float getCircleV(int r){
        return (float) Math.PI * 4 * r * r * r / 3;
    }

    public static double danri(double b, double r, double m){
        return b * (1+r+m);
    }

    public static double bokri(double b, double r, double m){
        return b * Math.pow((1+r), m);
    }

    public static void main(String[] args) {

        int c = 10;
        int f = 50;
        System.out.println("섭씨 " + c +"도 -> 화씨 " + dCTodF(c) + "도");
        System.out.println("화씨 " + f +"도 -> 섭씨 " + dFTodD(f) + "도");

        int r = 3;
        System.out.println("반지름 " + r + "인 원의 면적 s는 " + getCircleS(r));
        System.out.println("반지름 " + r + "인 원의 부피 v는 " + getCircleV(r));

        double baseMoney, ration, month;
        baseMoney = 10000;
        ration = 0.24;
        month = 18;
        System.out.println("원금 " + baseMoney + ", 이자율 " + ration +  ", 기간 " + month + "개월인 경우");
        System.out.println("단리 : " + danri(baseMoney, ration, month));
        System.out.println("복리 : " + bokri(baseMoney, ration, month));



    }
}
