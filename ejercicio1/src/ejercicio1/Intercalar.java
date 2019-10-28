package ejercicio1;
import java.util.Scanner;
import java.util.ArrayList;


public class Intercalar {
	
	
	public static int[] updateFirst() {
		Scanner sc=new Scanner(System.in);
		int [] first = new int [3];
		int count=1;
		
		while(count < 3) {
			System.out.println("Ingrese un numero: ");
			first[count]= sc.nextInt();
			
			count ++;
		}
		
		return first;
	}
	
	public static int[] updateSecond() {
		Scanner sc=new Scanner(System.in);
		int [] second = new int [3];
		int count=1;
		
		while(count < 3) {
			System.out.println("Ingrese un numero: ");
			second[count]= sc.nextInt();
			
			count ++;
		}
		return second;
	}
	
	public static void updateInter() {
		int [] third = new int [6];
		int [] myOne = updateFirst();
		int [] mySec = updateSecond();
		
		for (int i = 0; i < myOne.length; i++) {
			System.out.println("La primera " + myOne[i]);
		}
		
		for (int j = 0; j < mySec.length; j++) {
			System.out.println("La seg " + mySec[j]);
		}
		
		for (int m = 0; m < myOne.length; m++) {
			third[m]=myOne[m];
		}
		
		for (int a = 1; a < mySec.length; a++) {
			third[a]=mySec[a];
		}
		
		for (int i = 0; i < third.length; i++) {
			System.out.println("Intercalada: " + third[i]);
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Intercalar list=new Intercalar();
		
		list.updateFirst();
		list.updateSecond();
		
		list.updateInter();

	}

}
