package LearningJava.exercises.operators;
/*  Build a program that, given a total number of hours, returns the equivalent number of weeks, days, and hours.
For example, given a total of 1000 hours, it should display 5 weeks, 6 days, and 16 hours. */
import java.util.Scanner;

public class HoursToWeeksDaysCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int totalHours, weeks, days, remainingHours;

        System.out.println("Enter the hours: ");
        totalHours = input.nextInt();

        weeks =  totalHours / 168;
        days = ( totalHours % 168) / 24;
        remainingHours = totalHours % 24;

        System.out.println("The total week is: " +weeks);
        System.out.println("The total days is: " +days);
        System.out.println("The total hours is: " +remainingHours);

    }
}
