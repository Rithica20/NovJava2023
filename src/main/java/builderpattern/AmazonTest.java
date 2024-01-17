package builderpattern;

public class AmazonTest {
    public static void main(String[] args) {

        Amazon az = new Amazon();

        az.login("sahil@gmail.com", "Shil@123")
                .search("macbook")
                .addToCart()
                .payment("sahil@ybl")
                .generateOrder()
                .logout();

    }
}
