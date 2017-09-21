import java.lang.Math;

/**
 * The Circle class represents a Circle object. A circle
 * have radius.
 * 
 * @author Mayra D. de Azevedo
 * @version 19.09.2017
 */
public class Circle {
	
	private float radius;

	/**
	 * Contruct object for class Rectangle.
	 */

	/**
	 * Calculate circle's area.
	 * @return The area of the circle.
	 */
	public float calculateArea(){
		return (float) Math.PI * radius * radius;
	}

	/**
	 * Calculate circle's perimeter.
	 * @return The perimeter of the circle.
	 */
	public float calculatePerimeter(){
		return 2 * (float) Math.PI * radius;
	}
}
