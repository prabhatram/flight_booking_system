package exercise3.flight.booking.system;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.time.LocalDate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class toStringTest 
{
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @After
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    public void testToString1() {
        //System.out.println("Testing your toString() method implementation:");
        
        String sdepart = "2023-03-12";
        LocalDate depart = LocalDate.parse(sdepart);

        String sreturn = "2023-03-14";
        LocalDate returnDate = LocalDate.parse(sreturn);

        FlightBooking fb = new FlightBooking("John Doe", depart, returnDate, 2, 3);
        String ticketNumber = fb.getTicketNumber();
        System.out.println(fb);

        String passengerFullName = fb.getPassengerFullName();
        String company = fb.getFlightCompany();
        LocalDate departure = fb.getDepartingDate();
        LocalDate returningDate = fb.getReturnDate();
        String source = fb.getTripSource();
        String destination = fb.getTripDestination();
        int totalPassengers = fb.getTotalPassengers();
        double totalTicketPrice = fb.getTotalTicketPrice();

        
        String testString = "Dear " + passengerFullName + ". Thank you for booking your flight with " + 
        company + ". Following are the details of your booking and the trip:" + "\n" + 
        "Ticket Number: " + ticketNumber + "\n" + 
        "From " + source + " to " + destination + "\n" +
        "Date of departure: " + departure + "\n" +
        "Date of return: " + returningDate + "\n" +
        "Total passengers: " + totalPassengers + "\n" +
        "Total ticket price in Euros: " + totalTicketPrice;
        String answer = testString.toLowerCase().trim().replace(" ", "");
        String output = outputStreamCaptor.toString().toLowerCase().trim().replace(" ", "");
        assertEquals(answer, output);
    }
    
}
