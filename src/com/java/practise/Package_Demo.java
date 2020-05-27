/**
 * 
 */
package com.java.practise;

import java.util.Random;

/**
 * @author Sikandar Azam Shah
 * @since <strong>27 May 2020 </strong>
 *
 */
public class Package_Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(random());
		}
	}
	/**
	 * This method returns random number less then 100.
	 * @return int
	 */
	public static int random() {
		Random random = new Random();
		return random.nextInt(100);
	}
	
	

}
