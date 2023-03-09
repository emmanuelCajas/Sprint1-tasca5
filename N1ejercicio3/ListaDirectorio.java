package tasca5.N1ejercicio3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ListaDirectorio {

	public static void listarDirectorios(File directorio, String separador, BufferedWriter bw) throws IOException {

		String[] listaDirectorios = directorio.list();

		for (String string : listaDirectorios) {
			File archivo = new File(directorio, string);
			
			long fecha = archivo.lastModified();
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm aa");			
			Date lastModifiedDate = new Date( fecha );
			
			System.out.println( separador + " " + string + "   " + (archivo.isDirectory() ? "D":"F") + "   "+
								simpleDateFormat.format(lastModifiedDate) );
			
			bw.write( separador + " " + string + "   " + (archivo.isDirectory() ? "D":"F") + "   "+
					simpleDateFormat.format(lastModifiedDate)+ "\n");

			if (archivo.isDirectory()) {
				listarDirectorios(archivo, separador + " ", bw);
			}
		}

	}
	
}
