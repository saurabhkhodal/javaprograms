package Practice;

public class Switch {

	public static void main(String[] args) {
	/*	int a =10;
		final int X =20;
		switch(a) {
		case 10:
		System.out.println("TEN"); break;
		
		case X:
		System.out.println("TWENTY"); break;
		
		case 'A':
			System.out.println("65"); break;
			
			default :
				System.out.println("DEFAULT VALUE");
		}
          System.out.println("END");
          */
		
		
	/*	char ch ='a';
		if(ch>=65 && ch <=90) {
			switch (ch) {
			default:
				System.out.println("The character is Consonant");    //default statement always execute in last but if you want to execute it first then need to add break after the statement
				break;
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("Character is vowel");
				break;
				
			}
			}
		else{
			System.out.println("Invalid Character: Please enter the character in between 65 to 90");
		}
		*/
		
		
/*		// after jdk 13 we can execute multiple statements at a time
		
		int itemcode =003;
		switch (itemcode) {
		case 001,002,003:
			System.out.println("Its an electronic gadeget ");
		break;
		case 004,005:
			System.out.println("Its a mechanical device ");
		default:
			System.out.println(" Its a software product ");
		}
*/
	
/*		//switch case using yield   break is not needed in this case
		
		String code = "w";
		int val = switch (code) {
		case "x" , "y" :
			yield 1;
		case "z" , "w":
			yield 2;
		default :
			yield 3;
		};
		System.out.println(val);
*/
	   // switch using the -> , break is not needed in this case
		
		int itemcode = 001;
		switch(itemcode) {
		case 001 -> System.out.println("Its a laptop");
		case 002 -> System.out.println("Its a desktop");
		case 003,004 -> System.out.println("Its a mobile phone");
		default -> System.out.println("None of the above");
		}
	
	}

}
