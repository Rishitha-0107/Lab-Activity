package com.example.uber;
import java.util.Scanner;
public class UberRideBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UberApp uberApp = new UberApp();
        // Adding some default rides
        uberApp.addRide("Hyderabad", "Nalgonda", 500, "Ramesh");
        uberApp.addRide("Hyderabad", "Warangal", 700, "Suresh");
        uberApp.addRide("lb nagar", "Ibrahimpatnam", 200, "Nagesh");
        while (true) {
            System.out.println("\nUber Ride Booking System");
            System.out.println("1. View Available Rides");
            System.out.println("2. Book a Ride");
            System.out.println("3. Complete a Ride");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    uberApp.viewRides();
                    break;
                case 2:
                    System.out.print("Enter Ride ID to book: ");
                    int bookId = scanner.nextInt();
                    uberApp.bookRide(bookId);
                    break;
                case 3:
                    System.out.print("Enter Ride ID to complete: ");
                    int completeId = scanner.nextInt();
                    uberApp.completeRide(completeId);
                    break;
                case 4:
                    System.out.println("Exiting Uber Ride Booking System");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
