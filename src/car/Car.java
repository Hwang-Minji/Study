package car;

import clark.Clark;

abstract public class Car {
    private String type;
    private int width;
    private int height;
    private String carNum;
    private int price;
    private String owner;
    private int time;

   Clark clark;

    public Car(String type, int width, int height, String carNum, int price, String owner, int time) {
        this.type = type;
        this.width = width;
        this.height = height;
        this.carNum = carNum;
        this.price = price;
        this.owner = owner;
        this.time = time;
    }

    public void getClark() {
        clark.clark();
    }
    public void setClark(Clark clark) {
        this.clark = clark;
    }

    public String getType() {
        return this.type;
    }

    public String getCarNum() {
        return this.carNum;
    }
}
