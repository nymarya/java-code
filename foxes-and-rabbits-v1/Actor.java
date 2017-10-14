import java.util.List;

/**
 * 
 * @author Mayra
 * @version 2017
 */
public interface Actor {

	public void act(List<Actor> newActors);
	public boolean isActive();
}
