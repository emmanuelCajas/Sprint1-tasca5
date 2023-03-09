package tasca5.N1ejercicio1;

import java.io.File;
import java.util.Arrays;

public class ListaDirectorio {
//"c:/Users/rodri/Desktop"
	public static void listaDirectorio(String dir) {
		
		File directorio = new File(dir);
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
