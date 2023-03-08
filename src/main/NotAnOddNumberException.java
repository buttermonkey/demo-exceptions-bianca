public class NotAnOddNumberException extends NotACorrectNumberException {
	public void printMe() {
		System.out.println("Me");
	}
	public NotAnOddNumberException(String message) {
		super(message);
	}
}
