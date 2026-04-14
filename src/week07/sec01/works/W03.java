package week07.sec01.works;

public class W03 {
    public static void main(String[] args) {
        int i = 2;
        do{
            System.out.println(i + "단 ---------");
            int j = 1;
            do{
                System.out.println(i + " * " + j + " = " + (i*j));
                j++;
            } while (j<=9);
            i++;
            System.out.println();
        } while (i<=9);
    }
}
