package Methods;

public class RecursiveMethodsDemo {

	public static void main(String[] args) {
		
		System.out.println("3! = " +calculateFactorial(3)); // 1*2*3=6
		System.out.println("4! = " +calculateFactorial(4)); // 1*2*3*4 =24
		
		System.out.println("iterativeFactorial(4): " +iterativeFactorial(4));
	}
	/*private static void callTheSameMethode() {
		callTheSameMethode();
		
	}*/
	private static int calculateFactorial(int i) {
		if ( i != 0) {
			return i * calculateFactorial(i-1);
		} else { 
			return 1;
		}
	}
	private static int iterativeFactorial (int n) {
		int factorial = 1;
		if (n<0) {
			return -1;
		}
		for (int i=1 ; i<=n ; i++) {
			factorial *= i;
		}
		return factorial;
	}
}
