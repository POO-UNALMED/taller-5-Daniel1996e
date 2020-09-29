package zooAnimales;

import java.util.ArrayList;
import java.util.List;
import gestion.Zoologico;
import gestion.Zona;

public class Animal {
	private static int totalAnimales;		
	private String nombre;
	private int edad;
	private	String habitat;
	private	String genero;
	private gestion.Zona zona;
	
	static {
		totalAnimales = 0;
	}
	
	public Animal (){
		this.nombre = "";
		this.edad = 0;
		this.habitat = "";
		this.genero = "";
		this.zona = null;
		
	}
	
	public Animal (String nombre, int edad, String habitat, String genero){
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		
	}
	
	public static int getTotalAnimales() {
		return totalAnimales;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public gestion.Zona getZona() {
		return zona;
	}
	public void setZona(gestion.Zona zona) {
		this.zona = zona;
	}
	
	public String movimiento() {
		return "desplazarse";
	}
	public static void increaseTotal() {
		totalAnimales ++;
	}
	public static String totalPorTipo() {
		return "Mamiferos: " + Mamifero.cantidadMamiferos() +
				"\nAves: " + Ave.cantidadAves() + 
				"\nReptiles: " + Reptil.cantidadReptiles() + 
				"\nPeces: " + Pez.cantidadPeces() + 
				"\nAnfibios: " + Anfibio.cantidadAnfibios();
		
	}
	public String toString() {
		if (this.zona != null) {
			return "Mi nombre es " + this.nombre + ", tengo una edad de " 
			+ this.edad + ", tengo una edad de " + this.edad + ", habito en"
			+ this.habitat + "y mi genero es " + this.genero + ", la zona en la que me ubico es "
			+ this.zona + ", en el " + this.zona.getZoo();
		}
		else {
			return "Mi nombre es " + this.nombre + ", tengo una edad de " 
					+ this.edad + ", tengo una edad de " + this.edad + ", habito en"
					+ this.habitat + "y mi genero es " + this.genero;
		}
		
	}

}
