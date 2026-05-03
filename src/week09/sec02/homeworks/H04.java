package week09.sec02.homeworks;

public class H04 {
    public static void main(String[] args) {
        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++) arr[i] = (int)(Math.random() * 10000) + 1;

        for (int i : arr) System.out.println(i);

    }
}
