package car;

public class CarBuilder {
    private int width;
    private int height;
    private String carNum;
    private int price;
    private String owner;
    private int time;

    public CarBuilder setCarNum(String carNum) {
        this.carNum = carNum;
        return this;
    }

    public CarBuilder setWidth(int width) {
        this.width = width;
        return this;
    }

    public CarBuilder setHeight(int height) {
        this.height = height;
        return this;
    }

    public CarBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    public CarBuilder setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public CarBuilder setTime(int time) {
        this.time = time;
        return this;
    }

    public Sedan buildSedan() {
        return new Sedan(this);
    }
    public Truck buildTruck() {
        return new Truck(this);
    }
    public Jeep buildJeep() {
        return new Jeep(this);
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public String getCarNum() {
        return this.carNum;
    }

    public String getOwner() {
        return this.owner;
    }

    public int getPrice() {
        return this.price;
    }

    public int getTime() {
        return this.time;
    }
}
