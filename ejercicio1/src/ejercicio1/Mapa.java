package ejercicio1;
import java.util.HashMap;
import java.util.Scanner;


public class Mapa {
	
	private static Scanner sc;
	
//	public String search() {
//		String countryPoint=sc.next();
//		
//		if( isEmpty(myMaps.get(countryPoint))) {
//			return "Vacio";
//		}else {
//			return country;
//		}
//		
//	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		HashMap<String, String> myMaps = new HashMap<String, String>();
		int contador=1;
		
		while(contador < 10) {
			System.out.println("Ingrese el nombre del pais: ");
			String country = sc.next();
			
			System.out.println("Ingrese el nombre de la provincia: ");
			String province= sc.next();

			
			myMaps.put(country, province);
			
			
			contador ++;
		}
		
		
		
		
		
		System.out.println(myMaps);
	}

}
