public class Automovil {

    String fabricante;
    String modelo;
    String color = "blanco";
    double cilindrada;

    public String verDetalle (){
        return "auto.fabricante = " + this.fabricante +
        "\nauto.modelo = " + this.modelo +
        "\nauto.color = " + this.color +
        "\nauto.cilintrada = " + this.cilindrada;
    }

    public String acelerar (int rpm){
        return "el auto " + this.fabricante  + " acelerando a " + rpm + "rpm";
    }

    public String frenar (){
        return this.fabricante + " " + this.modelo + " frenando!";
    }

    public String acelerarFrenar (int rpm){
        String acelerar = acelerar(rpm);
        String frenar = frenar ();
        return acelerar + "\n" + frenar;
    }
}