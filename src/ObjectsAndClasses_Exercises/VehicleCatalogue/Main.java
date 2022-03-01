package ObjectsAndClasses_Exercises.VehicleCatalogue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        List<Vehicle> vehicles = new ArrayList<>();

        int carCounter = 0;
        int truckCounter = 0;
        double totalCarsHorsePower = 0;
        double totalTruckHorsePower = 0;

        while (!"End".equals(input)) {
            String[] tokens = input.split(" ");
            String typeOfVehicle = tokens[0].substring(0, 1).toUpperCase() + tokens[0].substring(1);
            ;
            String modelOfVehicle = tokens[1];
            String color = tokens[2];
            double horsePower = Double.parseDouble(tokens[3]);

            Vehicle vehicle = new Vehicle(typeOfVehicle, modelOfVehicle, color, horsePower);
            vehicles.add(vehicle);

            input = sc.nextLine();
        }

        String command = sc.nextLine();

        while (!command.equals("Close the Catalogue")) {
            String finalCommand = command;
            vehicles.stream().filter(v -> v.getModel().equals(finalCommand)).forEach(System.out::println);
            command = sc.nextLine();
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n", averageHorsepower(vehicles.stream()
                .filter(v -> v.getType().equals("Car"))
                .collect(Collectors.toList())));

        System.out.printf("Trucks have average horsepower of: %.2f.%n", averageHorsepower(vehicles.stream()
                .filter(v -> v.getType().equals("Truck"))
                .collect(Collectors.toList())));

    }

    private static double averageHorsepower(List<Vehicle> vehicles) {
        if (vehicles.size() == 0) {
            return 0.0;
        }
        double sum = 0;

        for (Vehicle vehicle : vehicles) {
            sum += vehicle.getHorsePower();
        }
        return sum / vehicles.size();
    }
}

