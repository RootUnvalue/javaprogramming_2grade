package week09.sec02.homeworks;

import java.util.Arrays;

public class H01 {
    public static void main(String[] args) {
        int[] arrInt = new int[] {1,2,3,4,5};
        System.out.println(Arrays.toString(arrInt));

        boolean[] arrBool = new boolean[] {true,false,false,false,false};
        System.out.println(Arrays.toString(arrBool));

        String[] arrStr = new String[] {"Java","IS","VERY","EASY","!"};
        System.out.println(Arrays.toString(arrStr));

        double[] arrDouble = new double[] {1.0,2.0,3.0,4.0,5.0};
        System.out.println(Arrays.toString(arrDouble));

        float[] arrFloat = new float[] {1.0f,2.0f,3.0f,4.0f,5.0f};
        System.out.println(Arrays.toString(arrFloat));

        char[] arrChar = new char[] {'a','b','c','d','e'};
        System.out.println(Arrays.toString(arrChar));
    }
}
