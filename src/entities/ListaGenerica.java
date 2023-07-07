package entities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaGenerica<E> extends ArrayList<E> {

    public void addElemento(E elemento) {
        add(elemento);
    }

    public void removeElemento(E elemento) {
        remove(elemento);
    }

    public int quantidadeElementos() {
        return size();
    }

    public boolean verificaExistencia(E elemento) {
        return contains(elemento);
    }

    @Override
    public Iterator<E> iterator() {
        return super.iterator();
    }
}
