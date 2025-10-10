public class Vehicle {

    String manufacturer;
    String model;
    String color = "white";
    double engineDisplacement;

    public String showDetails() {
        return "car.manufacturer = " + this.manufacturer +
               "\ncar.model = " + this.model +
               "\ncar.color = " + this.color +
               "\ncar.engineDisplacement = " + this.engineDisplacement;
    }

    public String accelerate(int rpm) {
        return "The car " + this.manufacturer + " is accelerating at " + rpm + " rpm";
    }

    public String brake() {
        return this.manufacturer + " " + this.model + " is braking!";
    }

    public String accelerateAndBrake(int rpm) {
        String accelerate = accelerate(rpm);
        String brake = brake();
        return accelerate + "\n" + brake;
    }
}
