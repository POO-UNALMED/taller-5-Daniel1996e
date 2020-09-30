package zooAnimales;

import java.util.ArrayList;
import java.util.List;
import gestion.Zoologico;
import gestion.Zona;

public class Pez extends Animal{
	private static List<Pez> listado= new ArrayList<Pez> ();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(){
		super();
		listado.add(this);
		increaseTotal();
	}
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas){
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
		increaseTotal();
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	
	public String movimiento() {
		return "nadar";
	}
	
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		Pez r = new Pez(nombre, edad, "oceano" , genero, "rojo", 6);
		salmones ++;
		return r;
	}
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		Pez r = new Pez(nombre, edad, "oceano" , genero, "gris", 6);
		bacalaos ++;
		return r;
	}
	
	public static int cantidadPeces() {
		return salmones + bacalaos + getTotalAnimales();
	}
	
	
}
