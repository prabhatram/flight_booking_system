package exercise3.flight.booking.system;

import java.time.LocalDate;

import org.junit.Test;

public class ConstructorTest {
    
    @Test
    public void testConstructor() {
        System.out.println("Testing your Constructor and that it has the necessary parameters:");
        
        String sdepart = "2023-03-12";
        LocalDate depart = LocalDate.parse(sdepart);

        String sreturn = "2023-03-14";
        LocalDate returnDate = LocalDate.parse(sreturn);

        FlightBooking fb = new FlightBooking("null", depart, returnDate, 2, 3);
        assertEquals("null", fb.getPassengerFullName());
        assertEquals(depart, fb.getDepartingDate());
        assertEquals(returnDate, fb.getReturnDate());
        assertEquals(2, fb.getChildrenPassengers());
        assertEquals(3, fb.getAdultPassengers());
    }
    
}
