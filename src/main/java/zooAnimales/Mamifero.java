package zooAnimales;
import java.util.ArrayList;
import gestion.Zoologico;
import gestion.Zona;
import java.util.List;

public class Mamifero extends Animal{
	private static List<Mamifero> listado = new ArrayList<Mamifero> ();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	static {
		caballos = 0;
		leones = 0;
	}
	
	public Mamifero(){
		super();
		listado.add(this);
		increaseTotal();
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas){
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
		increaseTotal();
	}
	
	public boolean isPelaje() {
		return pelaje;
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		Mamifero r = new Mamifero(nombre, edad, "pradera" , genero, true, 4);
		caballos ++;
		return r;
	}
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero r = new Mamifero(nombre, edad, "selva" , genero, true, 4);
		leones ++;
		return r;
	}
	
	public static int cantidadMamiferos() {
		return getTotalAnimales();
	}
	
}
