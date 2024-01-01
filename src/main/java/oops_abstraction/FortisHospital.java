package oops_abstraction;

public class FortisHospital extends Medical implements USMedical, UKMedical, IndianMedical {
    //a class can have multiple parent interfaces


    static int min_fee = 200;

    //US
    @Override
    public void physioServices() {
        System.out.println("FH----physioservices");
    }



    @Override
    public void cardioServices() {
        System.out.println("FH----cardioservices");

    }

    @Override
    public void ENTservices() {
        System.out.println("FH----ENTservices");
    }

    //UK
    @Override
    public void neuroservices() {
        System.out.println("FH----Neuroservices");
    }

    @Override
    public void orthoservices() {
        System.out.println("FH----orthoservices");

    }

    //India
    @Override
    public void dentalServices() {
        System.out.println("FH----DentalServices");

    }

    @Override
    public void gynoServices() {
        System.out.println("FH----gynoservices");

    }


    //individual method
    public void medicalTraining() {
        System.out.println("FH---medical training");
    }

    //common method
    @Override
    public void emergencyServices() {
        System.out.println("FH --- emergerncy service");
    }



    @Override
    public void covidVaccination() {
        System.out.println("FH -- covidVaccination");
    }

    @Override
    public void medicalRD() {
        System.out.println("FH --- medicalRD");
    }
}
