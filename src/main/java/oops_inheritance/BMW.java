package oops_inheritance;

public class BMW extends Car{
    //method overriding (Runtime Polymorphism/dynamic)
    // when we have a method in parent class and the same method in child class
    //// with:
    // the same name
    //// the same number of parameters
    // the same sequence/order of the parameters
    //// the same return type

    @Override
    public void start() {
        System.out.println("BMW----start");
    }

    public void autoParing() {
        System.out.println("BMW----autoparking");
    }

    //static method cannot be overridden - NO
    //can static be inherited ? - YES it is inherited

//	public static void billing() {
//		System.out.println("bmw-billing");
//	}


    //can private methods be overriden ? -- NO
    //can private method be inherited ? --  NO

    private void testing() {
        System.out.println("BMW---testing");
    }


    //final methods

    //can final method be overriden -- NO
    //can final method be inhertited -- YES

//	@Override
//	public final void power() {
//		System.out.println("bmw --- power");
//	}
}
