import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Airport airport1 = new Airport("Airport 1");

        Aircraft aircraft1 = new Aircraft("Aircraft 1", 100);
        Aircraft aircraft2 = new Aircraft("Aircraft 2", 150);

        Passenger passenger1 = new Passenger("Cristiano Ronaldo", 1);
        Passenger passenger2 = new Passenger("Haaland", 2);
        Passenger passenger3 = new Passenger("Mbappe", 3);

        airport1.addAircraft(aircraft1);
        airport1.addAircraft(aircraft2);

        aircraft1.addPassenger(passenger1);
        aircraft2.addPassenger(passenger2);
        aircraft2.addPassenger(passenger3);

        // Displaying passengers assigned to Aircraft 2
        System.out.println("Passengers assigned to Aircraft 1:");
        for (Passenger passenger : aircraft1.getPassengers()) {
            System.out.println("Name: " + passenger.getName() + ", Seat No.: " + passenger.getSeatNo());
        }

        // Searching for a passenger by airline name and seat number
        Passenger foundPassenger = airport1.searchPassenger("Aircraft 2", 3);

        if (foundPassenger != null) {
            System.out.println("\nFound Passenger:");
            System.out.println("Name: " + foundPassenger.getName() + ", Seat No.: " + foundPassenger.getSeatNo());
        } else {
            System.out.println("\nPassenger not found.");
        }
    }
}