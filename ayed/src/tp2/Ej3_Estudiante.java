package tp2;

public class Ej3_Estudiante {
	private String nombre, apellido, comision, email, direccion;

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

	public String getComision() {
		return comision;
	}

	public void setComision(String comision) {
		this.comision = comision;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public void tusDatos(){
		System.out.println("Nombre: " + nombre + ", Apellido: " + apellido + "Comision: " +
	comision + ", E-mail: "+ email + ", Direccion: " + direccion);
	}
}
