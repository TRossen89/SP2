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


    return this.batteryCapacity;
    }


    // returns the maximum range in kilometres.
    public int getMaxRangeKm(){

        return this.maxRange;
    }



    // returns the power consumption in watt hours per driven kilometre.
    public int getWhPrKm(){

        int WhPrKm = 0;

        int theBatteryCapacity = this.batteryCapacity * 1000;

        WhPrKm = theBatteryCapacity/this.maxRange;





        return WhPrKm;

    }



    @Override
    public int getRegistrationFee() {

        double theRegistrationFee;



        CalculationsOnCars calculator = new CalculationsOnCars(this);

        theRegistrationFee = calculator.calculationOfRegistrationFee();



        int registrationFee = (int) theRegistrationFee;

        return registrationFee;
    }



    @Override
    public String toString() {



        String info = "\n" + "Power source: Electricity" + "\n"+ "WhPrKm: " + getWhPrKm() +
                "\n" + "Registration fee: " + getRegistrationFee() + " kr." +
        "\n"+"**************************************";



        return super.toString() + info;
    }
}
