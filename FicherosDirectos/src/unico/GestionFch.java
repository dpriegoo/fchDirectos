package unico;

import java.io.*;
import model.persona;

public class GestionFch {

	private RandomAccessFile fch;
	private int longReg = 5;

	public GestionFch(String fileName) {

		abrirFichero(fileName);
	}

	private void abrirFichero(String fileName) {

		try {
			fch = new RandomAccessFile(fileName, "rw");
		} catch (FileNotFoundException e) {
			System.err.println("El fichero " + fileName + " no existe");
		}

	}

	public void cerrarFichero() {
		try {
			fch.close();
		} catch (IOException e) {
			System.err.println("El fichero no puede cerrarse");
		}
	}

	public void escribirRegistro(int numReg, persona persona) {
		try {
			// fch.seek(getPosition(numReg));
			long posicion = getPosition(numReg);
			fch.seek(posicion);

			// nombre
			String nombre = persona.getsNombre();
			char cLetra;

			for (int i = 0; i < 5; i++) {

				cLetra = (i < nombre.length()) ? nombre.charAt(i) : ' ';

				fch.writeChar(cLetra);

				/*
				 * if (i<nombre.length()) { fch.writeChar(cLetra); } else { fch.writeChar(' ');
				 * }
				 */

			}

			// edad
			fch.writeInt(persona.getiEdad());

			// altura
			fch.writeDouble(persona.getdAltura());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private long getPosition(int numReg) {

		return (numReg - 1) * longReg;
	}

	public persona leerRegistro(int numReg) {
		String nombre = "";
		int edad = 0;
		double altura = 0.0;

		try {
			long poscion = getPosition(numReg);
			fch.seek(poscion);

			// nombre
			for (int i = 0; i < 5; i++) {
				nombre += fch.readChar();
			}

			// edad
			edad = fch.readInt();

			// altura
			altura = fch.readDouble();

		} catch (IOException e) {
			System.err.println("El fichero no es accesible");
		}
		return new persona(nombre, edad, altura);
	}

}
