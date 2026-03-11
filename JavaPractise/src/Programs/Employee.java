package Programs;

public class Employee {
	int empId;
	String empName;
    String role;
    int salary;
	
	void display() {                                //no params -> no return value
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(role);
		System.out.println(salary);
	}
	
	int tasks(){                                  //no params -> return value
		
		return (3+2);
	 }
	          
	void department (String name){                              //takes parameter -> no return value
		System.out.println("The department is " +name);
	}
	
	String workType (String type) {
		return ("The employee is doing "+type);
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.empId = 101;
		emp1.empName = "Karan";
		emp1.role = "QA";
		emp1.salary =10000;
		
		Employee emp2 = new Employee();
		emp2.empId = 102;
		emp2.empName = "Akash";
		emp2.role = "Developer";
		emp2.salary =12000;

		emp1.display();
		emp2.display();
		
		int taskCount = emp1.tasks();
		System.out.println(taskCount);
		 
		emp2.department("Tech");
	 
		System.out.println(emp1.workType("Work From Home"));
		
	}

}
