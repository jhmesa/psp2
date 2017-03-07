/**
 * Measuring.java
 * PSP Program 3
 * Copyright (c) Universidad de los Andes.
 */
package co.edu.uniandes.ecos.csof5101.psp2.model;

import org.apache.commons.math3.stat.regression.SimpleRegression;

/**
 * Measuring.
 * 
 * @author Javier Mesa
 * @version 1.0
 * @since 05/03/2017 04:58:29 PM 2017
 */

public final class Measuring {

	/**
	 * Method to calculate the linear regression of a dataset.
	 * @param data directory of file
	 */
	public static void calculateLinearRegression(Data data){
		SimpleRegression s = getSimpleRegression(data);
		data.setLinearRegressionParam1(s.getIntercept());
		data.setLinearRegressionParam2(s.getSlope());
	}
	
	/**
	 * Method to calculate the correlation coefficients of a dataset.
	 * @param data object that contains the values of the x and y axes
	 */
	public static void calculateCorrelationCoefficients(Data data){
		SimpleRegression s = getSimpleRegression(data);
		data.setCorrelationCoefficient1(s.getR());
		data.setCorrelationCoefficient2(s.getRSquare());
	}

	/**
	 * Method to calculate the improved prediction of a dataset.
	 * @param data object that contains the values of the x and y axes
	 * @param estimadedProxy estimaded proxy value
	 */
	public static void calculateImprovedPrediction(Data data, double estimadedProxy){
		data.setImprovedPrediction(data.getLinearRegressionParam1() + data.getLinearRegressionParam2() 
		    * estimadedProxy);
	}
	
	/**
	 * Method to get Simple Regression object for dataset.
	 * @param data object that contains the values of the x and y axes
	 * @return simpleRegression object containing the values to make the calculations 
	 */
	public static SimpleRegression getSimpleRegression(Data data){
		SimpleRegression simpleRegression= new SimpleRegression();
		
		for (int i = 0; i < data.getDataXList().size(); i++) {
			simpleRegression.addData(data.getDataXList().get(i), data.getDataYList().get(i));
		}
		return simpleRegression;
	}
}