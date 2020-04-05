/**
 * The homework on "Java Core" Course in LOGOS IT Academy
 * Lesson 11 - Collection Framework
 * 
 * *
 */

package ua.lviv.lgs.hw11.second;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * * Application includes 2nd task
 * 
 * @author alexl
 * 
 * @version 1.0
 *
 */

public class Application {

	public static void main(String[] args) {
		/* Array of helm materials */
		String[] list = { "wood", "iron", "alcantara", "leather", "rubber" };
		
		/*random and array declaration
		 * The number of rows and columns defines on start by random but is constant till the end of the Application*/
		Random random = new Random();
		int x = random.nextInt(10); // rows
		int y = random.nextInt(10); // columns
		Auto[][] autos = new Auto[x][y]; // 10 - is the limit of numbers

		/* Console block declaration */
		MainMenu mainMenu = new MainMenu();
		Menu2 menu2 = new Menu2();
		Scanner sc = new Scanner(System.in);
		String menuSting;
		InputMenuString inputMenuString;

		/* printing of both menus */
		mainMenu.printMenu();
		menu2.printMenu();

		/* Starting of the console menu block */
		while (true) {
			inputMenuString = new InputMenuString(sc.next());
			menuSting = inputMenuString.getString();

			if (inputMenuString.flag) {

				switch (menuSting) {
				case "1": {

					/*
					 * fill each element of the array with random auto(constructor with all random
					 * elements)
					 */
					for (int i = 0; i < x; i++) {
						for (int j = 0; j < y; j++) {
							autos[i][j] = new Auto(random.nextInt(500), (random.nextInt(120) + 1900),
									new Helm(random.nextFloat(), list[random.nextInt(list.length)]),
									new Engine(random.nextInt(24)));
						}
					}
					System.out.println("Random filled array [ " + x + " ] [ " + y + "]  printed:");
					System.out.println(Arrays.deepToString(autos));
					System.out.println("Make a choise to continue...");
					menu2.printMenu();

					break;
				}

				case "2": {
					Auto autoRandom = new Auto(random.nextInt(500), (random.nextInt(120) + 1900),
							new Helm(random.nextFloat(), list[random.nextInt(list.length)]),
							new Engine(random.nextInt(24)));

					for (Auto[] autos2 : autos) {
						Arrays.fill(autos2, autoRandom);
					}

					System.out.println("Filled array [ " + x + " ] [ " + y + "]  printed:");
					System.out.println(Arrays.deepToString(autos));

					System.out.println("Make a choise to continue...");
					menu2.printMenu();
					break;
				}

				case "menu": {
					mainMenu.printMenu();
					break;
				}

				case "q": {
					System.out.println("Application closed. Buy!");
					System.exit(0);
					sc.close();
				}

				default: {

					break;
				}

				}

			}

		}

	}

}
