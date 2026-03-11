package Practice;

public class FibonacciSeries {

//	public static void main(String[] args) {
//		int number1=0, number2 = 1, number3, count=10;
//		System.out.print(number1+" "+number2);
//		
//		for(int i=2; i<=count; i++) {
//			number3 = number1 + number2;
//		System.out.print(" "+number3);
//			number1 = number2;
//			number2 = number3;
//		}
	
	//Fibonacci series using recursion
		
		public static  int fibSeries(int n) {
			if(n==0 || n==1 ) {
				return n;
		}
			else
				return (fibSeries(n-1)+fibSeries(n-2));
				
		}
		public static void main(String args[]) {      // 0 1 1 2 3 5 8 13 21
			int n =8;
			
			System.out.println(fibSeries(n));
			
	}

}
