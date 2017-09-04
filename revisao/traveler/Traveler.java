public class Traveler {
     
    private String name;

    /**
     * Construct object for Traveler class.
     */
    public Traveler( ){

    }

    /**
     * Return traveler's name.
     */
    public String getName(){
        return name;
    }

    /** 
     * Update traveler's name.
     */
    public void setName( String name ){
        this.name = name;
    }

    /**
     * Print hello message.
     */
    public void sayHello(){
        System.out.println("Hello");
    }
}