package zooAnimales;
import java.util.ArrayList;
import java.util.List;

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
		increaseTotal();
	}
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas){
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorPlumas = colorPlumas;
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
	
	public Object crearHalcon(String nombre, int edad, String genero) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat("montañas");
		this.setGenero(genero);
		this.colorPlumas = "cafe glorioso";
		halcones ++;
		increaseTotal();
		listado.add(this);
		return this;
	}
	
	public Object crearaAguila(String nombre, int edad, String genero) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat("montañas");
		this.setGenero(genero);
		this.colorPlumas = "blanco y amarillo";
		aguilas ++;
		increaseTotal();
		listado.add(this);
		return this;
	}
	
	public static int cantidadAves() {
		return halcones + aguilas + getTotalAnimales();
	}
}
