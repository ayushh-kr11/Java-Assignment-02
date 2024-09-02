package Assignment;

//Q3. Write a program to compute the number of days in a month by using switch statement.
import java.util.Scanner;
public class NumberOfDaysInMonth {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name of the month:");
    String month = sc.nextLine().trim();

    switch(month) {
        case "January":
            System.out.println("31 days");
            break;
        case "February":
            System.out.println("28 or 29 days");
            break;
        case "March":
            System.out.println("31 days");
            break;
        case "April":
            System.out.println("30 days");
            break;
        case "May":
            System.out.println("31 days");
            break;
        case "June":
            System.out.println("30 days");
            break;
        case "July":
            System.out.println("31 days");
            break;
        case "August":
            System.out.println("31 days");
            break;
        case "September":
            System.out.println("30 days");
            break;
        case "October":
            System.out.println("31 days");
            break;
        case "November":
            System.out.println("30 days");
            break;
        case "December":
            System.out.println("31 days");
            break;
        default:
            System.out.println("Invalid month name. Please enter a valid month.");
            break;
    }
    sc.close();
  }
}
