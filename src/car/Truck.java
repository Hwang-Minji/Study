package car;

import clark.BungClarkImpl;

public class Truck extends Car {

    private static final String type = "Truck";

    public Truck(int width, int height, String carNum, int price, String owner, int time) {
        super(type, width, height, carNum, price, owner, time);
        clark = new BungClarkImpl();
    }
}
