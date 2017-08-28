/**
 * The test class Helper.
 * Provides the beginning of a set of tests for program development.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Helper 
{
	private TaxiCo taxiCo1;

    /**
     * Default constructor for test class Helper
     */
    public Helper()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
	protected void setUp()
	{
		taxiCo1 = new TaxiCo("IMD's cars");
		taxiCo1.addTaxi();
		taxiCo1.addTaxi();
		taxiCo1.addShuttle();
	}

    /**
     * Test whether we can book a taxi.
     */
	public void testBook()
	{
		setUp();
		Taxi taxi1 = (Taxi) taxiCo1.lookup("Car #1");		
		taxi1.book("HIPER");
		if ("HIPER".equalsIgnoreCase(taxi1.getDestination()) ) {
			System.out.println("Funcionou");
		} else { 
			System.out.println("Alguma coisa errada");
		}

		Taxi taxi2 = (Taxi) taxiCo1.lookup("Car #2");		
		taxi1.book("UFRN");
		if ("UFRN".equalsIgnoreCase(taxi1.getDestination()) ) {
			System.out.println("Funcionou");
		} else { 
			System.out.println("Alguma coisa errada");
		}
	}

	/**
	 * Test the status of a taxi after it has arrived.
	 */
	public void testArrived()
	{
		Taxi taxi1 = (Taxi) taxiCo1.lookup("Car #1");
		taxi1.book("HIPER");
		taxi1.arrived();
		if ( taxi1.getDestination() == null && "HIPER".equalsIgnoreCase(taxi1.getLocation()) ) {
			System.out.println("Funcionou");
		} else { 
			System.out.println("Alguma coisa errada");
		}

		Taxi taxi2 = (Taxi) taxiCo1.lookup("Car #2");
		taxi2.book("UFRN");
		taxi2.arrived();
		if ( taxi2.getDestination() == null && "UFRN".equalsIgnoreCase(taxi2.getLocation()) ) {
			System.out.println("Funcionou");
		} else { 
			System.out.println("Alguma coisa errada");
		}
	}

	/**
	 * Test the status of a shuttle after it has arrived.
	 */
	public void testStatus()
	{
		taxiCo1.showStatus();

		Shuttle shuttle1 = (Shuttle) taxiCo1.lookup("Shuttle #3");
		while( ! "base".equalsIgnoreCase(shuttle1.getDestination())){
			System.out.println();
			shuttle1.arrived();

			taxiCo1.showStatus();
		}
		
	}

	/**
	 * A simulation of a client calling a vehicle.
	 */
	public void testCallTo()
	{
		Vehicle available = taxiCo1.goTo("Darwin");

		if( available != null ){
			System.out.println("Vehicle available");
		} else {
			System.out.println("Something went wrong.");
		}
		
		available = taxiCo1.goTo("Anywhere");

		if( available != null ){
			System.out.println("Vehicle available");
		} else {
			System.out.println("Something went wrong.");
		}
	}

	public static void main(String[] args) {
		Helper helper = new Helper();
		System.out.println("Primeiro teste");
		helper.testBook();
		
		System.out.println("Segundo teste");
		helper.testArrived();

		System.out.println("Terceiro teste");
		helper.testStatus();

		System.out.println("Ultimo teste");
		helper.testCallTo();
	}
}


