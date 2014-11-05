public class Circulo{
	private int radio=5;		//atributos
					
	public int getRadio(){		//metodos
		return this.radio;
	}
	public void setRadio(int r){	//metodo 
		this.radio=r;
	}
}

class TestCirculo{
	public static void main(String[]ar){
		Circulo c1=new Circulo(); 	//creo objeto llamado Circulo
		System.out.println("El radio del circulo es "+c1.getRadio());
		Circulo c2=new Circulo();        //otro objeto llamado Circulo
		c2.setRadio(15);		/*apoyandome en el metodo setRad						io asigno 15 al valor del radio
						al utilizar el Circulo c2 */
                System.out.println("El radio del circulo es "+c2.getRadio());


	}
}
