package tp2;

public class Ej3_Profesor {
	private String nombre, apellido, edad, email, catedra, titulo, facultad;

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

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCatedra() {
		return catedra;
	}

	public void setCatedra(String catedra) {
		this.catedra = catedra;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFacultad() {
		return facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	
	public void tusDatos(){
		System.out.println("Nombre: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad + "Catedra: " +
	catedra + ", E-mail: "+ email + ", Titulo: " + titulo + ", Facultad: " + facultad);
	}
}
