package car;

import clark.BangClarkImpl;

public class Sedan extends Car {

    private static final String type = "Sedan";

    public Sedan(int width, int height, String carNum, int price, String owner, int time) {
        super(type, width, height, carNum, price, owner, time);
        clark = new BangClarkImpl();
    }
}
