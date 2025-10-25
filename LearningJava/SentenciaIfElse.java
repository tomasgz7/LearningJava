package LearningJava;

public class SentenciaIfElse {
    public static void main(String[] args) {

        float promedio = 5.0f;

        if(promedio >= 6.5) {
            System.out.println("Fecilitaciones un excelente promedio");
        } else if (promedio >= 6.0){
            System.out.println("Muy buen promedio");
        } else if (promedio >= 5.5){
            System.out.println("Lo hiciste bien!");
        } else if(promedio >= 5.0) {
            System.out.println("Regular, estudia un poco mas");
        } else if (promedio >= 4.5) {
            System.out.println("Nota insuficiente, tenes que estudiar más");
        } else {
            System.out.println("Reprobado");
        }
        System.out.println("Tu promedio es: " + promedio);
    }
}
