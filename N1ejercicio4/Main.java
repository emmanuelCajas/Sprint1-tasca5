package tasca5.N1ejercicio4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	
	
	
	public static void main(String[] args) {
	
//		javac Main.java
//		java Main.java C:/Users/rodri/Desktop/prueba.txt --> txt debe exixtir en la ruta para poder leerlo

		
		
		if(args.length == 0) {
			System.out.println("Ingrese un directorio");
			System.exit(1);
		}
		
		String archivoTxt=args[0];
		
		try {
			
			BufferedReader leerArchivo=new BufferedReader(new FileReader(archivoTxt));
			
			String linea;
			while((linea=leerArchivo.readLine())!= null) {
				System.out.println(linea);
			}
			
			leerArchivo.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
