package LearningJava.exercises.operators;

import java.util.Scanner;

/*Exercise 4:
A used car sales company pays its sales staff a monthly salary of $1000, plus a $150 commission per car sold, and an additional 5% of the total value of each car sold.
Each month, the company's data entry clerk enters the relevant data into the computer.
Write a program that calculates and prints the monthly salary of a given salesperson.   
 */
public class CarSalesSalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float monthlySalary, plus, commission, total;
        
        monthlySalary = 1000;
        commission = 150;
        System.out.println("Enter the number of cars sold: ");
        plus = input.nextFloat();

        total = (plus * commission) + monthlySalary;
        System.out.println("Your monthly Salary is: " + total);

        input.close();
    }
    
}
