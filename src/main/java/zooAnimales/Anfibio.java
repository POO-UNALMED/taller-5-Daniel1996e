package zooAnimales;
import java.util.ArrayList;
import java.util.List;

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
		increaseTotal();
	}
	
	public Anfibio(String colorPiel, boolean venenoso, String nombre, int edad, String habitat, String genero){
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
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
	
	public void crearRana(String nombre, int edad, String habitat, String genero) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat("selva");
		this.setGenero(genero);
		this.colorPiel = "rojo";
		this.venenoso = true ;
		ranas ++;
		increaseTotal();
		listado.add(this);
		
	}
	
	public void crearSalamandra(String nombre, int edad, String habitat, String genero) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat("pradera");
		this.setGenero(genero);
		this.colorPiel = "negro y amarillo";
		this.venenoso = false ;
		salamandras ++;
		increaseTotal();
		listado.add(this);
	}
	
	public static int cantidadAnfibios() {
		return ranas + salamandras + getTotalAnimales();
	}
	
}
