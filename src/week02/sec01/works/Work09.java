package week02.sec01.works;

public class Work09 {
    public static int getTriangleAreaInt(int height, int bottom) {
        return height * bottom / 2;
    }
    public static byte getTriangleAreaByte(int height, int bottom) {
        return (byte) (height * bottom / 2);
    }
    public static short getTriangleAreaShort(int height, int bottom) {
        return (short) (height * bottom / 2);
    }
    public static float getTriangleAreaFloat(int height, int bottom) {
        return (float) (height * bottom / 2);
    }

    public  static int getSquareAreaInt(int height, int bottom) {
        return height * bottom;
    }
    public  static byte getSquareAreaByte(int height, int bottom) {
        return (byte) (height * bottom);
    }
    public  static short getSquareAreaShort(int height, int bottom) {
        return (short) (height * bottom);
    }
    public  static float getSquareAreaFloat(int height, int bottom) {
        return (float) (height * bottom);
    }


    public static float getCircleAreaFloat(int radius) {
        float pi = 3.141592f;
        radius = radius/2;
        return pi * radius * radius;
//        return Math.PI * radius * radius;
    }
    public static int getCircleAreaInt(int radius) {
        float pi = 3.141592f;
        radius = radius/2;
        return (int)pi * radius * radius;
    }
    public static short getCircleAreaShort(int radius) {
        float pi = 3.141592f;
        radius = radius/2;
        return (short) (pi * radius * radius);
    }
    public static byte getCircleAreaByte(int radius) {
        float pi = 3.141592f;
        radius = radius/2;
        return (byte) (pi * radius * radius);
//        return Math.PI * radius * radius;
    }


    public static void main(String[] args) {

        int h, l;
        h = 4;
        l = 6;

        System.out.println("삼각형");
        System.out.println("Int -> 높이 " + h + " , 밑변 " + l + " 인 삼각형의 넓이: " + getTriangleAreaInt(h, l));
        System.out.println("Short -> 높이 " + h + " , 밑변 " + l + " 인 삼각형의 넓이: " + getTriangleAreaShort(h, l));
        System.out.println("Byte -> 높이 " + h + " , 밑변 " + l + " 인 삼각형의 넓이: " + getTriangleAreaByte(h, l));
        System.out.println("Float -> 높이 " + h + " , 밑변 " + l + " 인 삼각형의 넓이: " + getTriangleAreaFloat(h, l));

        System.out.println("사각형");
        System.out.println("Int -> 높이 " + h + " , 밑변 " + l + " 인 사각형의 넓이: " + getSquareAreaInt(h, l));
        System.out.println("Short -> 높이 " + h + " , 밑변 " + l + " 인 사각형의 넓이: " + getSquareAreaShort(h, l));
        System.out.println("Byte -> 높이 " + h + " , 밑변 " + l + " 인 사각형의 넓이: " + getSquareAreaByte(h, l));
        System.out.println("Float -> 높이 " + h + " , 밑변 " + l + " 인 사각형의 넓이: " + getSquareAreaFloat(h, l));

        System.out.println("원");
        System.out.println("Int -> 지름 " + l + "인 원의 넓이 " + getCircleAreaInt(l));
        System.out.println("Short -> 지름 " + l + "인 원의 넓이 " + getCircleAreaShort(l));
        System.out.println("Byte -> 지름 " + l + "인 원의 넓이 " + getCircleAreaByte(l));
        System.out.println("Float -> 지름 " + l + "인 원의 넓이 " + getCircleAreaFloat(l));

    }
}
