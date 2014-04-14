package tp03.ejercicio1;

public class ListaDeEnterosEnlazada extends ListaDeEnteros {
	private NodoEntero inicio;
	private NodoEntero actual;
//	private NodoEntero fin;

	private int tamanio;

	@Override
	public void comenzar() {
		actual = inicio;
	}

	@Override
	public Integer proximo() {
		Integer elto = actual.getDato();
		actual = actual.getSiguiente();
		return elto;
	}

	@Override
	public boolean fin() {
		return (actual == null);
	}

	@Override
	public Integer elemento(int pos) {
		if (pos < 1 || pos > this.tamanio())
			return null;
		NodoEntero n = this.inicio;
		while (pos-- > 1)
			n = n.getSiguiente();
		return n.getDato();
	}

	@Override
	public boolean agregarEn(Integer elem, int pos) {
		if (pos < 1 || pos > this.tamanio() + 1)
			return false;
		this.tamanio++;
		NodoEntero aux = new NodoEntero();
		aux.setDato(elem);
		if (pos == 1) {
			aux.setSiguiente(inicio);
			inicio = aux;
		} else {
			NodoEntero n = this.inicio;
			NodoEntero ant = null;
			int posActual = 1;
			while (!(n == null) && (posActual < pos)) {
				ant = n;
				n = n.getSiguiente();
				posActual++;
			}
			aux.setSiguiente(n);
			ant.setSiguiente(aux);
		}
		return true;
	}

	@Override
	public boolean agregarInicio(Integer elem) {
		
		return this.agregarEn(elem, 1);
	}

	@Override
	public boolean eliminarEn(int pos) {
		if (pos < 1 || pos > this.tamanio())
			return false;
		this.tamanio--;
		if (pos == 1) {
			inicio = inicio.getSiguiente();
			return true;
		}
		NodoEntero n = this.inicio;
		NodoEntero ant = null;
		while (!(n == null) && (pos > 1)) {
			pos--;
			ant = n;
			n = n.getSiguiente();
		}
		ant.setSiguiente(n.getSiguiente());
		return true;
	}

	@Override
	public String toString() {
		String str = "";
		NodoEntero n = this.inicio;
		while (n != null) {
			str = str + n.getDato() + " -> ";
			n = n.getSiguiente();
		}
		if (str.length() > 1)
			str = str.substring(0, str.length() - 4);
		return str;
	}

	@Override
	public int tamanio() {
		return this.tamanio;
	}

	@Override
	public boolean esVacia() {
		return (inicio == null);
	}

	@Override
	public boolean agregarFinal(Integer elem) {
		NodoEntero n = new NodoEntero();
		n.setDato(elem);
		this.comenzar();
		if (this.esVacia()){
			this.inicio = n;
		}else{
			while (this.actual.getSiguiente() != null){
				this.proximo();
				}
			
			actual.setSiguiente(n);
			}	
		this.tamanio++;
		return true;
	}

	@Override
	public boolean eliminar(Integer elem) {
		if (this.incluye(elem)){
			this.comenzar();
			NodoEntero ant = this.inicio;
			if (elem == this.proximo())
				this.inicio = ant.getSiguiente();
			else{
				
				while(this.actual != null && this.proximo() != elem ){
					ant = ant.getSiguiente();
				}
				ant.setSiguiente(this.actual);
				this.tamanio--;
			}
			return true;
		}else{
			return false;
		}
	}

	@Override
	public boolean incluye(Integer elem) {
		boolean encontro = false;
		this.comenzar();
		while(!this.fin() && !encontro){
			if(this.proximo() == elem) encontro=true;
		}
		return encontro;
	}
}
