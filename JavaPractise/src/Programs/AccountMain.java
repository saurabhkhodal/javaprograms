package Programs;

public class AccountMain {

public static void main(String[] args) {
		Account acc = new Account();
	    
		acc.setAccNo(325698745);
	    System.out.println(acc.getAccNo());
	    
	    acc.setAmount(10000);
	    System.out.println(acc.getAmount());
	    
	    acc.setName("Saurabh");
	    System.out.println(acc.getName());
	    

	}

}
