class Giammarino_Packages {
    private double weight;
    private String destinationArea;
    private String destinationAddress;
    private String status;

    public void Package(double weihgt, String destinationArea, String destinationAddress) {
        this.weight = weight;
        this.destinationArea = destinationArea;
        this.destinationAddress = destinationAddress;
        this.status = "In transit";
    }

    public double getWeight() {
        return weight;
    }

    public String getDestinationArea() {
        return destinationArea;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public String status() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

