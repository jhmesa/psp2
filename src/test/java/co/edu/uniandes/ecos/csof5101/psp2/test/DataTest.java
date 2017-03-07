/**
 * DataTest.java
 * PSP Program 3
 * Copyright (c) Universidad de los Andes.
 */

package co.edu.uniandes.ecos.csof5101.psp2.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import co.edu.uniandes.ecos.csof5101.psp2.model.Data;

/**
 * DataTest.
 * 
 * @author Javier Mesa
 * @version 1.0
 * @since 05/03/2017 04:58:29 PM 2017
 */
public class DataTest {

	/**
	 * Method to test the method setDataXList.
	 */
	@Test
	public void setDataXListTest(){
		Data data = new Data();
		List<Double> dataXList = new ArrayList<Double>();
		data.setDataXList(dataXList);
		assertEquals(dataXList, data.getDataXList());
	}
	
	/**
	 * Method to test the method setDataYList.
	 */
	@Test
	public void setDataYListTest(){
		Data data = new Data();
		List<Double> dataYList = new ArrayList<Double>();
		data.setDataYList(dataYList);
		assertEquals(dataYList, data.getDataYList());
	}
	
	/**
	 * Method to test the method setLinearRegressionParam1.
	 */
	@Test
	public void setLinearRegressionParam1Test(){
		Data data = new Data();
		data.setLinearRegressionParam1(12.0);
		assertEquals(12.0, data.getLinearRegressionParam1(), 0.0);
	}
	
	/**
	 * Method to test the method setLinearRegressionParam2.
	 */
	@Test
	public void setLinearRegressionParam2Test(){
		Data data = new Data();
		data.setLinearRegressionParam2(12.0);
		assertEquals(12.0, data.getLinearRegressionParam2(), 0.0);
	}
	
	/**
	 * Method to test the method setCorrelationCoefficient1.
	 */
	@Test
	public void setCorrelationCoefficient1Test(){
		Data data = new Data();
		data.setCorrelationCoefficient1(12.0);
		assertEquals(12.0, data.getCorrelationCoefficient1(), 0.0);
	}
	
	/**
	 * Method to test the method setCorrelationCoefficient2.
	 */
	@Test
	public void setCorrelationCoefficient2Test(){
		Data data = new Data();
		data.setCorrelationCoefficient2(12.0);
		assertEquals(12.0, data.getCorrelationCoefficient2(), 0.0);
	}
	
	/**
	 * Method to test the method setImprovedPrediction.
	 */
	@Test
	public void setImprovedPredictionTest(){
		Data data = new Data();
		data.setImprovedPrediction(12.0);
		assertEquals(12.0, data.getImprovedPrediction(), 0.0);
	}
}
