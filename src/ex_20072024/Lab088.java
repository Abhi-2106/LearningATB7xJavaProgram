package ex_20072024;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab088 {
    public static void main(String[] args) {
        //Max number in two inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num_1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num_2 = sc.nextInt();
        //System.out.println(Math.max(num_1, num_2));
     if (num_1>num_2)
         System.out.println(num_1);
     else if (num_2>num_1) {
         System.out.println(num_2);
         
     } else
         System.out.println("Equal");
    }
}