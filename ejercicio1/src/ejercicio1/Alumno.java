package ejercicio1;
import java.util.Scanner;

public class Alumno {
	private Scanner teclado;
	private String nombre;
	private int edad;
	private String materia;
	private int calificacion;
	
//	public Alumno(String nuevoAlumno) {
//		nombre = nuevoAlumno; //Se le da un nuevo nombre al alumno
//	}
	
	public Alumno() {
		teclado= new Scanner(System.in);
		System.out.println("Ingrese nombre: ");
		nombre= teclado.next();
	}
	
//	Metodo para obtener edad
	public int getEdad() {
		return edad;
	}
	
//	Metodo para setear edad
	public void setEdad(int nuevaEdad) {
		edad = nuevaEdad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		Creo alumno cuyo nombre es Rodrigo
		Alumno miAlumno = new Alumno();
		
//		Seteo edad = 10 en Rodrigo
//		miAlumno.setEdad(10);
		
//		Muestro el nombre del alumno por pantalla	
		System.out.println("El nombre es " + miAlumno.getNombre());
		

	}

}
