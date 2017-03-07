/**
 * ConsoleUITest.java
 * PSP Program 3
 * Copyright (c) Universidad de los Andes.
 */
package co.edu.uniandes.ecos.csof5101.psp2.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import co.edu.uniandes.ecos.csof5101.psp2.view.ConsoleUI;

/**
 * ConsoleUITest.
 * 
 * @author Javier Mesa
 * @version 1.0
 * @since 05/03/2017 04:58:29 PM 2017
 */

public class ConsoleUITest {

	/**
	 * Method to test the method readFile.
	 */
	@Test
	public void readFileTest(){
		ConsoleUI face = new ConsoleUI();
		face.readFile("./src/test/resources/data.txt");
		assertEquals(true, face.getData().getDataXList().contains(130.0));
	}
}
