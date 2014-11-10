public class Libro {
	//atributos
	private String titulo;
	private String isbn;
	private int annoPublicacion;
	private String autor;
	private String editorial;
	private boolean disponibilidad=true;
	//constructor
	public Libro(String ti,String is,int an,String au,String ed){
		this.titulo=ti;
		this.isbn=is;
		this.annoPublicacion=an;
		this.autor=au;
		this.editorial=ed;
	}
	//getters
	public String getTitulo(){
		return this.titulo;
	}
	public String getIsbn(){
		return this.isbn;	
	}
	public int getAnnoPublicacion(){
		return this.annoPublicacion;	
	}
	public String getAutor(){
		return this.autor;
	}
	public String getEditorial(){
		return this.editorial;
	}
	public boolean getDisposibilidad(){
		return this.disponibilidad;
	}
	public String toString(){
		return "\nTitulo= "+this.titulo+"\nIsbn= "+this.isbn+"\nAño de la publicacion= "+this.annoPublicacion+
	"\nAutor= "+this.autor+"\nEditorial= "+this.editorial+"\ndisponibilidad= "+this.disponibilidad;
	}
	//setters de todo por si hay que modificar algun valor.
	public void setTitulo(String ti){
		this.titulo=ti;
	}
	public void setIsbn(String is){
		this.isbn=is;
	}
	public void setAnnoPublicacion(int an){
		this.annoPublicacion=an;
	}
	public void setAutor(String au){
		this.autor=au;
	}
	public void setEditorial(String ed){
		this.editorial=ed;
	}
	public void setDisponibilidad(boolean dis){
		this.disponibilidad=dis;
	}
	
}

class TestLibro{
	public static void main(String[]ar){
	Libro l1= new Libro("El quijote","1-23-111111-3",0,"Cervantes","");	
	Libro l2= new Libro("El lazarillo","2-23-111111-3",0,"Anonimo","");	
	Libro l3= new Libro("La celestina","3-33-111111-3",0,"F de Rojas","");	
	l1.setDisponibilidad(false);
	//usando getters
	System.out.println("\nTitulo= "+l1.getTitulo()+"\nisbn= "+l1.getIsbn()+"\nAño de la publicacion= "+l1.getAnnoPublicacion()+
	"\nAutor= "+l1.getAutor()+"\nEditorial= "+l1.getEditorial()+"\ndisponibilidad= "+l1.getDisposibilidad());
	//usando toString
	System.out.println(l2);
	System.out.println(l3);
	
	}
}
