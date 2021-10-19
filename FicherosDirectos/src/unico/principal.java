package unico;

import model.persona;

public class principal {

	public static void main(String[] args) {
		
		
		GestionFch gest = new GestionFch("datos.db");
		
		gest.escribirRegistro(1, new persona("Pepe", 45,1.68));
		gest.escribirRegistro(1, new persona("Juan", 13,1.52));
		
		persona p2 = gest.leerRegistro(2);
		System.out.println(p2+" prin");
		
		gest.cerrarFichero();
		
	}

}
