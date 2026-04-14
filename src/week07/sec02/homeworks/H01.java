package week07.sec02.homeworks;

public class H01 {
    public static void main(String[] args) {
        int i = 0, sum = 0;
        while(true){
            sum += i;
            if(sum >= 100){
                System.out.println("1부터 " + i + " 까지 더하니 100을 넘더라..");
                System.out.println("현재 sum: " + sum);
                break;
            }
            i++;
        }
    }
}
