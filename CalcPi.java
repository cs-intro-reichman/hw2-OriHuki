// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	
	int numberOfInt = Integer.parseInt(args[0]);	
		
	double totalpai= 0.0; 
	for (int i = 0; i < numberOfInt; i++) {
		double newMechane = 2 * i + 1;
		double newNumber = 1.0 / newMechane;
		if (i % 2 == 0) {
			totalpai += newNumber; 
		} else {
			totalpai -= newNumber;  
		}}

		totalpai = totalpai*4;

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + totalpai);
 
	}
	}

