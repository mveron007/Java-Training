package ejercicio1;
import java.util.Scanner;

public class Usuario {
	private Scanner teclado;
	private String nombre;
	
	public Usuario() {
		teclado= new Scanner(System.in);
		System.out.println("Ingrese nombre: ");
		nombre= teclado.next();
	}
	
	public String getNombre(){
		return nombre;
	}
	
//	public void setNombre(String nuevoNombre) {
//		return this.nombre = nuevoNombre;
//	}
	
	public String[] invertirNombre(String nombre) {
		String [] nombreInvertido=new  String [nombre.length()] ;
		String [] nombreCaracteres = nombre.split("");
		int aux= nombreCaracteres.length -1; 
		
		for (int i= nombreCaracteres.length-1; i >= 0;  i--) {
			nombreInvertido[aux - i] = nombreCaracteres[i];
		
			
		}
		
		return nombreInvertido; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario usuarioUno = new Usuario();
		String[] a = usuarioUno.invertirNombre("Alberto");
		
		for (int i=0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	

	}

}
