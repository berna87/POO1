public class Numeros{
		//atributo valor
		private int valor;
		
		//getter
		public int getValor(){
				return this.valor;
		}
		
		//setter
		public void setValor(int v){
				System.out.println("Metodo usando setValor(int v)");
				this.valor=v;
		}
		
		public void setValor(double v){
				System.out.println("Metodo usando setValor(double v)");
				this.valor=(int)v;
				return;
			
		}
			
		
}
