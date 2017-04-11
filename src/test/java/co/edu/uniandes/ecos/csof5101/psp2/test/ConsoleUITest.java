/**
 * ConsoleUITest.java
 * PSP Program 6
 * Copyright (c) Universidad de los Andes.
 */
package co.edu.uniandes.ecos.csof5101.psp2.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import co.edu.uniandes.ecos.csof5101.psp2.view.ConsoleUI;

/**
 * ConsoleUITest.
 * 
 * @author Javier Mesa
 * @version 1.0
 * @since 09/04/2017 04:58:29 PM 2017
 */

public class ConsoleUITest {
	
	/**
	 * Method to test the method calculateMeasurings.
	 */
	@Test
	public void calculateMeasuringsTest(){
		ConsoleUI face = new ConsoleUI();
		face.getData().setP(0.2);
		face.getData().setDof(6.0);
		face.calculateMeasurings();
		
		assertEquals(0.5533828735351562, face.getData().getX(),0.0);
	}
	
	/**
	 * Method to test the method printMeasurings.
	 */
	@Test
	public void printMeasuringsTest(){
		ConsoleUI face = new ConsoleUI();
		face.getData().setP(0.2);
		face.getData().setDof(6.0);
		face.calculateMeasurings();
		ArrayList<String> output = new ArrayList<String>();
		output.add("p = 0.2");
		output.add("dof = 6.0");
		output.add("-------------------------");
		output.add("The expected value is = 0.5533828735351562");
		face.printMeasurings();
		
		assertEquals(output.get(0), face.printMeasurings().get(0));
	}
}
