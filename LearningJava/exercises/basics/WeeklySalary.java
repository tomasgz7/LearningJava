package LearningJava.exercises.basics;

import java.util.Scanner;

/*  
 Write a program that calculates and prints an employee’s weekly salary given the hours worked in the week and the hourly wage.
 */
public class WeeklySalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float hours, hourlyWage, total;

        System.out.println("Enter your worked hours: ");
        hours = input.nextFloat();

        System.out.println("Enter your hourly wage: ");
        hourlyWage = input.nextFloat();

        total = hours * hourlyWage;
     
        System.out.println("The total weekly salary is: " + total);

        input.close();
    }
    
}
