package Programs.OOP;

abstract class Bank {
    String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    abstract double getInterestRate();

    void displayBankName() {
        System.out.println("Bank Name: " + bankName);
    }
}

class SBI extends Bank {

    SBI() {
        super("SBI");
    }

    @Override
    double getInterestRate() {
        return 8.5;
    }
}

public class AbstractClassExample {

    public static void main(String[] args) {

        Bank bank = new SBI();
        bank.displayBankName();
        System.out.println("Interest Rate: " + bank.getInterestRate() + "%");
    }
}
