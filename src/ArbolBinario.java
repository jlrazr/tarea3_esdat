public class ArbolBinario {

    private Nodo raiz;

    // Método para insertar los nodos de libros
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
    
    // Métodos para mostrar en texto el contenido del árbol
    public String recorridoEnPreOrden() {
        return this.preOrden(this.raiz, "");
    }

    private String preOrden(Nodo nodo, String separador) {
        if (nodo == null) {
            return "";
        }
        return separador + nodo.getLibro().toString() + "\n" +
                preOrden(nodo.getIzquierdo(), separador + "-- |IZQ| ") +
                preOrden(nodo.getDerecho(), separador + "-- |DER| ");
    }
    
   
    public String recorridoEnInorden() {
    return this.inOrden(this.raiz, "");
}

    private String inOrden(Nodo nodo, String separador) {
        if (nodo == null) {
            return "";
        }
        return inOrden(nodo.getIzquierdo(), separador + "-- |IZQ| ") +
               separador + nodo.getLibro().toString() + "\n" +
               inOrden(nodo.getDerecho(), separador + "-- |DER| ");
    }
    
    public String recorridoEnPostOrden() {
        return this.postOrden(this.raiz, "");
    }

    private String postOrden(Nodo nodo, String separador) {
        if (nodo == null) {
            return "";
        }
        return postOrden(nodo.getIzquierdo(), separador + "-- |IZQ| ") +
               postOrden(nodo.getDerecho(), separador + "-- |DER| ") +
               separador + nodo.getLibro().toString() + "\n";
    }

    
    public String mostrarNodosHoja() {
        return this.nodosHoja(this.raiz, "");
    }

    private String nodosHoja(Nodo nodo, String separador) {
        if (nodo == null) {
            return "";
        }
        // Verifica si el nodo actual es un nodo hoja
        if (nodo.getIzquierdo() == null && nodo.getDerecho() == null) {
            return separador + nodo.getLibro().toString() + "\n";
        }
        // Si no es un nodo hoja, continúa la búsqueda en sus hijos
        return nodosHoja(nodo.getIzquierdo(), separador + "-- |IZQ| ") +
               nodosHoja(nodo.getDerecho(), separador + "-- |DER| ");
    }


    
}