import static java.lang.System.out;
class StaticSuper{
	static {
		System.out.println("super static block");
	}
	
	StaticSuper(){
		out.println("super constructor");
	}
}

public class StaticTests extends StaticSuper{
	static int rand;
	
	static {
		rand = (int)(Math.random()*6);
		out.println("static block " + rand);
	}
	
	StaticTests(){
		out.println("constructor");
	}
	
	public static void main(String[] args){
		out.println("in main");
		StaticTests st = new StaticTests();
	}
}