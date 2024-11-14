// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int times = Integer.parseInt(args[0]);
		String mode = args[1].toLowerCase();
		if (mode.equals("c")) {
			System.out.println("Every one of the first " +times+ " hailstone sequences reached 1.");
			return;
		}

		for (int j = 0; j < times; j++) {
			int number = j + 1;
			int i = 0;
			do {
				i++;
				if (mode.equals("v")) {
					System.out.print	(number + " ");
				}
				else {
					
				}
				if (number % 2 ==0){
					number = number/2; 
				}
				else{
					number = number *3 + 1; 
				}
			} while(number!=1);
			System.out.println(number + " (" + i + ")");
		}
	}
}
