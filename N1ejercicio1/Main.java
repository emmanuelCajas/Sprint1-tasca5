package tasca5.N1ejercicio1;

import java.io.File;
import java.util.Arrays;

public class Main {
	File file;
	static String path;
	
	public  void listaDirectorio(String dir) {

		file = new File(dir);
		String[] listaDirectorios = file.list();

		Arrays.sort(listaDirectorios);

		if (file.isDirectory()) {
			for (String listado : listaDirectorios) {
				System.out.println(listado);
			}
		} else {
			System.out.println("La ruta ingresada no es un directorio");
		}
	}

	public static void main(String[] args) {
		
	    path = args[0];
		Main app = new Main();
		app.listaDirectorio(path);
		
	}
}
