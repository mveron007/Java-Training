package com.demo;

import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

public class DemoApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int count=0;
		ArrayList<String> variables= new ArrayList<String>();
		
		String variable="Usuario:";
		
		System.out.println("Pone tu usuario: ");
		String response=sc.next();
		
		System.out.println("Pone el tamaño de el arreglo: ");
		int size=sc.nextInt();
		ArrayList<String> myArray= new ArrayList<String>();
		
		for (int j = 0; j < variable.length(); j++) {
			char v=variable.charAt(j);
			String sv=String.valueOf(v);
			variables.add(sv);
		}
		
		while (count < (size - variables.size())) {
			for (int i = response.length(); i > 0 ; i--) {
				char c=response.charAt(i);
				String s=String.valueOf(c);
				variables.add(s);
				
				if (i == 0) {
					variables.add(" ");
				}
			}
		
		
		}
		
		for (int k = 0; k < variables.size(); k++) {
			
			System.out.println(variables.get(k));
			
			
		}

	}

}
