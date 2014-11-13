//complemento del ejercicio Palabras.java
public class Blancos {
	private String palabra;
	public Blancos(String p){
		this.palabra=p;
	}
	//metodo que elimina espacios en blanco al principio y al final
	public String blancosPrinFin(){
		return this.palabra.trim();	
	}
	//metodo que elimina todos los espacios en blanco
	public String blancosTodos(){
		return this.palabra.replace(" ","");
	}
	public String getPalabra(){
		return this.palabra;	
	}
	
}

class TestBlancos {
	public static void main(String[]ar){
	Blancos b = new Blancos(" ESto es una cadena  ");
	System.out.println("Palabra: "+b.getPalabra());
	System.out.println("Sin espacios de principio y fin: "+b.blancosPrinFin());
	System.out.println("Eliminamos todos los espacios: "+b.blancosTodos());
	
	}
}
