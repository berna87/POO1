public class Letras{
	//atributo
	private int letra;
	//constructor
	public Letras(){
		this.letra=6;
	}
	
	//getter
	public int getLetra(){
		return this.letra;
	}


}

class TestLetras{
	public static void main(String[]ar){

		new Letras(); //llamada al constructor 
		Letras l1=new Letras(); //llamada al constructor asignando una referencia
		int let = l1.getLetra();	//la variable let apunta al mismo objeto que l1 
		System.out.println(""+l1.getLetra());
		System.out.println(""+let);
		let = 10;
		System.out.println(""+l1.getLetra()); 
		System.out.println(""+let); //solo cambia el valor de la variable let, manteniendo el objeto con sus propiedades
	}
}
