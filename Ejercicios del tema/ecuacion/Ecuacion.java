public class Ecuacion {
		private double valorA;	//creo variables a b c para relacionarlas con las propiedades del objeto
		private double valorB;
		private double valorC;
		public Ecuacion(double a,double b,double c){		//llamo al constructor y lo utilizo para asignar los valores del objeto a las variables de esta clase
			this.valorA=a;   
			this.valorB=b;
			this.valorC=c;
		}
		public double getValorA(){
			return this.valorA;
		}
		public double getValorB(){
			return this.valorB;
		}
		public double getValorC(){
			return this.valorC;
		}
		
		public double x1(){		//metodo que calcula un valor de x
			return (-this.valorB + Math.sqrt(this.valorB*this.valorB-(4*this.valorA*this.valorC)))/(2*this.valorA);
		}
		public double x2(){		//metodo que calcula otro valor de x
			return (-this.valorB - Math.sqrt(this.valorB*this.valorB-(4*this.valorA*this.valorC)))/(2*this.valorA);
		}
}

class TestEcuacionSegundoGrado{ //programa para calcular una ecuacion de segundo grado introduciendo los valores de a, b y c
	public static void main(String[]ar){
		Ecuacion ec=new Ecuacion(1,-6,5);  //creo un nuevo objeto con 3 propiedades
		System.out.println("En la ecuacion: \u0028"+ec.getValorA()+"\u0029*x\u00B2 + \u0028"+ec.getValorB()+"\u0029*x + \u0028"+ec.getValorC()+"\u0029 = 0 \n x1= "+ec.x1()+" \n x2= "+ec.x2());
	}
}
