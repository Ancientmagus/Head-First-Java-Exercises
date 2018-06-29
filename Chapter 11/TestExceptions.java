import static java.lang.System.out;

public class TestExceptions {
	public static void main (String[] args) {
		String test = "yes";
		try {
			out.println("Start try");
			doRisky(test);
			out.println("end try");
		} catch (ScaryException se) {
			out.println("scary exception");
		} finally {
			out.println("finally");
		}
		out.println("end main");
	}
	
	static void doRisky(String test) throws ScaryException {
		out.println("Start Risky");
		if ("yes".equals(test)) {
			throw new ScaryException();
		}
		out.println("end risky");
		return;
	}
}