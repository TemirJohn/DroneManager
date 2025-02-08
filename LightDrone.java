class LightDrone extends Drone {
    public LightDrone(int id, double cargoCapacity) {
        super(id, cargoCapacity);
    }

    @Override
    public double calculateFlightTime(double distance) {
        return distance / 2.0;
    }


}