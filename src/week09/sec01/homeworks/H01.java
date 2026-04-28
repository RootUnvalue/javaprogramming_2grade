package week09.sec01.homeworks;

public class H01 {
    public static void main(String[] args) {
        String str = "afosidqewrx2jrecfk90gkc2,x390fu";
        for (int i = 0; i < 5; i++) {
            int rand = (int)(Math.random() * str.length() + 1) -1;
            System.out.println("index(random): " + rand + ", 문자: " +str.charAt(rand));
        }
    }
}
