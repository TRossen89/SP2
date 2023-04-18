public class DieselCar extends AFuelCar{


    // I've added a fuelType attribute for the method calculationOfRegistrationFee in the CalculationsOnCars class
    private String fuelType = "Diesel";
    private boolean hasParticleFilter;


    public DieselCar(String registrationNumber, String model, int numberOfDoors, String make, int kmPrLitre,
                     boolean hasParticleFilter) {
        super(registrationNumber, model, numberOfDoors, make, kmPrLitre);

        this.hasParticleFilter = hasParticleFilter;

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


        return registrationFee;
    }

    public String hasParticleFilter(){

        String doesItHaveParticleFilter;

        if (hasParticleFilter == true) {
            doesItHaveParticleFilter = "Yes";
        }
        else{
            doesItHaveParticleFilter = "No";
        }

        return doesItHaveParticleFilter;
    }


    // Method added by me to make my CalculatingRegistrationFee class and its method work
    public boolean getParticleFilterStatus(){

        return this.hasParticleFilter;

    }


    @Override
    public String toString() {

        String info = "\n" + "Fuel type: " + getFuelType() + "\n" + "Particle filter (Y/N): " +
                hasParticleFilter() + "\n" + "Km/l: " + this.getKmPrLitre() + "\n" +
                "Registration fee: " + getRegistrationFee() + " kr." +
                "\n"+"**************************************";

        return super.toString() + info;
    }


}
