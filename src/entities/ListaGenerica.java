package entities;

import java.util.ArrayList;
import java.util.List;


public class ListaGenerica<E> {
	private List<E> lista = new ArrayList();

	public void addElemento(E elemento) {
		lista.add(elemento);
	}
	
	public void removeElemento(E elemento) {
		lista.remove(elemento);
	}
	
	public int quantidadeElementos() {
		return lista.size();
	}

	
	public boolean verificaExistencia() {
		return !lista.isEmpty();
	}

	
}
