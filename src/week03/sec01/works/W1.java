package week03.sec01.works;

public class W1 {
    public static void main(String[] args) {
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue: " + intValue);

        char  charValue = '가';
        System.out.println("'가'의 유니코드: " + charValue);
        intValue = 50;
        long longValue = intValue;
        System.out.println("intValue: " + intValue);
        float floatValue = longValue;
        System.out.println("floatValue: " + floatValue);
        floatValue = 100.5F;
        double doubleValue = floatValue;
        System.out.println("doubleValue: " + doubleValue);
    }
}
