/**
 * LaunchProgram3.java
 * PSP Program 2
 * Copyright (c) Universidad de los Andes.
 */
package co.edu.uniandes.ecos.csof5101.psp2.controller;

import java.util.Scanner;

import co.edu.uniandes.ecos.csof5101.psp2.view.ConsoleUI;

/**
 * LaunchProgram3.
 * 
 * @author Javier Mesa
 * @version 1.0
 * @since 05/03/2017 04:58:29 PM 2017
 */

public class LaunchProgram3 {

	/**
	 * Launch the application.
	 * @param args inputs arguments for the application
	 */
	public static void main(String[] args) {
		ConsoleUI face = new ConsoleUI();
		String path = "";
		double estimadedProxy = 0;
		for (String string : args) {
			path += string;
		}
		if(path  != null && !path.equalsIgnoreCase("")){
			Scanner reader = new Scanner(System.in);
			System.out.println("Enter estimaded proxy:");
			estimadedProxy = reader.nextDouble();
			reader.close();
		}
		face.readFile(path);
		face.calculateMeasuring(estimadedProxy);
		face.printMeasuring();
	}
}
