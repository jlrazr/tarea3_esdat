public class ArbolBinario {

    private Nodo raiz;

    // Método para insertar un nodo
    public boolean insertar(Libro libro) {
        if (raiz == null) {
            raiz = new Nodo(libro);
            return true;
        } else {
            return insertarNodo(raiz, libro);
        }
    }

    private boolean insertarNodo(Nodo nodo, Libro libro) {
        if (libro.getId() < nodo.getLibro().getId()) {
            if (nodo.getIzquierdo() == null) {
                nodo.setIzquierdo(new Nodo(libro));
                return true;
            } else {
                return insertarNodo(nodo.getIzquierdo(), libro);
            }
        } else if (libro.getId() > nodo.getLibro().getId()) {
            if (nodo.getDerecho() == null) {
                nodo.setDerecho(new Nodo(libro));
                return true;
            } else {
                return insertarNodo(nodo.getDerecho(), libro);
            }
        } else {
            // El id ya existe en el árbol
            return false;
        }
    }

    // Método para buscar un nodo por id
    public Libro buscar(int id) {
        return buscarNodo(raiz, id);
    }

    private Libro buscarNodo(Nodo nodo, int id) {
        if (nodo == null) {
            return null;
        } else if (id == nodo.getLibro().getId()) {
            return nodo.getLibro();
        } else if (id < nodo.getLibro().getId()) {
            return buscarNodo(nodo.getIzquierdo(), id);
        } else {
            return buscarNodo(nodo.getDerecho(), id);
        }
    }

    // Métodos de recorrido: preOrden, inOrden, postOrden
    public void preOrden() {
    preOrdenRecursivo(raiz);
}

    private void preOrdenRecursivo(Nodo nodo) {
        if (nodo != null) {
            System.out.println(nodo.getLibro().toString());
            preOrdenRecursivo(nodo.getIzquierdo());
            preOrdenRecursivo(nodo.getDerecho());
        }
    }
    
    // Recorrido Inorden: Izquierdo - Raíz - Derecho
    public void inOrden() {
        inOrdenRecursivo(raiz);
    }

    private void inOrdenRecursivo(Nodo nodo) {
        if (nodo != null) {
            inOrdenRecursivo(nodo.getIzquierdo());
            System.out.println(nodo.getLibro().toString());
            inOrdenRecursivo(nodo.getDerecho());
        }
    }
    
    // Recorrido Postorden: Izquierdo - Derecho - Raíz
    public void postOrden() {
        postOrdenRecursivo(raiz);
    }

    private void postOrdenRecursivo(Nodo nodo) {
        if (nodo != null) {
            postOrdenRecursivo(nodo.getIzquierdo());
            postOrdenRecursivo(nodo.getDerecho());
            System.out.println(nodo.getLibro().toString());
        }
    }


    // Método para eliminar un nodo
    // Método para eliminar un nodo
public boolean eliminar(int id) {
    Nodo nodoPadre = null;
    Nodo nodoActual = raiz;
    while (nodoActual != null) {
        if (id == nodoActual.getLibro().getId()) {
            if (nodoActual.getIzquierdo() == null && nodoActual.getDerecho() == null) {
                // Caso 1: el nodo a eliminar es una hoja
                if (nodoPadre.getIzquierdo() == nodoActual) {
                    nodoPadre.setIzquierdo(null);
                } else {
                    nodoPadre.setDerecho(null);
                }
            } else if (nodoActual.getIzquierdo() == null || nodoActual.getDerecho() == null) {
                // Caso 2: el nodo a eliminar tiene un solo hijo
                Nodo hijo = (nodoActual.getIzquierdo() != null) ? nodoActual.getIzquierdo() : nodoActual.getDerecho();
                if (nodoPadre.getIzquierdo() == nodoActual) {
                    nodoPadre.setIzquierdo(hijo);
                } else {
                    nodoPadre.setDerecho(hijo);
                }
            } else {
                // Caso 3: el nodo a eliminar tiene dos hijos
                Nodo sucesor = encontrarSucesor(nodoActual);
                Libro libroSucesor = sucesor.getLibro();
                eliminar(libroSucesor.getId());  // Elimina el sucesor
                nodoActual.setLibro(libroSucesor);  // Sustituye el libro del nodo a eliminar con el del sucesor
            }
            return true;
        } else if (id < nodoActual.getLibro().getId()) {
            nodoPadre = nodoActual;
            nodoActual = nodoActual.getIzquierdo();
        } else {
            nodoPadre = nodoActual;
            nodoActual = nodoActual.getDerecho();
        }
    }
    return false;  // El nodo con el id dado no se encontró
}

    private Nodo encontrarSucesor(Nodo nodo) {
        Nodo sucesor = nodo.getDerecho();
        while (sucesor.getIzquierdo() != null) {
            sucesor = sucesor.getIzquierdo();
        }
        return sucesor;
    }
}