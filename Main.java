
public class Main {
    public static void main(String[] args) {
        LightDrone light = new LightDrone(1, 50.0);
        HeavyDrone heavy = new HeavyDrone(2, 200.0);

        Planet earth = new Planet("Earth", 0.0, 0.0, "Nitrogen-Oxygen");
        SpaceStation alpha = new SpaceStation("Alpha", 10.0, 10.0, 5);

        Cargo cargo = new Cargo(30.0, "Medical Supplies");

        DeliveryTask task = new DeliveryTask(earth, alpha, cargo);

        if (task.assignDrone(heavy)) {
            System.out.println("Drone assigned successfully!");
            double distance = earth.distanceTo(alpha);
            double time = heavy.calculateFlightTime(distance);
            System.out.printf("Estimated flight time: %.2f units%n", time);
            task.completeDelivery();
        } else {
            System.out.println("Failed to assign drone.");
        }

        earth.displayDetails();

        System.out.printf(light.toString());
    }
}