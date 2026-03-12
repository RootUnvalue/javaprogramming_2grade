package week02.sec02.homeworks;

public class H3 {
    public static float get3S(float h, float l){
        return h * l / 2;
    }

    public static float get4S(float h, float l){
        return h * l;
    }
    public static void main(String[] args) {
        int h, l;
        h = 4;
        l = 7;

        System.out.println("높이 " + h + "밑변 " + l + "인 경우");
        System.out.println("사격형의 넓이: " + get4S(h,l));
        System.out.println("삼각형의 넓이: " + get3S(h,l));
    }
}
