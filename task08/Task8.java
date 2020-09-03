package task08;

public class Task8 {

	public static void main(String[] args) {
		double a = 15;
		double b = 2;
		double c = 6;
		double outcome = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)) - (Math.pow(a, 3) * c) + (Math.pow(b, -2));
		System.out.println(outcome);
	}

}
