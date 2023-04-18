import java.util.ArrayList;

public class FleetOfCars {


    ArrayList<Car> fleet = new ArrayList<Car>();



    public void addCar(Car car){

        fleet.add(car);


    }


    public int getTotalRegistrationFeeForFleet(){

        int totalFee = 0;

        return totalFee;
    }


    @Override
    public String toString() {

        String theFleetOfCars = "The Fleet of cars: \n";

        for (Car c: fleet){

            theFleetOfCars += "\n"+c;


        }


        return theFleetOfCars;
    }
}
