public class ElectricCar extends ACar {


    int batteryCapacity;

    int maxRange;

    public ElectricCar(String registrationNumber, String model, int numberOfDoors, String make,
                       int batteryCapacity, int maxRange) {
        super(registrationNumber, model, numberOfDoors, make);


        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }


    public int getBatteryCapacityKWh(){


    return 0;
    }


    // returns the maximum range in kilometres.
    public int getMaxRangeKm(){

        return 0;
    }



    // returns the power consumption in watt hours per driven kilometre.
    public int getWhPrKm(){

        return 0;
    }

    @Override
    public int getRegistrationFee() {
        return 0;
    }



    @Override
    public String toString() {

        return super.toString() + "\n" + "Power source: Electricity" + "\n"+"Registration fee: " + getRegistrationFee() +
                "\n"+"**************************************";
    }
}
