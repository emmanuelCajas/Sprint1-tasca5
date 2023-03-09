package tasca5.N1ejercicio3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	

	public static void main(String[] args) {

		String dir = "C:/Users/rodri/Desktop/meses";
		String dirArchivo = "C:/Users/rodri/Desktop/pruebas.txt";
		File directorio = new File(dir);

		BufferedWriter bw = null;

		try {
			bw = new BufferedWriter(new FileWriter(dirArchivo));
			ListaDirectorio.listarDirectorios(directorio, "", bw);
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