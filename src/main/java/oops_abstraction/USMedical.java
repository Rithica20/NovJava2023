package oops_abstraction;

public interface USMedical extends WHO{
    public final int min_fee = 10;

    //static in nature
    //final in nature

    //abstraction - hiding the details

    public void physioServices();  //abstract methods - donot have a body

    public void cardioServices();

    public void ENTservices();

    public void emergencyServices();

    //contructor is not possible in interface

}
