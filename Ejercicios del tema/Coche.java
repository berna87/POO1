class Coche{
	private double combustible;	 //cantidad de combustible que tiene el coche
	private double consumo;      //litros/100km
	//setter
	public void setCombustible(double comb){
			this.combustible=combustible+comb;
	}
	public void setConsumo(double cons){
			this.consumo=cons;
	}
	//getter
	public double getCombustible(){
			return this.combustible;
	}
	public double getConsumo(){
			return this.consumo;
	}
	public double kmRestantes(){
			return Math.round((this.combustible*100)/this.consumo);
	}
	
	//metodo adicional
	//ajusta el combustible despues de recorrer cierta distancia
	public void combustibleRestante(double km){
		this.combustible = this.combustible - (km * this.consumo) / 100;
		boolean puede = (this.combustible >= 0);
		System.out.println("¿Puede realizar el trayecto de "+km+ "kms?  =>"+puede);
		
	}
}

class TestCoche {
	public static void main(String[]ar){
		Coche c1=new Coche();
		Coche c2=new Coche();
		c1.setConsumo(4.2); c2.setConsumo(5.6);
		c1.setCombustible(5); c2.setCombustible(5);
		System.out.println("El coche 1, que tiene un consumo de: "+c1.getConsumo()+ "l/100km, puede recorrer : "+c1.kmRestantes()+" kilometros con 5l de gasolina");
		System.out.println("El coche 2, que tiene un consumo de: "+c2.getConsumo()+ "l/100km, puede recorrer : "+c2.kmRestantes()+" kilometros con 5l de gasolina");
		c1.combustibleRestante(100);
		c2.combustibleRestante(100);
		System.out.println("El coche 1 Despues de rrecorrer 100 kms le quedan"+c1.getCombustible()+ " litros de combustible");
		System.out.println("El coche 2 Despues de rrecorrer 100 kms le quedan"+c2.getCombustible()+ " litros de combustible");	
	}
}
