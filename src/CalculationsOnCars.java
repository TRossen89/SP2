
public class CalculationsOnCars {


    /* Attributes necessary for the calculationOfRegistrationFee method. The instantiations of these
    attributes happens in 3 different constructors. Which constructor is being instantiated depends
    on which type of car is passed as argument when this class is instantiated
     */

    private String energySource;

    private double whPrKilometer;

    private boolean hasParticleFilter = true;

    private int kmPrLitre;





    // Making 3 different constructors (Polymorphy?) for each type of car the calculationOfRegistrationFee
    // can do calculations on. The different information enabled by the different Car arguments in the 3 constructors
    // is used in the calculationOfRegistrationFee method


    // Constructor for ElectricCars
    public CalculationsOnCars(ElectricCar car) {

        this.whPrKilometer = (double) car.getWhPrKm();

        this.energySource = "Electricity";





    }
    // Constructor for GasolineCars
    public CalculationsOnCars(GasolineCar car) {

        this.energySource = "Gasoline";
        this.kmPrLitre = car.getKmPrLitre();

    }

    // Constructor for DieselCars
    public CalculationsOnCars(DieselCar car) {

        this.energySource = "Diesel";
        this.hasParticleFilter = car.getParticleFilterStatus();
        this.kmPrLitre = car.getKmPrLitre();

    }


    // The method calculating registration fee of the cars
    public int calculationOfRegistrationFee(){



        // Variable the registration fee will depend on
        double theKmPrLitre;


        // Calculating theKmPrLitre if the Car calculating on is an ElectricCar
        if (energySource.equals("Electricity")) {


            theKmPrLitre = 100.0/(this.whPrKilometer/91.25);


        }


        //theKmPrLitre if the Car calculating on is NOT an ElectricCar
        else {

            theKmPrLitre = (double) this.kmPrLitre;
        }


        //Variable for the registration fee
        int registrationFee = 0;




        /* Long if-statement (with some nested if-statements) calculating the registration fee.
        The long if statement checks for the Car's km/l and set the registration fee accordingly
        The nested if statements checks whether the Cars are DieselCar's and adds an equalization tax
        to the registration fee accordingly

         */

        if (theKmPrLitre > 50) {

            registrationFee = 0;


        }
        else if (theKmPrLitre >= 20 && theKmPrLitre <= 50){


            registrationFee = 330;

            if (energySource.equals("Diesel")){

                registrationFee += 130;
            }




        } else if (theKmPrLitre >= 15 && theKmPrLitre <20) {

            registrationFee = 1050;

            if (energySource.equals("Diesel")){

                registrationFee += 1390;
            }



        } else if (theKmPrLitre >= 10 && theKmPrLitre <15) {



            registrationFee = 2340;

            if (energySource.equals("Diesel")){
                registrationFee+= 1850;
            }




        } else if (theKmPrLitre >= 5 && theKmPrLitre <10) {



            registrationFee = 5500;

            if (energySource.equals("Diesel")){

                registrationFee += 2770;
            }



        } else {

            registrationFee = 10470;

            if (energySource.equals("Diesel")){

                registrationFee += 15260;
            }

        }

        // If-statement checking if the DieselCar's has a particle filter and adds 1000 if they don't have this filter

        if (this.hasParticleFilter==false) {

            registrationFee += 1000;
        }

     return registrationFee;
    }


}
