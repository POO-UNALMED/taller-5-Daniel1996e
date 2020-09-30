package zooAnimales;

import java.util.ArrayList;
import java.util.List;
import gestion.Zoologico;
import gestion.Zona;

public class Reptil extends Animal{
	private static List<Reptil> listado= new ArrayList<Reptil> ();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil(){
		super();
		listado.add(this);
		increaseTotal();
	}
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola){
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
		increaseTotal();
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
	
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil r = new Reptil(nombre,  edad, "humedal" , genero, "verde" , 3);
		iguanas ++;
		return r;
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil r = new Reptil(nombre,  edad, "jungla" , genero, "blanco" , 1);
		serpientes ++;
		return r;
	}
	
	public static int cantidadReptiles() {
		return listado.size();
	}
}
