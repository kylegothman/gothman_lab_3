import java.util.ArrayList;

public class ShipDemo {
        public static void main(String[] args) {
        Ship[] ships = new Ship[4];
        ships[0] = new CruiseShip("Titanic", "1912", 2224);
        ships[1] = new CargoShip("Ever Given", "2018", 224000);
        ships[2] = new CruiseShip("Symphony of the Seas", "2018", 6680);
        ships[3] = new CargoShip("MSC Gülsün", "2019", 224000);

        System.out.println("Array of Ships:");
        for (Ship ship : ships) {
            System.out.println(ship.toString());
        }

        ArrayList<Ship> shipList = new ArrayList<>();
        shipList.add(new CruiseShip("Queen Mary 2", "2003", 2695));
        shipList.add(new CargoShip("OOCL Hong Kong", "2017", 214000));

        System.out.println("\nArrayList of Ships:");
        for (Ship ship : shipList) {
            System.out.println(ship.toString());
        }

        // Test copy constructors
        CruiseShip originalCruiseShip = new CruiseShip("Original Cruise", "2000", 1500);
        CruiseShip copiedCruiseShip = new CruiseShip(originalCruiseShip);
        CargoShip originalCargoShip = new CargoShip("Original Cargo", "2005", 50000);
        CargoShip copiedCargoShip = new CargoShip(originalCargoShip);

        System.out.println("\nTesting Copy Constructors:");
        System.out.println("Original CruiseShip: " + originalCruiseShip);
        System.out.println("Copied CruiseShip: " + copiedCruiseShip);
        System.out.println("Original CargoShip: " + originalCargoShip);
        System.out.println("Copied CargoShip: " + copiedCargoShip);
    }
}
