package exceptionhandling;

public class throwkeyword {

    public static void main(String[] args) {

        String browser = null;

        if (browser == null) {
            try {
                throw new Exception("BROWSER CANNOT BE NULL....");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
