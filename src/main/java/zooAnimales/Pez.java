package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Pez extends Animal{
	private static List<Pez> listado= new ArrayList<Pez> ();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(){
		super();
		increaseTotal();
	}
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas){
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
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
	
	public Pez crearSalmon(String nombre, int edad, String genero) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat("oceano");
		this.setGenero(genero);
		this.colorEscamas = "rojo";
		this.cantidadAletas = 6;
		salmones ++;
		increaseTotal();
		listado.add(this);
		return this;
	}
	public Pez crearBacalao(String nombre, int edad, String genero) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat("oceano");
		this.setGenero(genero);
		this.colorEscamas = "gris";
		this.cantidadAletas = 6;
		bacalaos ++;
		increaseTotal();
		listado.add(this);
		return this;
	}
	
	public static int cantidadPeces() {
		return salmones + bacalaos + getTotalAnimales();
	}
	
	
}
