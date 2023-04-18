public class DieselCar extends AFuelCar{


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




        return 0;
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


    @Override
    public String toString() {

        return super.toString() + "\n" + "Fuel type: " + getFuelType() + "\n" + "Particle filter (Y/N): " +
                hasParticleFilter() + "\n" +
                "Registration fee: " + getRegistrationFee() +
                "\n"+"**************************************";
    }


}
