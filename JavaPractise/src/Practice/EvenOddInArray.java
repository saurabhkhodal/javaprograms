package Practice;
import java.util.ArrayList;
public class EvenOddInArray {

	public static void main(String[] args) {
		int [] numbers = {21,22,23,25,24,26,27,29,28,30};
		
		ArrayList<Integer> al1 = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList <>();

		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]%2==0) {
				al1.add(numbers[i]);
				
			}
			else {
				al2.add(numbers[i]);
			}	
		}
		int total1 = 0;
		for(int arr : al1) {
			total1+=arr;
			System.out.print(arr+ " ");
		}
		System.out.println();
		System.out.println("The number of even numbers in the array are "+al1.size());
		System.out.println("The sum of all the even numbers from the array is "+total1);
		
		int total2 =0;
		for(int arr : al2) {
			total2+=arr;
			System.out.print(arr+ " ");
		}
		System.out.println();
		System.out.println("The number of odd numbers in the array are "+al2.size());
		System.out.println("The sum of all the odd numbers from the array is "+total2);
	}

}
