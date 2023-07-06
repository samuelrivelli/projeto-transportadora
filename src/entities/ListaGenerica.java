package entities;


import java.util.ArrayList;

import java.util.Iterator;

import java.util.List;


public class ListaGenerica<E> extends ArrayList<E> implements Iterable<E> {

    private List<E> lista = new ArrayList<E>();


    public void addElemento(E elemento) {
    	if(lista == null) {
    		lista = new ArrayList<E>();
    	}
        lista.add(elemento);

    }


    public void removeElemento(E elemento) {

        lista.remove(elemento);

    }


    public int quantidadeElementos() {

        return lista.size();

    }


    public boolean verificaExistencia(E elemento) {

        if(lista.contains(elemento)) {
        	return true;
        }
        return false;

    }


    @Override

    public Iterator<E> iterator() {

        return lista.iterator();

    }

}