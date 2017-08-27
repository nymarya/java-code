/**
 * A vehicle.
 * Taxis have a unique ID, a location and a destination.
 * They are either free or occupied.
 * 
 * @author Mayra Azevedo
 * @version 2017.08.25
 */
 public class Vehicle
 {

     // A unique ID for this vehicle.
    private String id;
    // The destination of this vehicle.
    private String destination;
    // The location of this vehicle.
    private String location;

    /**
     * Constructos for objects of class Vehicle.
     * @param id This vehicle's unique id.
     * @param destination This vehicle's destination.
     * @param location This vehicle's location.
     */
    public Vehicle( String id, String destination, String location){
        this.id = id;
        this.destination = destination;
        this.location = location;
    }

    /**
     * Return the status of this taxi.
     * @return The status.
     */
    public String getStatus()
    {
        return id + " at " + location + " headed for " +
               destination;
    }
    
    /**
     * Return the ID of the vehicle.
     * @return The ID of the vehicle.
     */
    public String getID()
    {
        return id;
    }
    
    /**
     * Return the location of the vehicle.
     * @return The location of the vehicle.
     */
    public String getLocation()
    {
        return location;
    }
    
    /**
     * Return the destination of the vehicle.
     * @return The destination of the vehicle.
     */
    public String getDestination()
    {
        return destination;
    }

    /**
     * Set the current location of the vehicle.
     * @param destination The current location.
     */
    public void setLocation(String location)
    {
        this.location = location;
    }
    
    /**
     * Set the intented destination of the vehicle.
     * @param destination The intended destination.
     */
    public void setDestination(String destination)
    {
        this.destination = destination;
    }

    /**
     * Indicate that this vehicle has arrived at its destination.
     */
    public void arrived()
    {
        location = destination;
    }
 }