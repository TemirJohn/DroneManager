class SpaceStation implements CelestialBody {
    private String name;
    private double coordinateX;
    private double coordinateY;
    private int stationLevel;

    public SpaceStation(String name, double x, double y, int level) {
        this.name = name;
        this.coordinateX = x;
        this.coordinateY = y;
        this.stationLevel = level;
    }

    public String getName() { return name; }

    public double getCoordinateX() { return coordinateX; }

    public double getCoordinateY() { return coordinateY; }

    public void displayDetails() {
        System.out.printf("Space Station %s (Level: %d)%n", name, stationLevel);
    }
}
