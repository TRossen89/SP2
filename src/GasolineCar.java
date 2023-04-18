public class GasolineCar extends AFuelCar{


    private String fuelType = "Gasoline";


    public GasolineCar(String registrationNumber, String model, int numberOfDoors, String make, int kmPrLitre) {
        super(registrationNumber, model, numberOfDoors, make, kmPrLitre);
    }




    @Override
    String getFuelType() {
        return fuelType;
    }


    @Override
    public int getRegistrationFee() {

        int registrationFee;

        CalculationsOnCars calculator = new CalculationsOnCars(this);

        registrationFee = calculator.calculationOfRegistrationFee();


        /*
        if (kmPrLitre >= 20 && kmPrLitre <= 50){

            registrationFee = 330;

        } else if (kmPrLitre >= 15 && kmPrLitre <20) {

            registrationFee = 1050;

        } else if (kmPrLitre >= 10 && kmPrLitre <15) {

            registrationFee = 2340;

        } else if (kmPrLitre >= 5 && kmPrLitre <10) {

            registrationFee = 5500;

        } else {

            registrationFee = 10470;

        }


         */
        /*  For en Benzinbil er afgiften afhængig af kilometer pr liter. Hvis den kører mellem 20 km/l
            og 50 km/l er prisen 330 kr, mellem 15 km/l og 20 km/l er prisen 1050 kr, mellem 10 km/l og
            15 km/l er prisen 2340 kr,
            mellem 5 km/l og 10 km/l er prisen 5500kr, og under 5 km/l er prisen 10470 kr.

         */


        return registrationFee;
    }


    @Override
    public String toString() {

        String info = "\n" +"Fuel type: Gasoline" +"\n" + "Km/l: "+ this.kmPrLitre +
                "\n" + "Registration fee: " + getRegistrationFee() + " kr." +
                "\n"+"**************************************";

        return super.toString() + info;
    }
}
