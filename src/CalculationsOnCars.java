public class CalculationsOnCars {

    String energySource;

    double whPrKilometer;

    boolean hasParticleFilter = true;

    int kmPrLitre;






    public CalculationsOnCars(ElectricCar car) {

        this.whPrKilometer = (double) car.getWhPrKm();

        this.energySource = "Electricity";





    }

    public CalculationsOnCars(GasolineCar car) {

        this.energySource = "Gasoline";
        this.kmPrLitre = car.kmPrLitre;

    }


    public CalculationsOnCars(DieselCar car) {

        this.energySource = "Diesel";
        this.hasParticleFilter = car.getParticleFilterStatus();
        this.kmPrLitre = car.kmPrLitre;

    }

    public int calculationOfRegistrationFee(){


        double theKmPrLitre;


        if (energySource.equals("Electricity")) {


            theKmPrLitre = 100.0/(this.whPrKilometer/91.25);


        }


        else {

            theKmPrLitre = (double) this.kmPrLitre;
        }


        int registrationFee = 0;



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

        // Checking if the diesel car has a particle filter and adjusting registration fee accordingly

        if (this.hasParticleFilter==false) {

            registrationFee += 1000;
        }

     return registrationFee;
    }


}
