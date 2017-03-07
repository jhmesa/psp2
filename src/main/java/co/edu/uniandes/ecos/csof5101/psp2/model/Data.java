/**
 * Data.java
 * PSP Program 2
 * Copyright (c) Universidad de los Andes.
 */
package co.edu.uniandes.ecos.csof5101.psp2.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Data.
 * 
 * @author Javier Mesa
 * @version 1.0
 * @since 05/03/2017 04:58:29 PM 2017
 */
public class Data {
	
	//Instance variables
	private List<Double> dataXList = new ArrayList<Double>();
	private List<Double> dataYList = new ArrayList<Double>();
	private double linearRegressionParam1;
	private double linearRegressionParam2;
	private double correlationCoefficient1;
	private double correlationCoefficient2;
	private double improvedPrediction;
	
	/**
	 * @return the dataXList
	 */
	public List<Double> getDataXList() {
		return dataXList;
	}
	
	/**
	 * @param dataXList the dataXList to set
	 */
	public void setDataXList(List<Double> dataXList) {
		this.dataXList = dataXList;
	}
	
	/**
	 * @return the dataYList
	 */
	public List<Double> getDataYList() {
		return dataYList;
	}
	
	/**
	 * @param dataYList the dataYList to set
	 */
	public void setDataYList(List<Double> dataYList) {
		this.dataYList = dataYList;
	}
	
	/**
	 * @return the linearRegressionParam1
	 */
	public double getLinearRegressionParam1() {
		return linearRegressionParam1;
	}
	
	/**
	 * @param linearRegressionParam1 the linearRegressionParam1 to set
	 */
	public void setLinearRegressionParam1(double linearRegressionParam1) {
		this.linearRegressionParam1 = linearRegressionParam1;
	}
	
	/**
	 * @return the linearRegressionParam2
	 */
	public double getLinearRegressionParam2() {
		return linearRegressionParam2;
	}
	
	/**
	 * @param linearRegressionParam2 the linearRegressionParam2 to set
	 */
	public void setLinearRegressionParam2(double linearRegressionParam2) {
		this.linearRegressionParam2 = linearRegressionParam2;
	}
	
	/**
	 * @return the correlationCoefficient1
	 */
	public double getCorrelationCoefficient1() {
		return correlationCoefficient1;
	}
	
	/**
	 * @param correlationCoefficient1 the correlationCoefficient1 to set
	 */
	public void setCorrelationCoefficient1(double correlationCoefficient1) {
		this.correlationCoefficient1 = correlationCoefficient1;
	}
	
	/**
	 * @return the correlationCoefficient2
	 */
	public double getCorrelationCoefficient2() {
		return correlationCoefficient2;
	}
	
	/**
	 * @param correlationCoefficient2 the correlationCoefficient2 to set
	 */
	public void setCorrelationCoefficient2(double correlationCoefficient2) {
		this.correlationCoefficient2 = correlationCoefficient2;
	}
	
	/**
	 * @return the improvedPrediction
	 */
	public double getImprovedPrediction() {
		return improvedPrediction;
	}
	
	/**
	 * @param improvedPrediction the improvedPrediction to set
	 */
	public void setImprovedPrediction(double improvedPrediction) {
		this.improvedPrediction = improvedPrediction;
	}
}
