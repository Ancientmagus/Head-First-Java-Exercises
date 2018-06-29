public class TestFormats {
	public static void main (String[] args){
		String s = String.format("%,d", 1000000000);
		System.out.println(s);
		String y = String.format("I have %,.2f bugs to fix", 476578.09876);
		System.out.println(y);
		String x = String.format("%,6.1f", 42.000);
		System.out.println(x);
		
	}
}
