class Planet implements CelestialBody {
    private String name;
    private double coordinateX;
    private double coordinateY;
    private String atmosphereType;

    public Planet(String name, double x, double y, String atmosphereType) {
        this.name = name;
        this.coordinateX = x;
        this.coordinateY = y;
        this.atmosphereType = atmosphereType;
    }

    public String getName() { return name; }

    public double getCoordinateX() { return coordinateX; }

    public double getCoordinateY() { return coordinateY; }


    public void displayDetails() {
        System.out.printf("Planet %s (Atmosphere: %s)%n", name, atmosphereType);
    }
}