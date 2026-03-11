package TypeCasting;

public class TypeCastingDataTypes {
	
	static long upcasting () {
		int val1 = 100;
		long val2 = (long)val1;  // no need to write (long) as it is done automatically
		return val2;
	}
	
	static byte downcasting() {
		int val3 = 150;
		byte val4 = (byte)val3;   // we have to write (byte) to downcast to lower type. 
		return val4;
	}

	public static void main(String[] args) {
		long upcastValue = upcasting();
		System.out.println(upcastValue);

		byte downValue = downcasting();
		System.out.println(downValue);
	}

}
