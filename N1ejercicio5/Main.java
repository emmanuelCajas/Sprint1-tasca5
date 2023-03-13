
package tasca5.N1ejercicio5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void serializar(String path,Producto[] listaProductos) {

		ObjectOutputStream serializando;
//		String directorio = "C:/Users/rodri/Desktop/producto.ser";
		try {
			serializando = new ObjectOutputStream(new FileOutputStream(path));
			serializando.writeObject(listaProductos);
			serializando.close();

			System.out.println("El archivo ha sido creado...");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		deSerializar(path);

	}

	public static void deSerializar(String directorio) {

		ObjectInputStream deserializando;
		try {
			deserializando = new ObjectInputStream(new FileInputStream(directorio));
			Producto[] listaProductosDeserlializado = (Producto[]) deserializando.readObject();

			// Imprimiendo lista de Productos deserializados

			for (Producto p : listaProductosDeserlializado) {
				System.out.println(p);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {

		Producto producto1 = new Producto("ventilador", 45.00);
		Producto producto2 = new Producto("monitor", 125.00);

		Producto[] listaProductos = new Producto[2];

		listaProductos[0] = producto1;
		listaProductos[1] = producto2;

		String path = args[0];
		Main app = new Main();
		app.serializar(path, listaProductos);
		
	}

}
