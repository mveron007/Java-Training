package com.curso.java.app;
import java.lang.Math;
//import java.util.Collection;


public class Cartas {
	private String [] palos= {"Basto", "Espada", "Oro", "Copa"};
	private String [] cantidad= {"1", "2", "3", "4", "5", "6", "7", "10", "11", "12"};
	private String [][] baraja=new String[4][10];;
	
	public String[][] loadMazo() {
		for (int i = 0; i < baraja.length; i++) {
			for (int j = 0; j < baraja[i].length; j++) {
				baraja[i][j]= palos[i] + cantidad[j];
			}
		}
		
		return baraja;
	}
	
	public String[][] showMazo() {
		String [][] nC=loadMazo();
		for (int i = 0; i < nC.length; i++) {
			for (int j = 0; j < nC[i].length; j++) {
				System.out.println(nC[i][j]);
			}
		}
		return nC;
	}
	
	public void mixMazo() {
		String[][] mixed=showMazo();
		int ranPalo = (3-1)+1;
		int ranCantidad = (9-1)+1;

		
		
		for (int i = 0; i < 3; i++) {
			int palo= (int) Math.floor(Math.random()* ranPalo +1);
			int cant= (int) Math.floor(Math.random()* ranCantidad +1);
			
		
			System.out.println("Carta "+ (i+1) + " " + mixed[palo][cant]) ;
			
			
		}
		
	}

}
