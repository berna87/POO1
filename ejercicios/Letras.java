public class Letras{
	//atributo
	private char letra = 'b';
	//constructor privado
	private Letras(){
		this.letra='a';
	}
			
	//constructor publico al que debemos llamar usando un String como parametro del objeto
	public Letras(String s){
		new Letras();  //lamada al constructor privado
	}
	
	//getter
	public char getLetra(){
		return this.letra;
	}


}

class TestLetras{
	public static void main(String[]ar){


		Letras l1=new Letras(""); //llamada al constructor publico
		char let = l1.getLetra();	//la variable let apunta al mismo objeto que l1 
		System.out.println(l1.getLetra());
		System.out.println(let);
		//aunque creamos un objeto con un char 'a' al invocar el constructor con un string, no podemos acceder a el porque se crea sin referencia por lo que obtenemos el char 'b' que es el que contiene el getter por defecto.
	}
}
