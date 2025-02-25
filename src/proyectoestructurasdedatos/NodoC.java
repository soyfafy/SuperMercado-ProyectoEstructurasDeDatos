package proyectoestructurasdedatos;

public class NodoC {
    private String dato;
    private NodoC atras;

    public NodoC(String dato) {
        this.dato = dato;
    }

    
    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoC getAtras() {
        return atras;
    }

    public void setAtras(NodoC atras) {
        this.atras = atras;
    }

    @Override
    public String toString() {
        return dato;
    }
    
    
    
    
}
