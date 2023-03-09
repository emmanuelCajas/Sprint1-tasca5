package tasca5.N1ejercicio2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ListaDirectorio {
	
	
	public static void listarDirectorios(File directorio, String separador){
		String[] listaDirectorios = directorio.list();
		
		for (int i=0 ; i<listaDirectorios.length; i++) {
			File f = new File(directorio,listaDirectorios[i]);
			
			long fecha = f.lastModified();
			SimpleDateFormat spf = new SimpleDateFormat("yyyy-MM-dd hh:mm aa");			
			Date lastModifiedDate = new Date(fecha);
			
			System.out.println(separador + " "+ listaDirectorios[i]+ "   " + (f.isDirectory() ? "D":"F") + "   "+
								spf.format(lastModifiedDate));
			
			if(f.isDirectory()) {
				listarDirectorios(f,separador+" ");
			}
		}		
		
	}
}
