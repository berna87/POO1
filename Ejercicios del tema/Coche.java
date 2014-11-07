class Coche{
	private double combustible;
	private double consumo;
	
	public void setCombustible(double comb){
			this.combustible=combustible+comb;
	}
	public void setConsumo(double cons){
			this.consumo=cons;
	}
	public double getCombustible(){
			return this.combustible;
	}
	public double getConsumo(){
			return this.consumo;
	}
	public double kmrestantes(){
			return Math.round((this.combustible*100)/this.consumo);
	}
}

class TestCoche {
	public static void main(String[]ar){
		Coche c1=new Coche();
		Coche c2=new Coche();
		c1.setConsumo(4.2); c2.setConsumo(5.6);
		c1.setCombustible(5); c2.setCombustible(5);
		System.out.println("El coche 1, que tiene un consumo de: "+c1.getConsumo()+ "l/100km, puede recorrer : "+c1.kmrestantes()+" kilometros con 5l de gasolina");
		System.out.println("El coche 2, que tiene un consumo de: "+c2.getConsumo()+ "l/100km, puede recorrer : "+c2.kmrestantes()+" kilometros con 5l de gasolina");
	
	
			
	}
}
