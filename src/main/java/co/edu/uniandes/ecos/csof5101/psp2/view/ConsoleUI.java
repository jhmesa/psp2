/**
 * ConsoleUI.java
 * PSP Program 3
 * Copyright (c) Universidad de los Andes.
 */

package co.edu.uniandes.ecos.csof5101.psp2.view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import co.edu.uniandes.ecos.csof5101.psp2.model.Data;
import co.edu.uniandes.ecos.csof5101.psp2.model.Measuring;

/**
 * ConsoleUI.
 * 
 * @author Javier Mesa
 * @version 1.0
 * @since 05/03/2017 04:58:29 PM 2017
 */

public class ConsoleUI {
	
	//Instance Variables
	private Data data = new Data();

	/**
	 * Method to get the dataset of the file.
	 * @param path directory of file
	 */
	public void readFile(String path) {
		if(null == path || path.equalsIgnoreCase("")){
			System.out.println("Path is empty!!");
		}else{
			try {
				BufferedReader br =  new BufferedReader(new FileReader(path));
				String line = br.readLine();
				while (null != line) {
					String[]tokens = line.split(",");
					data.getDataXList().add(Double.valueOf(tokens[0]));
					data.getDataYList().add(Double.valueOf(tokens[1]));
					line = br.readLine();
				}
				br.close();
			} catch (IOException e) {
				System.out.println("Failed to get file:" + path);
			}
		}
	}

	/**
	 * Method to print measurings in console.
	 */
	public void printMeasuring() {
		if(!data.getDataXList().isEmpty()
		    && !data.getDataYList().isEmpty()){
			
			System.out.println("For the estimaded proxy entered and following data:");
			System.out.println("x       y");
			for (int i = 0; i < data.getDataXList().size(); i++) {
				System.out.println(data.getDataXList().get(i) + "    " + data.getDataYList().get(i));
			}
			
			System.out.println("-------------------------");
			System.out.println("B(0)is  = " + data.getLinearRegressionParam1());
			System.out.println("B(1) is = " + data.getLinearRegressionParam2());
			System.out.println("r(xy) is = " + data.getCorrelationCoefficient1());
			System.out.println("r^2 is = " + data.getCorrelationCoefficient2());
			System.out.println("Y(k) is = " + data.getImprovedPrediction());
		}
	}
	
	/**
	 * Method to print measurings in console.
	 * @param estimadedProxy estimaded proxy value
	 */
	public void calculateMeasuring(double estimadedProxy){
		Measuring.calculateLinearRegression(this.data);
		Measuring.calculateCorrelationCoefficients(this.data);
		Measuring.calculateImprovedPrediction(this.data, estimadedProxy);
	}
	
	/**
	 * @return the data
	 */
	public Data getData() {
		return data;
	}
}
