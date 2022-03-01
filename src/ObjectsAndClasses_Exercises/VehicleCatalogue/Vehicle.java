package ObjectsAndClasses_Exercises.VehicleCatalogue;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private double horsePower;

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getHorsePower() {
        return horsePower;
    }

    @Override
    public String toString() {
        return String.format("Type: %s %nModel: %s %nColor: %s %nHorsepower: %.0f", this.type, this.model, this.color, this.horsePower);
    }

    public Vehicle(String type, String model, String color, double horsePower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }
}
