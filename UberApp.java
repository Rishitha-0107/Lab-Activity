package com.example.uber;
import java.util.ArrayList;
import java.util.List;
class UberApp {
    private List<Ride> rides = new ArrayList<>();
    private int rideCounter = 1;

    public void addRide(String pickupLocation, String dropLocation, double fare, String driver) {
        rides.add(new Ride(rideCounter++, pickupLocation, dropLocation, fare, driver));
    }
    public void bookRide(int rideId) {
        for (Ride ride : rides) {
            if (ride.getId() == rideId) {
                ride.bookRide();
                System.out.println("Ride booked successfully: " + ride);
                return;
            }
        }
        System.out.println("Ride not found.");
    }
    public void completeRide(int rideId) {
        for (Ride ride : rides) {
            if (ride.getId() == rideId) {
                ride.completeRide();
                System.out.println("Ride completed: " + ride);
                return;
            }
        }
        System.out.println("Ride not found.");
    }
    public void cancelRide(int rideId) {
        for (Ride ride : rides) {
            if (ride.getId() == rideId) {
                ride.cancelRide();
                System.out.println("Ride cancelled: " + ride);
                return;
            }
        }
        System.out.println("Ride not found.");
    }
    public void applySurgePricing(double surgeMultiplier) {
        for (Ride ride : rides) {
            ride.applySurgePricing(surgeMultiplier);
        }
        System.out.println("Surge pricing applied with multiplier: " + surgeMultiplier);
    }
    public List<Ride> getRides() {
        return rides;
    }
    public void viewRides() {
        if (rides.isEmpty()) {
            System.out.println("No rides available.");
        } else {
            for (Ride ride : rides) {
                System.out.println(ride);
            }
        }
    }
}
