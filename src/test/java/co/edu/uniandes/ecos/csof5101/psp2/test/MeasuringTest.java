/**
 * MeasuringTest.java
 * PSP Program 3
 * Copyright (c) Universidad de los Andes.
 */
package co.edu.uniandes.ecos.csof5101.psp2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import co.edu.uniandes.ecos.csof5101.psp2.model.Measuring;
import co.edu.uniandes.ecos.csof5101.psp2.view.ConsoleUI;

/**
 * MeasuringTest.
 * 
 * @author Javier Mesa
 * @version 1.0
 * @since 05/03/2017 04:58:29 PM 2017
 */

public class MeasuringTest{
	
	/**
	 * Method to test the method calculateLinearRegression.
	 */
	@Test
	public void calculateLinearRegressionTest(){
		ConsoleUI face = new ConsoleUI();
		face.readFile("./src/test/resources/data.txt");
		Measuring.calculateLinearRegression(face.getData());
		assertEquals(-22.552532752034132, face.getData().getLinearRegressionParam1(), 0.0);
	}
	/**
	 * Method to test the method calculateCorrelationCoefficients.
	 */
	@Test
	public void calculateCorrelationCoefficientsTest(){
		ConsoleUI face = new ConsoleUI();
		face.readFile("./src/test/resources/data.txt");
		Measuring.calculateCorrelationCoefficients(face.getData());
		assertEquals(0.9544965741046826, face.getData().getCorrelationCoefficient1(), 0.0);
	}
	
	/**
	 * Method to test the method calculateImprovedPrediction.
	 */
	@Test
	public void calculateImprovedPredictionTest(){
		ConsoleUI face = new ConsoleUI();
		face.readFile("./src/test/resources/data.txt");
		Measuring.calculateLinearRegression(face.getData());
		Measuring.calculateImprovedPrediction(face.getData(), 386);
		assertEquals(644.4293837638623, face.getData().getImprovedPrediction(), 0.0);
	}
}
