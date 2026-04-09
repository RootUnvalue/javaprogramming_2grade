package week06.sec02.homeworks;

import java.util.Scanner;

public class H13 {
    public static void main(String[] args) {
        int i = 1;
        String odd = "", even = "";
        while(i<=50){
            if(i%2==0){
                even += i + " ";
            }
            else{
                odd += i + " ";
            }
            i++;
        }
        System.out.println("홀수\n" + odd + "\n짝수\n" + even);
    }
}
