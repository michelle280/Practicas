package hibernate.beans;

import java.util.Date;

public class Autor {
	private int idAutor;
	private String Nombre;
	private String Apellidopaterno;
	private String Apellidomaterno;
	private Date Fechanacimiento;
	private String Pais;
	
	public int getIdAutor() {
		return idAutor;
	}
	public void setIdAutor(int idAutor) {
		this.idAutor = idAutor;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellidopaterno() {
		return Apellidopaterno;
	}
	public void setApellidopaterno(String apellidopaterno) {
		Apellidopaterno = apellidopaterno;
	}
	public String getApellidomaterno() {
		return Apellidomaterno;
	}
	public void setApellidomaterno(String apellidomaterno) {
		Apellidomaterno = apellidomaterno;
	}
	public Date getFechanacimiento() {
		return Fechanacimiento;
	}
	public void setFechanacimiento(Date fechanacimiento) {
		Fechanacimiento = fechanacimiento;
	}
	public String getPais() {
		return Pais;
	}
	public void setPais(String pais) {
		Pais = pais;
	}
	
	

}
