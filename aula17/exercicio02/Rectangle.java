/**
 * The Rectangle class represents a Rectangle object. A rectangle
 * have heigth and width atributtes.
 * 
 * @author Mayra D. de Azevedo
 * @version 19.09.2017
 */
public class Rectangle {
	
	private float heigth;
	private float width;

	/**
	 * Contruct object for class Rectangle.
	 */

	/**
	 * Calculate rectangle's area.
	 * @return The area of the rectangle.
	 */
	public float calculateArea(){
		return heigth * width;
	}

	/**
	 * Calculate rectangle's perimeter.
	 * @return The perimeter of the rectangle.
	 */
	public float calculatePerimeter(){
		return 2 * heigth + 2 * width;
	}
}
