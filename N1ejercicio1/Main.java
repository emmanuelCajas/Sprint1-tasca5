package tasca5.N1ejercicio1;

import java.io.File;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		
		//"c:/Users/formacio/Desktop"
		//"c:/Users/rodri/Desktop"
		
		File directorio = new File("c:/Users/rodri/Desktop");
		String[] listaDirectorios = directorio.list();
		
		Arrays.sort(listaDirectorios);
		
		if(directorio.isDirectory()) {
			for (String listado : listaDirectorios) {
				System.out.println(listado);
			}
		}else {
			System.out.println("La ruta ingresada no es un directorio");
		}
	}
}
