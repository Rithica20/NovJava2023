package inheritance_practice;

public class Hospital {
    /**
     * Inheritance Assignment :
     * create one Hospital class (parent) - define three method in it.
     * create three child classes (Apollo, Fortis, Max) of Hospital class
     * Override two methods from the parent class
     * Define individual method of child class
     * Create one test hospital class and use child class object, parent class object, top casting and down casting.
     */

    public void CCUunit(){

        System.out.println("Hospital----ccu");
    }
    public void ICU(){

        System.out.println("Hospital----ICU");
    }
    public void covidCare(){

        System.out.println("Hospital----covidCare");
    }
}
