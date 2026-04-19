import java.util.Scanner;

public class Main {

    public static class lost{
        protected int age;
        private lost(){
            this.age = 99;
        }
    }
public static void main(String[] args) {
    System.out.println("Main Page");
    for (int i = 0, j = 10; i <= 5 && j >= 10; i++, j--) {
        System.out.println("i=" + i + " j=" + j);
    }
    String str = "yes";
    if (str == "yes") System.out.println("true");

    lost as = new lost();

    int x = 10, y = 20;
    int z = ++x + y++;
    System.out.println(z + " and " + y);

    while(true){
        while (true){
            break;
        }
        System.out.println("실행?");
        break;
    }
    Scanner input = new Scanner(System.in);
    char a = input.next().charAt(0);
    char v1 = 'A';
    int v2 = v1;
    input.next();
    }
}