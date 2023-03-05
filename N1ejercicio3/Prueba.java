package tasca5.N1ejercicio3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

public class Prueba {
	
	public static void main(String[] args) {
		try {
			File archivo = new File("c:/Users/rodri/Desktop/prueba.txt");
			if(!archivo.exists()) {
				archivo.createNewFile();
				System.out.println("El archivo ha sido creado");
			}

			FileWriter fr = new FileWriter(archivo);
			BufferedWriter bw= new BufferedWriter(fr);
			PrintWriter pw = new PrintWriter(bw);
			
			for(int i=0;i<4;i++) {
				pw.println("Cristo vive");
			}
			//bw.write("El usuario " + numeroUsuario +" tiene "+puntosAcumulados+" puntos");
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
