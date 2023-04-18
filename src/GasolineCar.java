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
        return 0;
    }


    @Override
    public String toString() {


        return super.toString() + "\n" +"Fuel type: Gasoline" +"\n"+"Registration fee: " + getRegistrationFee()
        + "\n"+"**************************************";
    }
}
