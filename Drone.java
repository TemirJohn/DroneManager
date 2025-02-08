abstract class Drone {
    private int id;
    private String status;
    private double cargoCapacity;
    private double currentCargoWeight;

    public Drone(int id, double cargoCapacity) {
        this.id = id;
        this.status = "IDLE";
        this.cargoCapacity = cargoCapacity;
        this.currentCargoWeight = 0;
    }

    public boolean loadCargo(double weight) {
        if (currentCargoWeight + weight <= cargoCapacity) {
            currentCargoWeight += weight;
            return true;
        }
        return false;
    }

    public void unlockCargo() {
        currentCargoWeight = 0;
    }

    public abstract double calculateFlightTime(double distance);

    public int getId() { return id; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public double getCargoCapacity() { return cargoCapacity; }
    public double getCurrentCargoWeight() { return currentCargoWeight; }

    @Override
    public String toString() {
        return "Drone{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", cargoCapacity=" + cargoCapacity +
                ", currentCargoWeight=" + currentCargoWeight +
                '}';
    }
}