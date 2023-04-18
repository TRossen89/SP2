public class Main {


    public static void main(String[] args) {

        FleetOfCars aFleetOfCars = new FleetOfCars();


        // Instantiating GasolineCars to aFleetOfCars
        Car car1 = new GasolineCar("GA 1000 0012", "GM", 5,
                "Skoda", 12);

        Car car2 = new GasolineCar("GA 2000 0030", "GM", 5,
                "BMW", 30);

        Car car3 = new GasolineCar("GA 3000 0004", "GM", 2,
                "Lada", 4);

        Car car4 = new GasolineCar("GA 4000 0016", "GM", 3,
                "Lada", 16);



        // Instantiating ElectricCars to aFleetOfCars

        Car car5 = new ElectricCar("EL 1018 0095", "EQ fortwo cabrio", 2,
                "Smart", 18,
                95);

        Car car6 = new ElectricCar("EL 2084 0435", "i4 M50", 5,
                "BMW", 84,
                435);

        Car car7 = new ElectricCar("EL 3070 0265", "Vivaro-e Combi M", 5,
                "Opel", 70,
                265);



        Car car8 = new ElectricCar("EL 4030 0170", "MX 30", 5,
                "Mazda", 30,
                170);

        Car car9 = new ElectricCar("EL 5050 0185", "e-Jumpy Combi", 5,
                "Citroen", 46,
                185);




        // Instantiating DieselCars to aFleetOfCars

        Car car10 = new DieselCar("DI 1000 0030", "DM", 5,
                "Volvo", 30,
                true);

        Car car11 = new DieselCar("DI 2000 0030", "DM", 5,
                "Mercedes", 30,
                false);

        Car car12 = new DieselCar("DI 3000 0016", "DM", 5,
                "Audi", 16,
                true);


        Car car13 = new DieselCar("DI 4000 0016", "DM", 5,
                "Mercedes", 16,
                false);


        Car car14 = new DieselCar("DI 5000 0008", "DM", 5,
                "Opel", 8,
                true);


        Car car15 = new DieselCar("DI 6000 0008", "DM", 5,
                "Skoda", 8,
                false);


        aFleetOfCars.addCar(car1);
        aFleetOfCars.addCar(car2);
        aFleetOfCars.addCar(car3);
        aFleetOfCars.addCar(car4);
        aFleetOfCars.addCar(car5);
        aFleetOfCars.addCar(car6);
        aFleetOfCars.addCar(car7);
        aFleetOfCars.addCar(car8);
        aFleetOfCars.addCar(car9);
        aFleetOfCars.addCar(car10);
        aFleetOfCars.addCar(car11);
        aFleetOfCars.addCar(car12);
        aFleetOfCars.addCar(car13);
        aFleetOfCars.addCar(car14);
        aFleetOfCars.addCar(car15);






        System.out.println(aFleetOfCars);

        System.out.println("Total registration fee of fleet: " + aFleetOfCars.getTotalRegistrationFeeForFleet() + " kr.");





    }
}
