package LearningJava.exercises.PracticeOfArrays;

public class NumeroMayor {
    public static void main(String[] args) {

        int [] nums = {2, 5, 10, 17, 6, 4};
        int mayor = 0;

        for (int i = 0; i < nums.length; i ++) {
            if (nums [i] > mayor){
                mayor = nums[i];
            }
        }
        System.out.println("El numero mayor es: " +mayor);
    }

}
