import java.util.Random;

public class RealDealDemo {
	public static void main(String[] args) {
		Random rnd = new Random();
		for(int i = 0; i < 10; i++) {
			try {
				printEvenNumber(rnd.nextInt(10));
				printOddNumber(rnd.nextInt(10));
			} catch(NotACorrectNumberException e) {
				System.out.println("Something went wrong, but I don't care enough to do anything about it.");
			}
		}
	}

	/**
	 * Prints number if it is odd, otherwise it throws NotAnOddNumberException.
	 * @param number number to print.
	 * @throws NotAnOddNumberException if number is even.
	 */
	private static void printOddNumber(int number) throws NotAnOddNumberException {
		if (isEven(number))
			throw new NotAnOddNumberException("This is not an odd number: " + number);

		System.out.println("odd number = " + number);
	}

	private static boolean isEven(int number) {
		return number % 2 == 0;
	}

	private static void printEvenNumber(int number) throws NotAnEvenNumberException {
		if (isOdd(number))
			throw new NotAnEvenNumberException("This is not an even number: " + number);

		System.out.println("even number = " + number);
	}

	private static boolean isOdd(int number) {
		return number % 2 != 0;
	}
}
