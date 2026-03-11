package Programs;

public class Account {

	private long accno;
	private String name;
	private double amount;
	
	void setAccNo (long acno) {
		accno = acno;
	}
	
	void setName (String aname) {
		name = aname;
	}
	
	void setAmount (double am) {
		amount = am;
	}
	
	long getAccNo() {
		return accno;
	}
	
	String getName() {
		return name;
	}
	
	double getAmount() {
		return amount;
	}
	
	
}
