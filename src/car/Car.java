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

    public Car(String type, CarBuilder carBuilder) {
        this.type = type;
        this.width = carBuilder.getWidth();
        this.height = carBuilder.getHeight();
        this.carNum = carBuilder.getCarNum();
        this.price = carBuilder.getPrice();
        this.owner = carBuilder.getOwner();
        this.time = carBuilder.getTime();
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

    public String getOwner() {
        return this.owner;
    }
}
