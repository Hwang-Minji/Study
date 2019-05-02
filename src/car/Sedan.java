package car;

import clark.BangClarkImpl;

public class Sedan extends Car {

    private static final String type = "Sedan";

    public Sedan(CarBuilder carBuilder) {
        super(type, carBuilder);
        clark = new BangClarkImpl();
    }
}
