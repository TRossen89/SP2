public abstract class AFuelCar extends ACar{

    private int kmPrLitre;


    public AFuelCar(String registrationNumber, String model, int numberOfDoors, String make, int kmPrLitre) {
        super(registrationNumber, model, numberOfDoors, make);

        this.kmPrLitre = kmPrLitre;
    }


    abstract String getFuelType();



    public int getKmPrLitre(){

        return this.kmPrLitre;

    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Power source: Fuel";
    }
}
