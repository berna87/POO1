public class Matematicas{
	//variable	
	private double numero;
	//getter
	public double getNumero(){
		return this.numero;
	}
	//setter
	public void setNumero(double n){
		this.numero=n;
	}
	//raiz cuadrada del numero
	public double raizCuadrada(){
		return Math.sqrt(this.numero);
	}
	//raiz cubica del numero en valor absoluto
	public double raizCubica(){
		return Math.abs(Math.cbrt(this.numero));
	}
	//metodo que redondea un numero y si es negativo lo convierte a positivo
	public long redondeo(){
		return Math.abs(Math.round(this.numero));
	}
	//metodo que devuelve aleatoriamente entre 0 y el numero elegido
	public long numeroAleatorio(){
		return Math.round(Math.random()*this.numero);
	}

}
class TestMatematicas{
	public static void main(String[]ar){
		Matematicas n1=new Matematicas();
		
		n1.setNumero(958888);
		System.out.println("Raiz cuadrada de " +n1.getNumero()+" = "+n1.raizCuadrada());
		System.out.println("Raiz cubica de " +n1.getNumero()+" = "+n1.raizCubica());
		System.out.println("Redondeo y valor absoluto de " +n1.getNumero()+" = "+n1.redondeo());
		System.out.println("Numero aleatorio entre 0 y "+n1.getNumero()+" = "+n1.numeroAleatorio());
	}	
}

