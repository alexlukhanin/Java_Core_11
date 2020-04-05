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

public class InputMenuString {
	/*This class checks menu input from user and assigns value of string, when it's correct*/
	
	
	boolean flag;
	private String string;
	Menu2 menu2 = new Menu2();

	public InputMenuString(String string) {
		super();
		
		
		if ((string.hashCode() >= 49 && string.hashCode() <= 50) || string.equals("q") || string.equals("menu") ) {
			this.string = string;
			flag = true;
			
			
		} else {
			
			try {
				throw new WrongInputException("Wrong choise, try again, please...");
			} catch (WrongInputException e) {
				System.out.println(e.getMessage());
				menu2.printMenu();
				flag = false;
			}
			
		}
		
		
	}

	public String getString() {
		return string;
	}

	
	
	
	
	
}
