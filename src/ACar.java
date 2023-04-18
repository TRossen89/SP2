public abstract class ACar implements Car {


    // I have added an ID to the Cars for the outprint of the list of cars. ID = Car number in the outprint
    private static int idCounter = 0;
    private int carId;



    protected final String registrationNumber;

    protected final String make;

    protected final String model;

    protected int numberOfDoors;


    public ACar(String registrationNumber, String model, int numberOfDoors, String make) {
        this.registrationNumber = registrationNumber;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.make = make;


        idCounter ++;

        this.carId = idCounter;

    }


    public int getCarId() {
        return carId;
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

        String theCar = "**************************************\n" + "Car number: " + getCarId() +"\n----------------\n" +
                "" +
                "Make: "+getMake()+ "\n" + "Model: " + getModel() + "\n" + "Registration number: " +
                getRegistrationNumber()+ "\n" + "Number of doors: " + getNumberOfDoors();


        return theCar;
    }
}

