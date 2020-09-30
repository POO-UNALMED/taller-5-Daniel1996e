package zooAnimales;
import java.util.ArrayList;
import java.util.List;
import gestion.Zoologico;
import gestion.Zona;

public class Anfibio extends Animal{
	private static List<Anfibio> listado = new ArrayList<Anfibio> ();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	static {
		ranas = 0;
		salamandras = 0;
	}
	
	public Anfibio(){
		super();
		listado.add(this);
		increaseTotal();
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso){
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
		increaseTotal();
	}
	
	public String getColorPiel() {
		return colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	public String movimiento() {
		return "saltar";
	}
	
	public static  Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio r = new Anfibio(nombre,  edad, "selva" , genero, "rojo" , true);
		ranas ++;
		return r;
		
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio r = new Anfibio(nombre,  edad, "pradera" , genero, "negro y amarillo" , false);
		salamandras ++;
		return r;
	}
	
	public static int cantidadAnfibios() {
		return getTotalAnimales();
	}
	
}
