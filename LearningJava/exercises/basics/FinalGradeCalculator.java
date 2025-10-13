package LearningJava.exercises.basics;

import java.util.Scanner;

public class FinalGradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float participation, evaluationOne, evaluationTwo, finalEvaluation, total;

        System.out.println("Enter your participation: ");
        participation = input.nextFloat();

        System.out.println("Enter Your First grade: ");
        evaluationOne = input.nextFloat();

        System.out.println("Enter Your Second grade: ");
        evaluationTwo = input.nextFloat();

        System.out.println("Enter your final grade: ");
        
        finalEvaluation = input.nextFloat();

        participation *= 0.10;
        evaluationOne *= 0.25;
        evaluationTwo *= 0.25;
        finalEvaluation *= 0.40;

        total = participation + evaluationOne + evaluationTwo + finalEvaluation;
        System.out.println("Your final grade is: "+ total);

        input.close();
    }
}
