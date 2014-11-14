import javax.swing.JOptionPane;
public class TrianguloRectangulo{
	private double cateto1;
	private double cateto2;
	
	public void setCateto1(double cat1){
		this.cateto1=cat1;
	}
	public void setCateto2(double cat2){
		this.cateto2=cat2;
	}

	public double getCateto1(){
		return this.cateto1;
	}
	public double getCateto2(){
		return this.cateto2;
	}
	public double hipotenusa(){
		return Math.sqrt(this.cateto1*this.cateto1+this.cateto2*this.cateto2);
	}
	public double area(){
		return (this.cateto1*this.cateto2)/2;
	}
	public double perimetro(){
		return this.cateto1+this.cateto2+this.hipotenusa();
	}
	public String toString(){
		return "El triangulo cuyos catetos son : " + this.cateto1 + "cm y " +this.cateto2 + "cm\n tiene una hipotenusa de: " +this.hipotenusa()+"cm\n tiene un area de: "+this.area()+"cm\u00B2\n tiene un perimetro de: "+this.perimetro()+"cm";
	}
}

class TestTrianguloRectangulo{
	public static void main(String[]ar){
		TrianguloRectangulo t1 = new TrianguloRectangulo();
		String var1 = JOptionPane.showInputDialog("Introduce el Cateto 1");
		double c1 = Double.parseDouble(var1);
		String var2 = JOptionPane.showInputDialog("Introduce el Cateto 2");
		double c2 = Double.parseDouble(var2);
		t1.setCateto1(c1);
		t1.setCateto2(c2);
		JOptionPane.showMessageDialog(null,t1);
	}	
}
