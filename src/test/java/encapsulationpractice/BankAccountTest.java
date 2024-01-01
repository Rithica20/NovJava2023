package encapsulationpractice;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.setOwner("Rithica");
        ba.setAccountNumber("098765434");
        ba.setBalance(2000.40);
        ba.deposit(1000);
        ba.withDraw(200);
        ba.printStatement();
    }
}
