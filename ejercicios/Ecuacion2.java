import javax.swing.JOptionPane;
public class Ecuacion2{    //ecuacion segundo grado con get y set
	//variables que necesitare para trabajar internamente
	private double a;
	private double b;
	private double c;
	
	//metodos "get" para coger los datos de estas variables desde fuera de esta clase
	
	public double geta(){
		return this.a;
	}
	public double getb(){
		return this.b;
	}
	public double getc(){
		return this.c;	
	}
	
	//metodos "set" para asignar valores a las variables privadas igualandolos a un valor externo a esta clase
	public void seta(double a){
		this.a=a;	//el valor this.a y a son diferentes porque el "a" hace referencia al dato obtenido a traves del set
	}				//mientras que el this.a le asignara un valor a este, que sera el mismo valor que le hemos dado a set
	public void setb(double b){
		this.b=b;
	}
	public void setc(double c){
		this.c=c;
	}
	
	//metodos para resolver las operaciones de la ecuacion de segundo grado
	
	
	public double x1(){
		return (-this.b + (Math.sqrt(this.b*this.b-(4*this.a*this.c))))/(this.a*2);
	}
	public double x2(){
		return (-this.b - (Math.sqrt(this.b*this.b-(4*this.a*this.c))))/(this.a*2);
	}
	
	  //metodo que he utilizado para comprobar que la clase funciona correctamente
	public static void main(String[]ar){
		Ecuacion2 ec=new Ecuacion2();
		ec.seta(1);
		ec.setb(-4);
		ec.setc(2);
		System.out.println("a="+ec.geta()+"\nb="+ec.getb()+"\nc="+ec.getc()+"\nx1="+ec.x1()+"\nx2="+ec.x2());
	}

}
