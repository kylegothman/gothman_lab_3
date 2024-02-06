public class CruiseShip extends Ship {
    private int maxPassengers;

    public CruiseShip(String name, String yearBuilt, int maxPassengers) {
        super(name, yearBuilt);
        this.maxPassengers = maxPassengers;
    }

    // Copy constructor
    public CruiseShip(CruiseShip other) {
        super(other.getName(), other.getYearBuilt());
        this.maxPassengers = other.maxPassengers;
    }

    // Accessor & mutator
    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    // toString method
    @Override
    public void display() {
        System.out.println(this.toString());
    }

    // In CargoShip.java
    @Override
    public void display() {
        System.out.println(this.toString());
    }
}

