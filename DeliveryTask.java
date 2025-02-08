class DeliveryTask {
    private CelestialBody origin;
    private CelestialBody destination;
    private Cargo cargo;
    private Drone assignedDrone;

    public DeliveryTask(CelestialBody origin, CelestialBody destination, Cargo cargo) {
        this.origin = origin;
        this.destination = destination;
        this.cargo = cargo;
    }

    public boolean assignDrone(Drone drone) {
        if (drone.getStatus().equals("IDLE") && drone.loadCargo(cargo.getWeight())) {
            assignedDrone = drone;
            drone.setStatus("IN_FLIGHT");
            return true;
        }
        return false;
    }

    public void completeDelivery() {
        if (assignedDrone != null) {
            assignedDrone.unlockCargo();
            assignedDrone.setStatus("IDLE");
            System.out.println("Delivery completed!");
        }
    }
}