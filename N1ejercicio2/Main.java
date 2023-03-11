package tasca5.N1ejercicio2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		String nombre = "c:/Users/rodri/Desktop/meses";
		String separador = "";
		File directorio = new File(nombre);
		ListaDirectorio.listarDirectorios(directorio, separador);
		
	}
}

