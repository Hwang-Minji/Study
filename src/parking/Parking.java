package parking;

import car.Car;

public interface Parking {
    void addCar(Car car);
    void deleteCar(String type, String carNum);
    void showParkedCar(int type);
    void start();
}
