package tasca5.N1ejercicio2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	
	public static void listarDirectorio(String path, String separador){
		
		File d =new File(path);
		String[] listaDirectorios = d.list();
		
		for (int i=0 ; i<listaDirectorios.length; i++) {
			
			File f = new File(d,listaDirectorios[i]);
			
			long fecha = f.lastModified();
			SimpleDateFormat spf = new SimpleDateFormat("yyyy-MM-dd hh:mm aa");			
			Date lastModifiedDate = new Date(fecha);
			
			System.out.println(separador + " "+ listaDirectorios[i]+ "   " + (f.isDirectory() ? "D":"F") + "   "+
								spf.format(lastModifiedDate));
			
			if(f.isDirectory()) {
				path=f.getPath();
				listarDirectorio(path,separador+" ");
			}
		}		
		
	}
	
	public static void main(String[] args) {
		
	    String path = args[0];
		Main app = new Main();
		app.listarDirectorio(path, "");
	}
}

