/**
 * The homework on "Java Core" Course in LOGOS IT Academy
 * Lesson 11 - Collection Framework
 * 
 * *
 */

package ua.lviv.lgs.hw11.second;

/**
 * * Application includes 2nd task
 * 
 * @author alexl
 * 
 * @version 1.0
 *
 */

public class Engine {
	
	private int cylinderNumber;

	public Engine(int cylinderNumber) {
		super();
		this.cylinderNumber = cylinderNumber;
	}

	public int getCylinderNumber() {
		return cylinderNumber;
	}

	public void setCylinderNumber(int cylinderNumber) {
		this.cylinderNumber = cylinderNumber;
	}

	@Override
	public String toString() {
		return "Engine [cylinderNumber=" + cylinderNumber + "]";
	}
	
	
	
	
}
