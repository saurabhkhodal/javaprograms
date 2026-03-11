package MethodOverriding;

public class BankMain {

	public static void main(String[] args) {
		ICICIBank ib = new ICICIBank();
		double iciciReturn = ib.roi();
		System.out.println("The return on invenstment rate of the ICICI bank is "+iciciReturn+"%");
		
		SBIBank  sr = new SBIBank();
		double sbiReturn = sr.roi();
		System.out.println("The return on invenstment rate of the SBI bankis "+sbiReturn+"%");

	}

}
