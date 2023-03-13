package tasca5.N1ejercicio3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

	private static List<String> datosArchivo = new ArrayList<>();

	public static void listarDirectorio(String path, String separador) {
		File d = new File(path);
		String[] listaDirectorios = d.list();

		for (String string : listaDirectorios) {
			File archivo = new File(d, string);

			long fecha = archivo.lastModified();
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm aa");
			Date lastModifiedDate = new Date(fecha);

			datosArchivo.add(separador + " " + string + "   " + (archivo.isDirectory() ? "D" : "F") + "   "
					+ simpleDateFormat.format(lastModifiedDate));

			System.out.println(separador + " " + string + "   " + (archivo.isDirectory() ? "D" : "F") + "   "
					+ simpleDateFormat.format(lastModifiedDate));

			if (archivo.isDirectory()) {
				path = archivo.getPath();
				listarDirectorio(path, separador + " ");
			}
		}
	}

	public void crearArchivoTxt(List<String> datosArchivo) {

		File file = new File("C:/Users/rodri/Desktop/pruebas.txt");
		try {
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			for (String s : datosArchivo) {
				bufferedWriter.write(s + "\n");
			}
			bufferedWriter.close();
			System.out.println("Archivo creado");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		String path = args[0];
		Main app = new Main();
		app.listarDirectorio(path, "");
		app.crearArchivoTxt(datosArchivo);

	}

}