public class Digitos{
		private int valor;
}

class Digitos2{
		private int valor;
		//constructor
		public Digitos2(){
				this.valor=5;
		}
		//constructor
		public Digitos2(int d){
				this.valor=d;
		}
	
		//getter
		public int getValor(){
			return this.valor;
		}
		
		//setter
		public void setValor(int d){
			this.valor=d;
		}
}
class Prueba{
	public static void main(String[]ar){
		/* Crear un objeto de la clase
		 * Digito, sin que tenga un constructor
		 * y ademas sin referencia*/
		 new Digitos();
		 //creo ahora un objeto Digitos con referencia
		 Digitos d = new Digitos();
		 //intento acceder a la variable valor
		 // System.out.println(d.valor); no puedo acceder desde esta clase porque es privada
		 Digitos2 d2 = new Digitos2();
		 System.out.println(d2.getValor()); //hago una llamada al getter que hay en la clase Digitos2
		 //d2.Digitos2(8); no funciona 
		 Digitos2 d22 = new Digitos2(8);
		 System.out.println(d22.getValor()); //llamada al geter usando un objeto que contiene otro valor
		 //utilizo el setter para modificar un valor
		 d22.setValor(99);
		 System.out.println(d22.getValor()); //compruebo que el setter ha modificado el contenido de .valor
	
	}


}
