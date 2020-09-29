package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Reptil extends Animal{
	private static List<Reptil> listado= new ArrayList<Reptil> ();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil(){
		super();
		increaseTotal();
	}
	
	public Reptil(String colorEscamas, int largoCola, String nombre, int edad, String habitat, String genero, gestion.Zona zona){
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.setZona(zona);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getLargoCola() {
		return largoCola;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	
	public String movimiento() {
		return "reptar";
	}
	
	public void crearIguana(String nombre, int edad, String habitat, String genero) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat("humedal");
		this.setGenero(genero);
		this.colorEscamas = "verde";
		this.largoCola = 3 ;
		iguanas ++;
		increaseTotal();
		listado.add(this);
	}
	
	public void crearSerpiente(String nombre, int edad, String habitat, String genero) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat("jungla");
		this.setGenero(genero);
		this.colorEscamas = "blanco";
		this.largoCola = 1 ;
		serpientes ++;
		increaseTotal();
		listado.add(this);
	}
	
	public static int cantidadReptiles() {
		return iguanas + serpientes + getTotalAnimales();
	}
}
