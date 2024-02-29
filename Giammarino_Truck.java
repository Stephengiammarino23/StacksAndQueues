
import java.util.Stack;
import java.util.ArrayList;
import java.util.List;

class Truck_Giammarino {
    private int maxCapacity;
    private double maxWeight;
    private String servingArea;
    private String location;
    private Stack<Package> packages;
    private double currentWeight;

    public Truck_Giammarino(int maxCapacity, double maxWeight, String servingArea, String location) {
        this.maxCapacity = maxCapacity;
        this.maxWeight = maxWeight;
        this.servingArea = servingArea;
        this.location = location;
        this.packages = new Stack<>();
        this.currentWeight = 0;
    }

    public int getPackagesCount() {
        return packages.size();
    }

    public List<Package> getPackages() {
        return new ArrayList<>(packages);
    }

    public double getCurrentWeight() {
        return currentWeight;
    }

    public String getNextLocation() {
        return "Next location";
    }

    public void loadPackage(Package pack) {
        if (packages.size() < maxCapacity && currentWeight + pack.getWeight() <= maxWeight) {
            packages.push(pack);
            currentWeight += pack.getWeight();
            System.out.println("Package loaded successfully.");
        } else {
            System.out.println("Truck is full or does not have any room for this package.");
        }
    }

    public void unloadPackage() {
        if (!packages.isEmpty()) {
            Package pack = packages.pop();
            currentWeight -= pack.getWeight();
            System.out.println("Package unloaded successfully.");
        } else {
            System.out.println("No packages to unload.");
        }
    }

    public void deliverPackages() {
        while (!packages.isEmpty()) {
            Package pack = packages.pop();
            pack.setStatus("Delivered");
        }
        currentWeight = 0;
    }

    public String getServingArea() {
        return servingArea;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public void test() {
    }
}
