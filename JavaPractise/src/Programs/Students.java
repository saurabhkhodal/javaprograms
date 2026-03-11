package Programs;

public class Students {
 int sid;
 String sname;
 char sgrade;
 
 Students(){               //default constructor
	 sid =100;
	 sname = "Prakshay";
	 sgrade = 'B';
 }
 
 void printStudentData() {
	 System.out.println(sid+" "+sname+ " "+sgrade);
 }
 
/* void setStudentData (int id, String name, char grade) {
	 sid = id;
	 sname = name;
	 sgrade = grade;
 }
*/
 
 Students(int id, String name, char grade){               //parameterized constructor
	 sid = id;
	 sname= name;
	 sgrade= grade;
 }
}
