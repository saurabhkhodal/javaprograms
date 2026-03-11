package Keywords;

class FinalVariable {
	final int a =200;   
}
class FinalMethod{
	final void m1() {
		System.out.println("This is a final method");
	}
}
class OverrideFinalMethod extends FinalMethod{
//	final void m1() {
//		System.out.println("We are trying to ovverride the final method");
//	}
}

public class FinalKeyword {

	public static void main(String[] args) {
		FinalVariable fv = new FinalVariable();
	//	fv.a = 300;                            //cannot change the value as the variable is final

		
	}

}
