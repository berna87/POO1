public class Palabra{
	//variable
	private String contenido;
	//constructor
	public Palabra(String cont){
		this.contenido=cont;
	}
	//metodo que devuelve la palabra en mayuscula
	public String mayuscula(){
		return this.contenido.toUpperCase();
	}
	//metodo que devuelve la palabra en minuscula
	public String minuscula(){
		return this.contenido.toLowerCase();
	}
	//metodo que devuelve el numero de letras de la palabra
	public int nLetras(){
		return this.contenido.length();
	}
	//metodo que reemplaza las "o" por "u"
	public String reemplazar(){
		return this.contenido.replace('o','u');
	}
	//metodo que devuelve la primera letra de la palabra
	public String primeraLetra(){
		return this.contenido.substring(0,1);
	}
	//metodo que devuelve la ultima letra de la palabra en mayuscula
	public String ultimaLetraMayuscula(){
		return this.contenido.substring(nLetras()-1,nLetras()).toUpperCase();
	}
	//metodo para devolverlo todo de forma rapida
	public String toString(){
		return "\nPalabra en mayuscula: "+mayuscula()+"\nPalabra en minuscula: "+minuscula()+
		"\nNumero de letras de la palabra: "+nLetras()+"\nSustituyendo o por u: " +reemplazar()+
		"\nPrimera letra de la palabra: "+primeraLetra()+"\nUltima de la palabra en mayuscula: "+ultimaLetraMayuscula();
	}
}

class TestPalabra{
	public static void main(String[]ar){
		Palabra p1=new Palabra("Domingo");
		Palabra p2=new Palabra("Torredonjimeno");
		Palabra p3=new Palabra("Manzana");	
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	
	}
	
}
