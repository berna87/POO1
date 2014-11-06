public class Personas{
		//atributos
		private String nombre;
		private int edad;
		//constructor
		public Personas(String n,int e){
				this.nombre=n;
				this.edad=e;
		}
		//getters
		public String getNombre(){
				return this.nombre;
		}
		public int getEdad(){
				return this.edad;
		}
		//setters
		public void setNombre(String n){
			this.nombre=n;
		}
		public void setEdad(int e){
			this.edad=e;
		}
}
class TestPersonas {
	public static void main(String[]ar){
		//sin referencia
		// new Personas();			no compila
		//sin referencia con dos argumentos
		new Personas("Juan",23);  //compila pero no abria forma de llamarlo
		// new Personas(23,"Juan");  no compila, es necesario respetar el orden de los elementos del constructor
		
		Personas p1=new Personas("Juan",23); //creo el objeto Personas con estas caracteristicas, referenciado con p1
		//Personas p1=new Personas("Pepe",25); no compila porque no puedo crear un objeto con la misma referencia que otro que he creado
		Personas p2=new Personas("Pepe",25);
		System.out.println(p1+" "+p1.getNombre() +" "+ p1.getEdad());
		System.out.println(p2+" "+p2.getNombre() +" "+ p2.getEdad());
		p1=p2;	//p1 apuntaria al mismo objeto que p2
		System.out.println(p1+" "+p1.getNombre() +" "+ p1.getEdad());
		System.out.println(p2+" "+p2.getNombre() +" "+ p2.getEdad());
		p1.setNombre("Paco");
		p1.setEdad(30);		//al cambiar el contenido del objeto al que apunta p1, cambiaria tambien p2 porque es el mismo objeto
		System.out.println(p1+" "+p1.getNombre() +" "+ p1.getEdad());
		System.out.println(p2+" "+p2.getNombre() +" "+ p2.getEdad());
	}
}
