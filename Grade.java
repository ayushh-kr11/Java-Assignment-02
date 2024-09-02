package Assignment;

//Q2. Write a program to display the grade of the student given marks. take input from the user.
import java.util.Scanner;
public class Grade {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.err.print("Enter student mark: ");
    int mark = sc.nextInt();

    if (mark>=80) 
    {
      System.out.println("Grade: A");
    } 
    else if(mark<80 && mark>=60)
    {
      System.out.println("Grade: B");
    }
    else if(mark<60 && mark>=30)
    {
      System.out.println("Grade: C");
    }
    else{System.out.println("Grade: F");}
  
    sc.close();
  }

}
