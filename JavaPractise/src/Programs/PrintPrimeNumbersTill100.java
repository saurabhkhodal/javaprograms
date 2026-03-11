package Programs;

public class PrintPrimeNumbersTill100 {
	
	public void printPrimeNumbers() {
	    for (int i = 2; i <= 100; i++) {
	        
	        boolean isPrime = true;

	        for (int j = 2; j <= Math.sqrt(i); j++) {
	            if (i % j == 0) {
	                isPrime = false; 
	                break;
	            }
	        }

	        if (isPrime) {
	            System.out.print(i+" ");
	        }
	    }
	}


	public static void main(String[] args) {
		PrintPrimeNumbersTill100 pm = new PrintPrimeNumbersTill100();
        pm.printPrimeNumbers();
        

	}

}
