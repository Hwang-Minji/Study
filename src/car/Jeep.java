package car;
import clark.BbangClarkImpl;

public class Jeep extends Car {

    private static final String type = "Jeep";

    public Jeep(int width, int height, String carNum, int price, String owner, int time) {
        super(type, width, height, carNum, price, owner, time);
        clark = new BbangClarkImpl();
    }
}
