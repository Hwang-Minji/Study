package parking;

import car.Car;
import car.Jeep;
import car.Sedan;
import car.Truck;
import clark.BangClarkImpl;
import clark.BbangClarkImpl;

import java.util.ArrayList;

public class ParkingImpl implements Parking {
    private ArrayList<Car> sedans = new ArrayList<>();
    private ArrayList<Car> trucks = new ArrayList<>();
    private ArrayList<Car> jeeps = new ArrayList<>();

    @Override
    public void addCar(Car car) {
        switch(car.getType()) {
            case "Sedan" :
                sedans.add(car);
                break;

            case "Truck" :
                trucks.add(car);
                break;

            case "Jeep" :
                jeeps.add(car);
                break;

            default :
                System.out.println("Invalid car.");
                break;
        }
    }

    @Override
    public void deleteCar(String type, String carNum) {
        switch(type) {
            case "Sedan":
                for(int i=0; i<sedans.size(); i++) {
                    if(sedans.get(i).getCarNum() == carNum)
                        sedans.remove(sedans.get(i));
                }
                break;

            case "Truck":
                for(int i=0; i<trucks.size(); i++) {
                    if(trucks.get(i).getCarNum() == carNum)
                        trucks.remove(trucks.get(i));
                }
                break;

            case "Jeep":
                for(int i=0; i<jeeps.size(); i++) {
                    if(jeeps.get(i).getCarNum() == carNum)
                        jeeps.remove(jeeps.get(i));
                }
                break;

        }
    }

    private void printShowParkedCar(String type) {
        switch(type) {
            case "Sedan":
                for(int i=0; i<sedans.size(); i++) {
                    System.out.println (type + " " + (i+1) + " : car no " + sedans.get(i).getCarNum());
                }
                break;

            case "Truck":
                for(int i=0; i<sedans.size(); i++) {
                    System.out.println (type + " " + (i+1) + " : car no " + trucks.get(i).getCarNum());
                }
                break;

            case "Jeep":
                for(int i=0; i<sedans.size(); i++) {
                    System.out.println (type + " " + (i+1) + " : car no " + jeeps.get(i).getCarNum());
                }
                break;
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
        Car minsCar = new Sedan(1, 2, "0126", 1000, "Minji", 13 );

        minsCar.setClark(new BangClarkImpl());
        minsCar.getClark();

        minsCar.setClark(new BbangClarkImpl());
        minsCar.getClark();

        addCar(minsCar);
        System.out.println(minsCar.getType());
        System.out.println(sedans.size());
        showParkedCar(1);

        deleteCar("Sedan", "0126");
        System.out.println(sedans.size());

    }
}