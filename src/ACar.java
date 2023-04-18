public abstract class ACar implements Car {


    protected final String registrationNumber;

    protected final String make;

    protected final String model;

    protected int numberOfDoors;


    public ACar(String registrationNumber, String model, int numberOfDoors, String make) {
        this.registrationNumber = registrationNumber;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.make = make;

    }





    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public String getMake() {
        return this.make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }


    @Override
    public String toString() {

        String theCar = "Make: "+getMake()+ "\n" + "Model: " + getModel() + "\n" + "Registration number: " +
                getRegistrationNumber()+ "\n" + "Number of doors: " + getNumberOfDoors();


        return theCar;
    }
}

