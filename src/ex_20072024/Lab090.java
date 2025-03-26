package ex_20072024;

import java.util.Scanner;

public class Lab090 {
    public static void main(String[] args) {
        //grade calculator
        //program to calculate the grade
        // A : 90-100
        // B : 80-89
        // C : 70-79
        // D : 60-69
        // E : 0-59
        // Find the user inputs
        // score data type = integer
        //return -> grade - data-type-char - A

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student Score ");
        int Score = sc.nextInt();

        char Grade = 'F';

        if (Score >=90  && Score <=100){
            Grade = 'A';
        }
        else if (Score >=80  && Score <=89){
            Grade = 'B';
        }
        else if (Score >=70  && Score <=79){
            Grade = 'C';
        }
        else if (Score >=60  && Score <=69){
            Grade = 'D';
        }
        else if (Score <=59){
            Grade = 'E';
        }
        System.out.println ("Your Grade is " + Grade);

        sc.close();


    }
}
