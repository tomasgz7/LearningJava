public class EjemploAutomovil {
    public static void main(String[] args) {
        
        Automovil subaru = new Automovil();
        subaru.fabricante = "Subaru";
        subaru.modelo = "Impreza";
        subaru.cilindrada = 2.0;
        subaru.color = "Negro";

        Automovil mazda = new Automovil();
        mazda.fabricante = "Mazda";
        mazda.modelo = "BT-50";
        mazda.cilindrada = 3.0;
        mazda.color = "Rojo";

       System.out.println(subaru.verDetalle());
       System.out.println(mazda.verDetalle());
       System.out.println(subaru.acelerar(3000)); 
       System.out.println(subaru.frenar());

       System.out.println(mazda.acelerarFrenar(4000));

    }

}
