/**
 * DataTest.java
 * PSP Program 6
 * Copyright (c) Universidad de los Andes.
 */

package co.edu.uniandes.ecos.csof5101.psp2.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import co.edu.uniandes.ecos.csof5101.psp2.model.Data;

/**
 * DataTest.
 * 
 * @author Javier Mesa
 * @version 1.0
 * @since 09/04/2017 04:58:29 PM 2017
 */
public class DataTest {

	/**
	 * Method to test the method setDof.
	 */
	@Test
	public void setDofTest(){
		Data data = new Data();
		data.setDof(9.0);
		assertEquals(9.0, data.getDof(),0.0);
	}
	
	/**
	 * Method to test the method setX.
	 */
	@Test
	public void setXTest(){
		Data data = new Data();
		data.setX(0.0);
		assertEquals(0.0, data.getX(),0.0);
	}
	
	/**
	 * Method to test the method setW.
	 */
	@Test
	public void setWTest(){
		Data data = new Data();
		data.setW(2.0);
		assertEquals(2.0, data.getW(),0.0);
	}
	
	/**
	 * Method to test the method setP.
	 */
	@Test
	public void setPTest(){
		Data data = new Data();
		data.setP(10.0);
		assertEquals(10.0, data.getP(),0.0);
	}
}
