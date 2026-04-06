package week05.sec01.homeworks;

import java.util.Scanner;

public class H10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("학생의 성적 입력");
        int score = input.nextInt();
        String grade;
        if (score >= 95) grade = "A+";
        else if (score >= 90) grade = "A";
        else if (score >= 85) grade = "B+";
        else if (score >= 80) grade = "B";
        else if (score >= 70) grade = "C+";
        else if (score >= 60) grade = "C";
        else if (score >= 50) grade = "D+";
        else if (score >= 40) grade = "D";
        else if (score >= 30) grade = "E";
        else grade = "F";
        System.out.println("해당 학생의 성적: " + grade);
    }
}
