package hibernate.beans;

import java.util.Date;

public class Prestamo {
	private int idPrestamo;
	private Date fechaPrestamo;
	private Date fechaDevolucion;
	private int  nprestamo;
	public int getIdPrestamo() {
		return idPrestamo;
	}
	public void setIdPrestamo(int idPrestamo) {
		this.idPrestamo = idPrestamo;
	}
	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}
	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}
	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}
	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
	public int getNprestamo() {
		return nprestamo;
	}
	public void setNprestamo(int nprestamo) {
		this.nprestamo = nprestamo;
	}
	

}
