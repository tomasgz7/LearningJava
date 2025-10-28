package LearningJava;

public class EmpireLyrics {
    public static void main(String[] args) throws InterruptedException {

        String[] lyrics = {
            "It's the start of the end, surrender the throne,",
            "The blood on my hands covered the holes...",
            "We've been surrounded by vicious cycles.",
            "And we're truly alone ",
            "The scars on your heart are yours to atone,",
            "We've been surrounded, let 'em sing, let 'em sing"
        };

        System.out.println("🎵 Bring Me The Horizon – Empire (Let Them Sing)");
        System.out.println("------------------------------------------------\n");

        for (String line : lyrics) {
            System.out.println(line);
            Thread.sleep(3000); // pausa de 1.5 segundos entre líneas
        }

        System.out.println("\n Empire has fallen, long live the Empire ");
    }
}
