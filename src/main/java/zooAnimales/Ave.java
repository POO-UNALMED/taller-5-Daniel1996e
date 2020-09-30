package zooAnimales;
import java.util.ArrayList;
import java.util.List;
import gestion.Zoologico;
import gestion.Zona;

public class Ave extends Animal{
	private static List<Ave> listado = new ArrayList<Ave> ();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	static {
		halcones = 0;
		aguilas = 0;
	}
	
	public Ave(){
		super();
		listado.add(this);
		increaseTotal();
	}
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas){
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}
	
	public String getColorPlumas() {
		return colorPlumas;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	
	public String movimiento() {
		return "volar";
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave r = new Ave(nombre,  edad, "montanas" , genero, "cafe glorioso");
		halcones ++;
		increaseTotal();
		return r;
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		Ave r = new Ave(nombre,  edad, "montanas" , genero, "blanco y amarillo");
		aguilas ++;
		increaseTotal();
		return r;
	}
	
	public static int cantidadAves() {
		return halcones + aguilas + getTotalAnimales();
	}
}
