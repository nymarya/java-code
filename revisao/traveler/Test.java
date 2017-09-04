public class Test {
	
	public static void main( String [] args ) {
	    Traveler t1 = new Brazilian();
	    Traveler t2 = new Spanish();
	    t1.sayHello();
	    t2.sayHello();

	    t2 = new French();

	    t2.sayHello();
	}
}