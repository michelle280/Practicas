package hibernate.beans;

public class Libros {
	private int Isbn;
	private String Nombrelibro;
	private int nejemplares;
	private int edicion;
	private int npaginas;
	public int getIsbn() {
		return Isbn;
	}
	public void setIsbn(int isbn) {
		Isbn = isbn;
	}
	public String getNombrelibro() {
		return Nombrelibro;
	}
	public void setNombrelibro(String nombrelibro) {
		Nombrelibro = nombrelibro;
	}
	public int getNejemplares() {
		return nejemplares;
	}
	public void setNejemplares(int nejemplares) {
		this.nejemplares = nejemplares;
	}
	public int getEdicion() {
		return edicion;
	}
	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}
	public int getNpaginas() {
		return npaginas;
	}
	public void setNpaginas(int npaginas) {
		this.npaginas = npaginas;
	}
	
	

}
