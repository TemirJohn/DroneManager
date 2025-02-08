interface CelestialBody {
    String getName();
    double getCoordinateX();
    double getCoordinateY();

    default double distanceTo(CelestialBody other) {
        return Math.sqrt(
                Math.pow(getCoordinateX() - other.getCoordinateX(), 2) +
                        Math.pow(getCoordinateY() - other.getCoordinateY(), 2)
        );
    }

    void displayDetails();


}