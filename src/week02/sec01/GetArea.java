package week02.sec01;

public class GetArea {
    public static int getTriangleAreaInt(int height, int bottom) {
        return height * bottom / 2;
    }

    public  static int getSquareAreaInt(int height, int bottom) {
        return height * bottom;
    }

    public static float getCircleAreaFloat(int radius) {
        float pi = 3.141592f;
        radius = radius / 2;
//        return pi * radius * radius;
        return (float) (Math.PI) * radius * radius;
    }


    public static void main(String[] args) {

        int h, l;
        h = 4;
        l = 6;

        System.out.println("삼각형");
        System.out.println("Int -> 높이 " + h + " , 밑변 " + l + " 인 삼각형의 넓이: " + getTriangleAreaInt(h, l));

        System.out.println("사각형");
        System.out.println("Int -> 높이 " + h + " , 밑변 " + l + " 인 사각형의 넓이: " + getSquareAreaInt(h, l));

        System.out.println("원");
        System.out.println("Float -> 지름 " + l + "인 원의 넓이 " + getCircleAreaFloat(l));

    }
}
