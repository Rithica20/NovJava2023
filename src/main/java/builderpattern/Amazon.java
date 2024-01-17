package builderpattern;

public class Amazon {

    //this

    public Amazon login() {
        System.out.println("login into amazon.in");
        // return new Amazon(); // OR
        return this;
    }

    public Amazon login(String username, String password) {
        System.out.println("login into amazon.in"+username+ " "+password);
        return this;
    }

    public Amazon search(String productName) {
        System.out.println("search product:: "+productName);
        return this;
    }

    public Amazon search(String productName, int price) {
        System.out.println("search product:: "+productName+ ""+price);
        return this;
    }

    public Amazon addToCart() {
        System.out.println("putting that product in the cart");
        return this;
    }

    public Amazon payment(int cardNumber, int cvv) {
        System.out.println("doing payment:: "+cardNumber+cvv);
        return this;
    }

    public Amazon payment(String upi) {
        System.out.println("doing payment:: "+upi);
        return this;
    }

    public Amazon generateOrder() {
        System.out.println("Generating Order");
        return this;
    }


    public void logout() {
        System.out.println("logging out from Amazon.in...");
    }
}
