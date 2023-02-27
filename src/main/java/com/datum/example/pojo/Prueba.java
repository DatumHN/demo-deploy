package com.datum.example.pojo;

/**
 * Clase que contiene la estructura y métodos de Prueba
 * @author Melvin Cruz
 * @version 1.0
 *
 */

public class Prueba {
	// VARIABLES
	private int suma;
	private String variable1 = System.getenv("VARIABLE_ENTORNO_1");	
	private String variable2 = System.getenv("VARIABLE_ENTORNO_2");
	private String variable3 = System.getenv("JAVA_HOME");
	
	public static final String FORMAT = "La suma es, %s!";	
	
	/*for(int i = 0; i<20; i++) {
		System.out.println("Hola Mundo");
	}*/
	
	
	public String SUPEEEEERRRRRR = "Prueba";
	
	
	// CONSTRUCTORES	
	public Prueba() {
        this.suma = 0;
    }
	public Prueba(int sumando1, int sumando2) {
		super();
		this.suma = sumando1 + sumando2;
	}
	
	// GET	
	public int getSuma() {
		return suma;
	}
	public void setSuma(int suma) {
		this.suma = suma;
	}
	
	public String getVariable1() {
		return variable1;
	}
	public void setVariable1(String variable1) {
		this.variable1 = variable1;
	}
	public String getVariable2() {
		return variable2;
	}
	public void setVariable2(String variable2) {
		this.variable2 = variable2;
	}
	public String getVariable3() {
		return variable3;
	}
	public void setVariable3(String variable3) {
		this.variable3 = variable3;
	}
}
