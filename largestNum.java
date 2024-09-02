package Assignment;

//Q1. Write a program to find the largest of the three given number. take input from the user.

import java.util.Scanner;
public class largestNum {

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

    System.out.println("Enter num1: ");
    int num1 = sc.nextInt();

    System.out.println("Enter num2: ");
    int num2 = sc.nextInt();

    System.out.println("Enter num3: ");
    int num3 = sc.nextInt();

    if (num1 >= num2 && num1 >= num3)
    {
      System.out.println("Largest number is:" + num1);
    } 
    else if(num2 >= num1 && num2 >= num3)
    {
      System.out.println("Largest number is:" + num2);
    }
    else
    {
      System.out.println("Largest number is:" + num3);
    }

    sc.close();
}
}