package LearningJava.exercises.practice;

public class BuscarNumero {
    public static void main(String[] args) {
        int [] nums = {3, 5, 7, 10, 15};
        int buscar = 8;
        boolean encontrado = false;

        for (int i = 0; i < nums.length; i++){
            if(nums [i] == buscar) {
                encontrado = true;
                break;
            }
        }
        if (encontrado){
            System.out.println("Numero encontrado");
        } else {
            System.out.println("Numero no encontrado");
        }
    }
}
