import javax.swing.JOptionPane;
public class Empleado{
	private String nombre;
	private int horasS;  //horas trabajadas por semana
	private double sueldoH; //sueldo bruto por hora trabajada
	private double deduccionH; //deduccion para hacienda
	private double deduccionSS; //deduccion para la Seguridad Social
	
	public Empleado(String nom,int h,double s, double dh, double dss){
		this.nombre=nom;
		this.horasS=h;
		this.sueldoH=s;
		this.deduccionH=dh;
		this.deduccionSS=dss;
	}
	
	
	public double sueldoNetoSemana(){
		return this.horasS*this.sueldoH;
	}
	public double deduccionesTotales(){
		return this.deduccionH+this.deduccionSS;
	}
	
	public double sueldoBrutoMes(){
		return (this.sueldoNetoSemana() * 4) - this.deduccionesTotales();
	}
	public String toString(){
		return "Empleado: "+this.nombre+ "\nSueldo bruto: " +this.sueldoBrutoMes()+"\nSueldo por semana: "+this.sueldoNetoSemana()+"\nDeducciones totales: "+this.deduccionesTotales();
	
	
	}
}

class TestEmpleado {
	public static void main(String[]ar){
		
		String nombre = JOptionPane.showInputDialog("Nombre del empleado");
		String horas = JOptionPane.showInputDialog("Horas semanales trabajadas");
		int h = Integer.parseInt(horas);
		String sueldo = JOptionPane.showInputDialog("Introduce el sueldo por hora");
		double s = Double.parseDouble(sueldo);
		String deduccionh = JOptionPane.showInputDialog("Deduccion para hacienda");
		double dh = Double.parseDouble(deduccionh);
		String deduccionss = JOptionPane.showInputDialog("Deduccion para la seguridad social");
		double dss = Double.parseDouble(deduccionss);
		Empleado e1 = new Empleado(nombre,h,s,dh,dss);
		JOptionPane.showMessageDialog(null,e1);
		
	}	
}
