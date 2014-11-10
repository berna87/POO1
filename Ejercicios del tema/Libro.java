public class Libro {
	private String titulo;
	private String isbn;
	private int annoPublicacion;
	private String autor;
	private String editorial;
	
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
	
	//setters
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
	
}

class TestLibro{
	public static void main(String[]ar){
	Libro l1= new Libro("oslkdf","123-0285-54654-45",2000,"blabla","blaa");	
	System.out.println("Titulo= "+l1.getTitulo()+"\nisbn= "+l1.getIsbn()+"\nAño de la publicacion= "+l1.getAnnoPublicacion()+
	"\nAutor= "+l1.getAutor()+"\nEditorial= "+l1.getEditorial());
	
	}
}
