package ejercicio1;
import java.util.Random;
import java.util.Scanner;

public class Cuestionario {
	private String [] preguntas;
	private String [] respuestas;

	public String getPreguntas() {
		return preguntas;
	}
	
	public String getRespuestas() {
		return respuestas;
	}
	
	public String setRespuestas(String [] respuestas) {
		return this.respuestas= respuestas;
	}
	
	public String preguntar(String [] preguntas) {
		Random rd = new Random();
		String preguntas2[]= {"Cuanto es 2+2 ?", "Cuanto es 8*2 ?", "Cuanto es 15/5 ?", "Cuanto es 600-300 ?", "Cuanto es 7+2 ?", "Cuanto es 2+78 ?", "Cuanto es 500 - 30 ?", "Cuanto es 250 / 2 ?"};
		x=rd.nextInt(7);
		setRespuestas(preguntas2);
		System.out.println(preguntas[x]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Random rd = new Random(); 
		Cuestionario cs = new Cuestionario ();
		
		cs.preguntar();
			
		
		
	}

}
