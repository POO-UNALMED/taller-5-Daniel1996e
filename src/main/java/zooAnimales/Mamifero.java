package zooAnimales;
import java.util.ArrayList;
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
	
	public Mamifero crearCaballo(String nombre, int edad, String genero) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat("pradera");
		this.setGenero(genero);
		this.pelaje = true;
		this.patas = 4 ;
		caballos ++;
		increaseTotal();
		listado.add(this);
		return this;
	}
	public Mamifero crearLeon(String nombre, int edad, String genero) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat("selva");
		this.setGenero(genero);
		this.pelaje = true;
		this.patas = 4 ;
		leones ++;
		increaseTotal();
		listado.add(this);
		return this;
	}
	
	public static int cantidadMamiferos() {
		return caballos + leones + getTotalAnimales();
	}
	
}
