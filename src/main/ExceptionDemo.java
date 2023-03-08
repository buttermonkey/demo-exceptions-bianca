import java.io.IOException;

public class ExceptionDemo {
	public static void main(String[] args) {
		breakSomething();
	}

	private static void breakSomething() {
		try {
			String nothing = null;
//			nothing.equals("");
			throw new IOException();
		} catch(IOException ioe) {
			// I have no idea how to handle this
			// Therefore I'm just throwing it out of the window again
			// Because I can't (and don't want to) throw a checked exception,
			// I need to wrap it into an unchecked exception
			throw new RuntimeException("Something went terribly wrong!", ioe);
		}
	}
}
