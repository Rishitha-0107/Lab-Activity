package com.example.uber;
class Ride {
    private int id;
    private String pickupLocation;
    private String dropLocation;
    private double fare;
    private String driver;
    private String status; // Possible values: "Available", "Booked", "Completed", "Cancelled"
    public Ride(int id, String pickupLocation, String dropLocation, double fare, String driver) {
        this.id = id;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.fare = fare;
        this.driver = driver;
        this.status = "Available"; // Default status
    }
    public int getId() { return id; }
    public String getPickupLocation() { return pickupLocation; }
    public String getDropLocation() { return dropLocation; }
    public double getFare() { return fare; }
    public String getDriver() { return driver; }
    public String getStatus() { return status; }
    public void bookRide() { 
        if (status.equals("Available")) {
            status = "Booked"; 
        }
    }
    public void completeRide() {
        if (status.equals("Booked")) {
            status = "Completed";
        }
    }
    public void cancelRide() {
        if (status.equals("Booked")) {
            status = "Cancelled";
        }
    }
    public void applySurgePricing(double surgeMultiplier) {
        if (status.equals("Available")) {
            fare *= surgeMultiplier;
        }
    }
    @Override
    public String toString() {
        return "Ride " + id + ": " + pickupLocation + " → " + dropLocation +
               " | Driver: " + driver + " | Fare: ₹" + fare + " | Status: " + status;
    }
}
