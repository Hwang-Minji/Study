package car;

import clark.BbangClarkImpl;

public class Jeep extends Car {

    private static final String type = "Jeep";

    public Jeep(CarBuilder carBuilder) {
        super(type, carBuilder);
        clark = new BbangClarkImpl();
    }
}
