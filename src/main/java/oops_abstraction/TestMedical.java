package oops_abstraction;

public class TestMedical {
    public static void main(String[] args) {


//		USMedical usmedical = new USMedical();
//		- We do not create the object of interface because there is no buisness logic written over there and implementation is done at the class level. Hence we create the object of class instead of interface.
//		and Java restricts the creation of object.



        System.out.println(FortisHospital.min_fee);


        FortisHospital fh = new FortisHospital();

        fh.physioServices();
        fh.cardioServices();
        fh.ENTservices();
        fh.neuroservices();
        fh.orthoservices();
        fh.dentalServices();
        fh.gynoServices();

        fh.medicalTraining();

        fh.emergencyServices();

        fh.medicalRD();

        USMedical us = new FortisHospital(); //TopCasting or UpCasting

        us.physioServices();
        us.cardioServices();
        us.ENTservices();
        us.emergencyServices();


        UKMedical uk = new FortisHospital();

        uk.neuroservices();
        uk.orthoservices();
        uk.emergencyServices();


        //downcasting -- NA

        //FortisHospital fh3 = (FortisHospital) new USMedical(); //compile time error




    }
}
