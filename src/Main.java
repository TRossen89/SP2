public class Main {


    public static void main(String[] args) {

        FleetOfCars aFleetOfCars = new FleetOfCars();

        Car car1 = new ElectricCar("0001", "RR", 5, "Tesla", 50,
                800);


        Car car2 = new GasolineCar("00000001", "RR", 5, "BMW", 15);

        Car car3 = new DieselCar("00000002", "RR", 5, "Volvo", 30,
                true);



        aFleetOfCars.addCar(car1);
        aFleetOfCars.addCar(car2);
        aFleetOfCars.addCar(car3);


        System.out.println(aFleetOfCars);





    }
}
