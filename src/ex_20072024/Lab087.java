package ex_20072024;

import java.util.Scanner;

public class Lab087 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in); //object of the scanner class - OOPS
        System.out.println("Enter the Number");
        int user_input = sc.nextInt();
        System.out.println(user_input);
        if (user_input%2 ==0){
            System.out.println("Even number");
        }else
            System.out.println("Odd number");
    }
}
