package Practice;

public class MathProblems {

	public static void main(String[] args) {
		//find the value of cuberoot of (x^2 + y^2-|z|)
		int x =5, y=6, z=34;
		double valueX = Math.pow(x, 2) ;            //x*x;
		double valueY =  Math.pow(y, 2);             //y*y;
		int valueZ = Math.abs(z);
		double sum = valueX + valueY - valueZ;
		double cuberoot =  Math.cbrt(sum);
		System.out.println(cuberoot);
	}

}
