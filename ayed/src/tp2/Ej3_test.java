package tp2;

public class Ej3_test {
	public static void main(String[] args){
		Ej3_Estudiante[] estudiantes = new Ej3_Estudiante[5];
//		Ej3_Profesor[] profesores = new Ej3_Profesor[4];
		
		for (int i=0;i<estudiantes.length;++i){
			estudiantes[i] = new Ej3_Estudiante();
		}
		estudiantes[0].setNombre("cholo");
		estudiantes[0].setApellido("Lopez");
		estudiantes[0].setComision("a1");
		estudiantes[0].setEmail(estudiantes[0].getNombre() + "@gmail.com");
		estudiantes[0].setDireccion("calle la chota 3123");
		estudiantes[1].setNombre("cholinio");
		estudiantes[1].setApellido("Lopez");
		estudiantes[1].setComision("a2");
		estudiantes[1].setEmail(estudiantes[1].getNombre() + "@gmail.com");
		estudiantes[1].setDireccion("calle la chota 3123");
		estudiantes[2].setNombre("cholazo");
		estudiantes[2].setApellido("Lopez");
		estudiantes[2].setComision("a3");
		estudiantes[2].setEmail(estudiantes[2].getNombre() + "@gmail.com");
		estudiantes[2].setDireccion("calle la chota 3123");
		estudiantes[3].setNombre("cholueiro");
		estudiantes[3].setApellido("Lopez");
		estudiantes[3].setComision("a4");
		estudiantes[3].setEmail(estudiantes[3].getNombre() + "@gmail.com");
		estudiantes[3].setDireccion("calle la chota 3123");
		estudiantes[4].setNombre("cholis");
		estudiantes[4].setApellido("Lopez");
		estudiantes[4].setComision("a5");
		estudiantes[4].setEmail(estudiantes[4].getNombre() + "@gmail.com");
		estudiantes[4].setDireccion("calle la chota 3123");
		
//	@TODO: inicializar profesores
		
		for(int i=0; i<estudiantes.length;++i){
			estudiantes[i].tusDatos();
		}
	}
}
