import java.util.ArrayList;

public class FleetOfCars {


    ArrayList<Car> fleet = new ArrayList<>();



    public void addCar(Car car){

        fleet.add(car);


    }


    public int getTotalRegistrationFeeForFleet(){


        int totalFee = 0;

        for (Car c: fleet){

            totalFee += c.getRegistrationFee();

        }



        return totalFee;
    }


    @Override
    public String toString() {

        String theFleetOfCars = "\n**************************************\nThe fleet of cars";

        int numberOfCarsInFleet = 0;

        for (Car c: fleet) {

            numberOfCarsInFleet += 1;

        }

        theFleetOfCars += "("+ numberOfCarsInFleet + " cars):\n";


        for (Car c: fleet){


            theFleetOfCars += "\n"+c;


        }


        return theFleetOfCars;
    }
}
