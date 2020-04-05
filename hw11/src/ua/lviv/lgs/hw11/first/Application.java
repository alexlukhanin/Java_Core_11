/**
 * The homework on "Java Core" Course in LOGOS IT Academy
 * Lesson 11 - Collection Framework
 * 
 * *
 */

package ua.lviv.lgs.hw11.first;



/**
 * *
 * Application includes 1st task 
 * @author alexl
 * 
 * @version 1.0
 *
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Application {

	public static void main(String[] args) {

		Integer[] arrayOfIntegers = new Integer[50]; // first array
		Random random = new Random();
		System.out.println("This is a row array:");
		for (int i = 0; i < arrayOfIntegers.length; i++) {
			arrayOfIntegers[i] = random.nextInt(100); 
			System.out.print(arrayOfIntegers[i] + " "); // print array in a classic way during the filling
		}
		System.out.println("");
		printArraySortedASCDSC(arrayOfIntegers);
		

	}
	/* This method outputs sorted arrays. Asc and then desc with comments*/
	public static void printArraySortedASCDSC(Integer[] array) {
		System.out.println("This is a sorted array(asc):");
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		System.out.println("This is a sorted array(desc):");
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println(Arrays.toString(array));
	}

}
