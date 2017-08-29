/**
 * The Charcter class represents a Character object. Characters can move through the 
 * board, attack each other and attack the castles.
 * 
 * @author Mayra D. Azevedo
 * @version 2017.08.29
 */
public class Character {
	
	// Type of the player (paladin, samurai)
	private String type;
	// Hit points
	private double hp;
	// Strength of the player
	private double strength;
	// It represents a character's endurance to pain
	private double defense;
	// Chance to cause extra damage to attack.
	private double critical;

	/**
	 * Construct object for class Character.
	 * @param type Type of the character.
	 * @param hp Hit Points of the player.
	 * @param strength Strength of the player.
	 * @param defense Endurance of the player.
	 * @param critical Chance to cause extra damage.
	 */
	public Character( String type, double hp, double strength, double defense, double critical) {
		this.type = type;
		this.hp = hp;
		this.strength = strength;
		this.defense = defense;
		this.critical = critical;
	}

	/**
	 * Return type of the character.
	 * @return Type of the player.
	 */
	public String getType() {
		return type;
	}

	/**
	 * Update type of the character.
	 * @param type New type.
	 */
	public void setType( String type) {
		this.type = type;
	}

	/**
	 * Return hit points of the character.
	 * @return Hit points of the player.
	 */
	public double getHP() {
		return hp;
	}

	/**
	 * Update type of the character.
	 * @param type New type.
	 */
	public void setHP( double hp) {
		this.hp = hp;
	}

	/**
	 * Return strength of the character.
	 * @return Strength of the player.
	 */
	public double getStrength() {
		return strength;
	}

	/**
	 * Update strength of the character.
	 * @param strength New strength level.
	 */
	public void setStrength( double strength) {
		this.strength = strength;
	}

	/**
	 * Return defense of the character.
	 * @return Defense of the player.
	 */
	public double getDefense() {
		return defense;
	}

	/**
	 * Update type of the character.
	 * @param type New type.
	 */
	public void setDefense( double defense) {
		this.defense = defense;
	}

	/**
	 * Return chance to get a critical attack of the character.
	 * @return Chance to get a critical attack.
	 */
	public double getCritical() {
		return critical;
	}

	/**
	 * Update chance to get a critical attack.
	 * @param critical Chance to get a critical attack.
	 */
	public void setCritical( double critical) {
		this.critical = critical;
	}
}