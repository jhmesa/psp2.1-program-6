/**
 * Data.java
 * PSP Program 6
 * Copyright (c) Universidad de los Andes.
 */
package co.edu.uniandes.ecos.csof5101.psp2.model;

/**
 * Data.
 * 
 * @author Javier Mesa
 * @version 1.0
 * @since 09/04/2017 04:58:29 PM 2017
 */
public class Data {
	
	// Constants
	public static final double ERROR = 0.000001;
	public static final double SEGMENT_NUMBER = 10;

	//Instance variables
	private double dof;
	private double x;
	private double w;
	private double p;
	
	/**
	 * @return the dof
	 */
	public double getDof() {
		return dof;
	}
	
	/**
	 * @param dof the dof to set
	 */
	public void setDof(double dof) {
		this.dof = dof;
	}
	
	/**
	 * @return the x
	 */
	public double getX() {
		return x;
	}
	
	/**
	 * @param x the x to set
	 */
	public void setX(double x) {
		this.x = x;
	}
	
	/**
	 * @return the w
	 */
	public double getW() {
		return w;
	}
	
	/**
	 * @param w the w to set
	 */
	public void setW(double w) {
		this.w = w;
	}
	
	/**
	 * @return the p
	 */
	public double getP() {
		return p;
	}
	
	/**
	 * @param p the p to set
	 */
	public void setP(double p) {
		this.p = p;
	}
}
