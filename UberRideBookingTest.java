package com.example.uber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class UberRideBookingTest {
    private UberApp uberApp;
    @BeforeEach
    void setUp() {
        uberApp = new UberApp();
        uberApp.addRide("Test Pickup", "Test Destination", 20.0, "Test Driver");
    }
    @Test
    void testAddRide() {
        int initialSize = uberApp.getRides().size();
        uberApp.addRide("New Pickup", "New Drop", 15.0, "New Driver");
        assertEquals(initialSize + 1, uberApp.getRides().size());
    }
    @Test
    void testBookRide() {
        uberApp.bookRide(1);
        assertEquals("Booked", uberApp.getRides().get(0).getStatus());
    }
    @Test
    void testCompleteRide() {
        uberApp.bookRide(1);
        uberApp.completeRide(1);
        assertEquals("Completed", uberApp.getRides().get(0).getStatus());
    }
    @Test
    void testBookAlreadyBookedRide() {
        uberApp.bookRide(1);
        uberApp.bookRide(1); // Try to book again
        assertEquals("Booked", uberApp.getRides().get(0).getStatus()); // Should remain "Booked"
    }
    @Test
    void testViewRidesEmpty() {
        uberApp = new UberApp(); // Fresh instance
        assertTrue(uberApp.getRides().isEmpty());
    }
}
