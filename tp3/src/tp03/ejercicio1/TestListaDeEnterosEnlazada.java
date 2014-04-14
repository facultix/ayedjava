package tp03.ejercicio1;



public class TestListaDeEnterosEnlazada {
	// eliminarEn y agregarEn no funcionan
	public static void main (String[] args){
		ListaDeEnterosEnlazada l = new ListaDeEnterosEnlazada();
		
		// llenamos la lista
		for (int i=1; i<= 10; i++){
			l.agregarFinal(i);
		}
		//imprimimos la lista
		System.out.println(l.toString());
		
		// Prueba de metodos
		
		// AgregarEn
		l.agregarEn(85, 5);
		System.out.println(l.toString());
		
		l.agregarEn(85, 1);
		System.out.println(l.toString());
		
		l.agregarEn(85, 22);
		System.out.println(l.toString());
		
		System.out.println(l.agregarEn(-3, 85));
		System.out.println(l.agregarEn(23, 33));
		
		//agregarInicio
		l.agregarInicio(-1);
		System.out.println(l.toString());
		
		//incluye
		System.out.println(l.incluye(99));
		System.out.println(l.incluye(1));
		
		//eliminar
		
		l.eliminar(-1);
		System.out.println(l.toString());
		l.eliminarEn(3);
		System.out.println(l.toString());
	}
}
