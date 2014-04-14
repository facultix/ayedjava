package tp03.ejercicio1;

public class TestListaDeEnteros {

	public static void main(String[] args) {
		ListaDeEnterosConArreglos l = new ListaDeEnterosConArreglos();
		
		l.comenzar();
		System.out.print(l.esVacia());
		for (int i=1; i<=10; ++i){
			l.agregarInicio(i);
		}
		System.out.print(l.tamanio());
		System.out.print(l.incluye(5));
		System.out.print(l.eliminar(1));
		System.out.print(l.tamanio());
		l.agregarEn(23, 10);
		l.agregarEn(90, 5);
	}

}
