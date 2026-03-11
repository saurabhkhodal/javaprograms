package Programs;

// Parent Class
class Loan {
    int amount;
    double interestRate;

    Loan(int amount, double rate) {
        this.amount = amount;       // 'this' refers to current class variables
        this.interestRate = rate;
    }

    void showDetails() {
        System.out.println("Amount: " + amount + ", Interest Rate: " + interestRate + "%");
    }
}

// SINGLE INHERITANCE
// HomeLoan directly inherits Loan
class HomeLoan extends Loan {
    HomeLoan(int amount, double rate) {
        super(amount, rate); // super calls parent constructor
    }
}

// SINGLE INHERITANCE
// PersonalLoan also directly inherits Loan
class PersonalLoan extends Loan {
    PersonalLoan(int amount, double rate) {
        super(amount, rate);
    }
}

// MULTILEVEL INHERITANCE
// CarLoan -> PersonalLoan -> Loan
class CarLoan extends PersonalLoan {
    CarLoan(int amount, double rate) {
        super(amount, rate); // calling parent constructor
    }
}

// HIERARCHICAL INHERITANCE
// EducationLoan is another child of Loan
class EducationLoan extends Loan {
    EducationLoan(int amount, double rate) {
        super(amount, rate);  // calling parent class constructor
    }
}

public class InheritanceLoan {
    public static void main(String[] args) {

        // SINGLE INHERITANCE
        HomeLoan h = new HomeLoan(1000000, 8.5);
        System.out.print("Home Loan -> ");
        h.showDetails();

        // SINGLE INHERITANCE
        PersonalLoan p = new PersonalLoan(500000, 11.0);
        System.out.print("Personal Loan -> ");
        p.showDetails();

        // MULTILEVEL INHERITANCE
        CarLoan c = new CarLoan(300000, 13.0);
        System.out.print("Car Loan -> ");
        c.showDetails();

        // HIERARCHICAL INHERITANCE
        EducationLoan e = new EducationLoan(200000, 6.5);
        System.out.print("Education Loan -> ");
        e.showDetails();
    }
}
