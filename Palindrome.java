package Assignment;

//Q4.Write a program to check the number is palindrome(same from backward and forward) or not.
import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");

    int number = sc.nextInt();

    int realNum = number;
    int revNum = 0;

    while (number != 0) {
      int temp = number%10;
      revNum = revNum * 10 + temp;
      number = number / 10;
    }

    if (realNum == revNum) {
      System.out.println("Its a palindrome number.");
    } else {
      System.out.println("Its not a palindrome number.");
    }


    sc.close();

  }
}
