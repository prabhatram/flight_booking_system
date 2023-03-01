package exercise3.flight.booking.system;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

public class GetterTest1 {
    @Test
    public void testGetTotalPassengers() {
        System.out.println("Testing the logic for calculating total passengers:");

        String sdepart = "2023-03-12";
        LocalDate depart = LocalDate.parse(sdepart);

        String sreturn = "2023-03-14";
        LocalDate returnDate = LocalDate.parse(sreturn);

        FlightBooking fb = new FlightBooking("null", depart, returnDate, 1, 3);
        int expResult = 4;
        fb.setTotalPassengers(1,3);
        int result = fb.getTotalPassengers();
        assertEquals(expResult, result);
}
