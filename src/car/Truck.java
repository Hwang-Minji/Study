package car;

import clark.BungClarkImpl;

public class Truck extends Car {

    private static final String type = "Truck";

    public Truck(CarBuilder carBuilder) {
        super(type, carBuilder);
        clark = new BungClarkImpl();
    }
}
