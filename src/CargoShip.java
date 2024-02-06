public class CargoShip extends Ship {
    private int cargoCapacity;

    public CargoShip(String name, String yearBuilt, int cargoCapacity) {
        super(name, yearBuilt);
        this.cargoCapacity = cargoCapacity;
    }

    // Copy constructor
    public CargoShip(CargoShip other) {
        super(other.getName(), other.getYearBuilt());
        this.cargoCapacity = other.cargoCapacity;
    }

    // Accessors and mutators
    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    // toString method
    @Override
    public String toString() {
        return "CargoShip: " + getName() + ", Cargo Capacity: " + cargoCapacity;
    }
}