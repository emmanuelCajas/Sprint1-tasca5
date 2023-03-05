package tasca5.N1ejercicio3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void listarDirectorios(File directorio, String separador, BufferedWriter bw) throws IOException {

		String[] listaDirectorios = directorio.list();

		for (String string : listaDirectorios) {
			File archivo = new File(directorio, string);
			
			long fecha = archivo.lastModified();
			String pattern = "yyyy-MM-dd hh:mm aa";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);			
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

	public static void main(String[] args) {

		File directorio = new File("C:/Users/rodri/Desktop/meses");

		BufferedWriter bw = null;

		try {

			bw = new BufferedWriter(new FileWriter("C:/Users/rodri/Desktop/pruebas.txt"));
			listarDirectorios(directorio, "", bw);

		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}