package ejercicio1;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class MapaTwo {
	
	public ArrayList<String> updatingList(){
		ArrayList<String> list = new ArrayList<String>(); 
		
		list.add("Usuario A");
		list.add("Usuario B");
		list.add("Usuario C");
		
		return list;
		
	}
	
	public ArrayList<String> updatingList2(){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		int count=1;
		
		System.out.println("Ingrese un nuevo usuario: ");
		String user=sc.next();
		list.add(user);
		
		
		
		return list;
		
	}
	
	HashMap<String, ArrayList<String>> myMaps = new HashMap<String, ArrayList<String>>();
	
	public void updatingMap() {
		String indice= "-";
		ArrayList<String> newList= updatingList();
		
		myMaps.put(indice, newList);
		
		
	}
	
	public void updatingMap2() {
		Scanner sc=new Scanner(System.in);
		int count=1;
		
		
		while(count < 5) {
			System.out.println("Indice: ");
			String item= sc.next();
			ArrayList<String> newList= updatingList2();
			myMaps.put(item, newList);
			
			count ++;
		}
		
		
		
	}
	
	public void show() {

		for (String i : myMaps.keySet()) {
			System.out.println( "Usuario: " + i + myMaps.get(i));
		}
	}
	
	public void getUser() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Buscar Indice: ");
		String item=sc.next();
		
		for (String i : myMaps.keySet()) {
			if(myMaps.containsKey(item) == true) {
				System.out.println(myMaps.get(item));
				break;
			}else {
				System.out.println("Te equivocaste");
			}
		}
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MapaTwo mapa= new MapaTwo();
		
		mapa.updatingMap2();
		mapa.show();
		
		mapa.getUser();

		
	}

}
