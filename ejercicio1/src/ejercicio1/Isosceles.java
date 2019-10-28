package ejercicio1;
import java.lang.Math;
import java.util.Scanner;

public class Isosceles {
	private static int adyascente;
	private static int hypotenusa;
	private static int base;
	private static Scanner sc;
	
	
//	public Isosceles(int adyascente, int hypotenusa, int base) {
//		this.adyascente = adyascente;
//		this.hypotenusa = hypotenusa;
//		this.base = base;
//	}
	


	public static int updateSideA() {
		sc = new Scanner(System.in);
		
		System.out.println("Ingrese adyascente: ");
		int adyascente=sc.nextInt();
		
		return adyascente;
		
	}
	
	public static int updateHyp() {
		sc = new Scanner(System.in);
		System.out.println("Ingrese hypotenusa: ");
		int hypotenusa=sc.nextInt();
		
		return hypotenusa;
	}
	
	public static int updateBase() {
		sc = new Scanner(System.in);
		System.out.println("Ingrese base: ");
		int base=sc.nextInt();
		
		return base;
	}
	
	public static int perimeter() {
	
			adyascente=updateSideA();
			base=updateBase();
		
		
		int per= (2*adyascente) + base;
		
		System.out.println("El resultado del perimetro es " + per + "\n");
		
		return per;
		
	}
	
	public static int area() {
		System.out.println("Calculemos el area!! \n" );
		base=updateBase();
		hypotenusa=updateHyp();
		int ar=(base*hypotenusa)/2;
		System.out.println("El resultado del area es " + ar);
		
		return ar;
	}
	
	public static void comparative() {
		sc = new Scanner(System.in);
		System.out.println("Cuantos triangulos desea comparar?: ");
		int triangulo=sc.nextInt();
		int contador=0;
		int [] cantTri= new int [triangulo];
		
		
		while(contador < triangulo) {
			int perimeter=perimeter();
			
			for (int i = 0; i < cantTri.length; i++) {
				cantTri[i]=perimeter;
				
			}
			
			contador ++;
		}
		
		for (int i = 0; i < cantTri.length; i++) {
			System.out.println("Array" + cantTri[i]);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Isosceles myTri=new Isosceles();
		
		
//		myTri.perimeter();
//		
//		myTri.area();
		
		myTri.comparative();

	}

}
