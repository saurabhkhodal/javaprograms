package Collections;

public class Animals implements Comparable<Animals> {
	int age;
	String name;
	double weight;

	
	public Animals(int age, String name, double weight) {
		this.age = age;
		this.name = name;
		this.weight = weight;
		}
	
	@Override
	public String toString() {
		return "Animals [age=" + age + ", name=" + name + ", weight=" + weight + "]" +"\n";
	}

	@Override
//	public int compareTo(Animals that) {
//		
//		if(this.age == that.age) {
//			return this.name.compareTo(that.name);
//		}
//		return(this.age - that.age);
//	}

	public int compareTo(Animals o) {
		return 0;
	}

	}
	
	

