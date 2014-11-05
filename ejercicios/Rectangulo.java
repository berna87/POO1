public class Rectangulo{
	private int alto;
	private int ancho;
	
	public int getAlto(){
		return this.alto;
	}
	public int getAncho(){
		return this.ancho;
	}
	public int getArea(){
		return this.ancho*this.alto;
	}
	public void setAlto(int al){
		this.alto=al;
	}
	public void setAncho(int an){
		this.ancho=an;
	}



	public static void main(String[]ar){
	Rectangulo rec= new Rectangulo();
	rec.setAlto(6);
	rec.setAncho(7);
	System.out.println("Rectangulo con: \n alto: " +rec.getAlto()+"\n ancho: "+rec.getAncho()+"\n area: " +rec.getArea() );
	}
}
