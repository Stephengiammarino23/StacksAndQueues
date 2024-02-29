import java.util.ArrayList;
import java.util.List;

class Giammarino_TruckFleet {
    private List<Giammarino_Truck> trucks;

    public TruckFleet() {
        trucks = new ArrayList<>();
    }

    public void addTruck(Truck truck) {
        trucks.add(truck);
    }

    public void addPackage(Package pack) {
        boolean loaded = false;
        for (Truck truck : trucks) {
            if (truck.getServingArea().equals(pack.getDestinationArea()) && truck.getLocation().equals("Warehouse")) {
                truck.loadPackage(pack);
                loaded = true;
                break;
            }
        }
        if (!loaded) {
            System.out.println("No truck available for immediate loading. Package stored.");
        }
    }

    public void searchPackage(String destinationArea, String destinationAddress) {
        for (Truck truck : trucks) {
            for (Package pack : truck.getPackages()) {
                if (pack.getDestinationArea().equals(destinationArea) && pack.getDestinationAddress().equals(destinationAddress)) {
                    System.out.println("Package found in truck serving area: " + truck.getServingArea());
                    return;
                }
            }
        }
        System.out.println("Package not found.");
    }

    public void searchTruck(String servingArea) {
        for (Truck truck : trucks) {
            if (truck.getServingArea().equals(servingArea)) {
                System.out.println("Truck found serving the specified area: " + truck.getLocation());
                return;
            }
        }
        System.out.println("No truck found serving the specified area.");
    }

    public void declarePackageDelivered(Package pack) {
        pack.setStatus("Delivered");
    }

    public void declareTruckReturned(Truck truck) {
        truck.setLocation("Warehouse");
    }
    public void test() {
        // This method does nothing and returns null
        return;
    }
}

