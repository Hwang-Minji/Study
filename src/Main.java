import parking.Parking;
import parking.ParkingImpl;

public class Main {
    public static void main(String[] args) {
        Parking parking = new ParkingImpl();

        parking.start();
    }
}
