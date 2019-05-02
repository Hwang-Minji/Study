package parking;

import car.*;
import clark.BangClarkImpl;
import clark.BbangClarkImpl;

import java.util.ArrayList;

public class ParkingImpl implements Parking {
    private ArrayList<Car> cars = new ArrayList<>();

    @Override
    public void addCar(Car car) {
        cars.add(car);
    }

    @Override
    public void deleteCar(String type, String carNum) {
        for(int i=0; i<cars.size(); i++) {
            if(cars.get(i).getCarNum() == carNum && cars.get(i).getType() == type)
                cars.remove(cars.get(i));
        }
    }

    private void printShowParkedCar(String type) {
        int cnt = 1;
        for(int i=0; i<cars.size(); i++) {
            if(cars.get(i).getType() == type) {
                System.out.println (type + " " + cnt + " : car no " + cars.get(i).getCarNum());
                cnt++;
            }
        }
    }

    @Override
    public void showParkedCar(int type) {
        switch(type) {
            case 0:
                printShowParkedCar("Sedan");
                printShowParkedCar("Truck");
                printShowParkedCar("Jeep");
                break;

            case 1:
                printShowParkedCar("Sedan");
                break;

            case 2:
                printShowParkedCar("Jeep");
                break;

            case 3:
                printShowParkedCar("Truck");
                break;
        }
    }

    @Override
    public void start() {
        Car minsCar = new CarBuilder().
                setCarNum("0126").
                setWidth(1).
                setHeight(1).
                setOwner("MInji").
                setPrice(1000).
                setTime(1300).
                buildSedan();

        minsCar.setClark(new BangClarkImpl());
        minsCar.getClark();

        minsCar.setClark(new BbangClarkImpl());
        minsCar.getClark();

        addCar(minsCar);
        System.out.println(minsCar.getType());
        System.out.println(cars.size());
        showParkedCar(1);

        deleteCar("Sedan", "0126");
        System.out.println(cars.size());

    }
}