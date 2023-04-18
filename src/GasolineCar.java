public class GasolineCar extends AFuelCar{


    // I've added a fuelType for the method calculationOfRegistrationFee in the CalculationsOnCars class
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

        //Using a method from a class I've created for calculating the registration fee of every type of car
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



        return registrationFee;
    }


    @Override
    public String toString() {

        String info = "\n" +"Fuel type: Gasoline" +"\n" + "Km/l: "+ this.getKmPrLitre() +
                "\n" + "Registration fee: " + getRegistrationFee() + " kr." +
                "\n"+"**************************************";

        return super.toString() + info;
    }
}
