
package proyectoestructurasdedatos;

public class NodoLista {
    private Persona dato;
    private NodoLista siguiente;

    public NodoLista(Persona dato) {
        this.dato = dato;
    }

    public Persona getDato() {
        return dato;
    }

    public void setDato(Persona dato) {
        this.dato = dato;
    }

    public NodoLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "dato=" + dato;
    }
    
    
}

    

