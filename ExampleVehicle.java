public class ExampleVehicle {
    public static void main(String[] args) {

        Vehicle subaru = new Vehicle();
        subaru.manufacturer = "Subaru";
        subaru.model = "Impreza";
        subaru.engineDisplacement = 2.0;
        subaru.color = "Black";

        Vehicle mazda = new Vehicle();
        mazda.manufacturer = "Mazda";
        mazda.model = "BT-50";
        mazda.engineDisplacement = 3.0;
        mazda.color = "Red";

        System.out.println(subaru.showDetails());
        System.out.println(mazda.showDetails());
        System.out.println(subaru.accelerate(3000));
        System.out.println(subaru.brake());

        System.out.println(mazda.accelerateAndBrake(4000));
    }
}
