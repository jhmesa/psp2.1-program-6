/**
 * ConsoleUI.java
 * PSP Program 6
 * Copyright (c) Universidad de los Andes.
 */

package co.edu.uniandes.ecos.csof5101.psp2.view;

import java.util.ArrayList;

import spark.Request;
import co.edu.uniandes.ecos.csof5101.psp2.model.Data;
import co.edu.uniandes.ecos.csof5101.psp2.model.Measuring;

/**
 * ConsoleUI.
 * 
 * @author Javier Mesa
 * @version 1.0
 * @since 09/04/2017 04:58:29 PM 2017
 */

public class ConsoleUI {
	
	//Instance Variables
	private Data data = new Data();

	/**
	 * Method to read the parameters from URL.
	 * @param req object that contains the request params
	 */
	public void readValuesFromURL(Request req) {
		String p = req.queryParams("p");
		String dof = req.queryParams("dof");
		double pNumber = p != null?Double.valueOf(p):0;
		double dofNumber = dof != null?Double.valueOf(dof):0;
		data.setP(pNumber);
		data.setDof(dofNumber);
	}

	/**
	 * Method to print the metrics calculated on the page.
	 * @return output list that contains the strings for impressions in the web page
	 */
	public ArrayList<String> printMeasurings() {
		ArrayList<String> output = new ArrayList<String>();
		if(data != null){
			output.add("p = " + getData().getP());
			output.add("dof = " + getData().getDof());
			output.add("-------------------------");
			output.add("The expected value is = " + data.getX());
		}
		return output;
	}
	
	/**
	 * Method to calculate the measurings.
	 */
	public void calculateMeasurings(){
		Measuring.calculateX(getData());
	}
	
	/**
	 * @return the data
	 */
	public Data getData() {
		return data;
	}
}
