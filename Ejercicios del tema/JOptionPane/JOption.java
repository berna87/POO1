import javax.swing.JOptionPane; //en primer lugar es necesario importar la libreria de JOptionPane
public class JOption{
	public static void main(String[]ar){
	
	String ejemplo = JOptionPane.showInputDialog("Introduce una palabra");	 //con este comando pedimos una palabra al usuario y la asignamos a una variable
	JOptionPane.showMessageDialog(null,ejemplo); //muestra la variable "ejemplo" a traves de JOptionPane
	}
}
