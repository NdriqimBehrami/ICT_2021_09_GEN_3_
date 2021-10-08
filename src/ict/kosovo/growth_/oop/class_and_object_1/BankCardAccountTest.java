package ict.kosovo.growth_.oop.class_and_object_1;

public class BankCardAccountTest {
    public static void main(String[] args) {
        BankCardAccount account = new BankCardAccount();
        account.setName("Ndriqim Behrami");
        account.deposit(150);
        account.deposit(500);
        account.deposit(-300);

        double balance=0;
        balance+=10;

        BankCardAccount account1 = new BankCardAccount("Ndriqimi",1310.50);
        account1.deposit(100);

        System.out.printf("%s ka ne llogari %.2f EUR %n",account.getName(), account.getBalance());
        System.out.printf("%s ka ne llogari %.2f EUR %n",account1.getName(), account1.getBalance());


    }
}
