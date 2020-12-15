package ec.ups.edu.ec.g1.modelo;

import java.io.Serializable;
import java.util.List;


public class Persona implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

private String cedula;
private String nombre;
private String apellido;
private String telefono;
private String email;


public String getCedula() {
	return cedula;
}
public void setCedula(String cedula) {
	this.cedula = cedula;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "Persona [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono
			+ ", email=" + email + "]";
}





}
