package ict.kosovo.growth_.oop.class_and_object_1.detyrat;

public class BankCardSimulation {
    private String emriMbiemri;
    private int accountNumber;
    private int cardNumber;
    private int holderNumber;
    private int pin;
    private String cardType;
    private String bankName;
    private int balance;

    public BankCardSimulation() {
        ////
    }

    public String getEmriMbiemri() {
        return emriMbiemri;
    }

    public void setEmriMbiemri(String emriMbiemri) {
        this.emriMbiemri = emriMbiemri;
    }



    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getHolderNumber() {
        return holderNumber;
    }

    public void setHolderNumber(int holderNumber) {
        this.holderNumber = holderNumber;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(byte pin) {
        this.pin = pin;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Vlera te lejuara jane vlerat pozitive deri me 10000");
            return;
        } else if (amount > 10_000) {
            System.out.println("Nuk mundesh me depozitu pa deshmi mbi 10000 EUR");
            return;
        }
        balance += amount;
    }
    public void withdraw(double amount){
        if(amount>10000){
            System.out.println("Nuk mund te terhiqni permes bankomatit ju lutem ejani ne zyret tona qendrore");
            return;
        }else{
            System.out.println("Ju faleminderit qe zgjodhet banken ton");
        }
    }

    public void checkBalance() {
        System.out.println("Balanci juaj eshte: " );
        return;
    }
}
