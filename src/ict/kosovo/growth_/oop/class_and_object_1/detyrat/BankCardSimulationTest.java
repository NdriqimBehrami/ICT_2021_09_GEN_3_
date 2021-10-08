package ict.kosovo.growth_.oop.class_and_object_1.detyrat;

public class BankCardSimulationTest {
    public static void main(String[] args) {
        BankCardSimulation bcard = new BankCardSimulation();
        bcard.setEmriMbiemri("Ndriqim Behrami");
        bcard.setBankName("TEB");
        bcard.setAccountNumber(1133555411);
        bcard.setCardNumber(1212121212);
        bcard.setCardType("StarCARD");
        bcard.setHolderNumber(15975366);
        bcard.setBalance(2500);
        bcard.setPin((byte) 0000);
        bcard.deposit(122.5);
        bcard.deposit(255.6);
        bcard.withdraw(220.2);
        bcard.withdraw(15);


        System.out.printf("Llogaria ne emer te %s ne banken %s me account number %d dhe card number %d e llojit %s %n" +
                "me holder number %d me balance %d dhe me pin %02X ",bcard.getEmriMbiemri(),bcard.getBankName(),bcard.getAccountNumber(),bcard.getCardNumber()
        ,bcard.getCardType(),bcard.getHolderNumber(),bcard.getBalance(),bcard.getPin());
    }
}
