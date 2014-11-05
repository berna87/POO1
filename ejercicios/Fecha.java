public class Fecha {
		//atributos de fecha
		private int dia;
		private int mes;
		private int anno;
		
		//getters y setters
		//getters
		public int getDia(){
			return this.dia;
		}
		public int getMes(){
			return this.mes;
		}
		public int getAnno(){
			return this.anno;
		}
		//setters
		public void setDia(int d){
				this.dia=d;
		}
		public void setMes(int m){
				this.mes=m;
		}
		public void setAnno(int a){
				this.anno=a;
		}
		//utilizar el metodo toString
		public String toString(){
			return this.dia +"/"+this.mes+"/"+this.anno;
		}
	
		public static void main (String[]ar){
				Fecha f1=new Fecha();
				f1.setDia(5);
				f1.setMes(11);
				f1.setAnno(2014);
				System.out.println("Fecha:  dia="+f1.getDia()+"  mes="+f1.getMes()+"  año="+f1.getAnno());
				System.out.println("Fecha:"+f1); //llamada 
		}


}
