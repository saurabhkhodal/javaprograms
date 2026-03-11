package Practice;

public class StringSorting {

	
	//Using Bubble Sort Method
	
/*	public static void main(String[] args) {
	  String [] names = {"Saurabh","Harshal","Haribhau","Komal"};
	  String temp;
	  for(int i=0;i<names.length;i++) {
		  for(int j=0;j<names.length-1-i;j++) {
			  if(names[j].compareTo(names[j+1])>0){
				  temp = names[j];
				  names[j] = names[j+1];
				  names[j+1]= temp;
			  }
		  }
		 
	  }
	  for(int i=0;i<names.length;i++) {
		  System.out.print(names[i]+" ");
	  }
	  
	}
*/	
	
	// Using Selection Sort Method
  
	public static void main(String[]args) {
	String [] names = {"Saurabh","Harshal","Haribhau","Komal"};
	String temp;
	int min;
	for(int i=0;i<names.length;i++) {
		min =i;
		for(int j=i+1; j<names.length; j++) {
		
			
			if(names[j].compareTo(names[min])<0) {
			  min = j;
			}
		}
		temp = names[i];
		names[i]=names[min];
		names[min]=temp;
		
	}
	for(int i=0;i<names.length;i++) {
	    System.out.print(names[i]+" ");
	}
		
	}
}
