package ejercicio1;
import java.lang.Math;
import java.util.Scanner;
import java.util.ArrayList;


public class Polinomio {
	private static Scanner sc;
	
	public static int updateGrade() {
		sc = new Scanner(System.in);
		
		System.out.println("Cuantos grados tendra tu polinomio?: ");
		int grade=sc.nextInt();
		
		return grade;
	}
	
	public static int updateValues() {
		int cantGrade=updateGrade();
		int contador=0;
		ArrayList<Integer> mainPoli= new ArrayList<Integer>();
//		int [] mainPoli= new int [cantGrade + 1];
		
		while (contador < cantGrade+1) {
			System.out.println("Dame un valor: ");
			int value=sc.nextInt();
			
			for (int i = 0; i < mainPoli.size(); i++) {
				mainPoli.add(value);
				
			}
			
			
			contador++;
			
		}
		
		
		
		return cantGrade;
	}
	
	public static void showPoli() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Polinomio myPol= new Polinomio(); 
		
		myPol.updateValues();

	}

}
