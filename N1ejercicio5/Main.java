package tasca5.N1ejercicio5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Main {

	public static void main(String[] args) {
		

		Producto producto1 = new Producto("ventilador", 45.00);
		Producto producto2 = new Producto("monitor", 125.00);
		
		Producto[] listaProductos = new Producto[2];
		
		listaProductos[0] = producto1;
		listaProductos[1] = producto2;
		
		
		try {
			
			//Serializando
			
			ObjectOutputStream serializando = new ObjectOutputStream(new FileOutputStream("C:/Users/rodri/Desktop/producto.ser"));
			serializando.writeObject(listaProductos);
			serializando.close();
			
			System.out.println("El archivo ha sido creado...");
			
			
			//Deserializando
			
			ObjectInputStream deserializando = new ObjectInputStream(new FileInputStream("C:/Users/rodri/Desktop/producto.ser"));
			Producto[] listaProductosDeserlializado =(Producto[]) deserializando.readObject();
			deserializando.close();
			
			
			//Imprimiendo lista de Productos deserializados
			
			for (Producto p : listaProductosDeserlializado) {
				System.out.println(p);		
			}
			
			
		} catch (Exception e) {
			
		}
		
	}

}
