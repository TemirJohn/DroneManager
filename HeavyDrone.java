class HeavyDrone extends Drone {
    public HeavyDrone(int id, double cargoCapacity) {
        super(id, cargoCapacity);
    }

    @Override
    public double calculateFlightTime(double distance) {
        return distance / 1.5;
    }
}