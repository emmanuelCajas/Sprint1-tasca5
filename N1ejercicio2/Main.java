package tasca5.N1ejercicio2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Main {

	public static void listarDirectorios(File directorio, String separador){
		String[] listaDirectorios = directorio.list();
		
		for (int i=0 ; i<listaDirectorios.length; i++) {
			File f = new File(directorio,listaDirectorios[i]);
			
			long fecha = f.lastModified();
			String pattern = "yyyy-MM-dd hh:mm aa";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);			
			Date lastModifiedDate = new Date( fecha );
			
			System.out.println( separador + " "+ listaDirectorios[i]+ "   " + (f.isDirectory() ? "D":"F") + "   "+
								simpleDateFormat.format(lastModifiedDate) );
			
			if(f.isDirectory()) {
				listarDirectorios(f,separador+" ");
			}
		}		
		
	}
		
	public static void main(String[] args) {
		String nombre = "c:/Users/rodri/Desktop/meses";
		String separador = "";
		File directorio = new File(nombre);
		listarDirectorios(directorio, separador);
	}
}

