package Programs;

public class StudentsMain {

	public static void main(String[] args) {
		Students st = new Students();

		
	/*	// Using object reference variable
		 
		st.sname = "Sahil";
		st.sid = 12;
		st.sgrade = 'A';
	*/	
		
	/*	//Using method
		st.setStudentData(25, "Sarthak", 'B');
		st.setStudentData(20, "Piyush", 'C');
		st.setStudentData(15, "Kalyani", 'A');
	*/	

		// using constructor
		Students stu = new Students (16, "Vishal", 'D');
		stu.printStudentData();
		
	}

}
