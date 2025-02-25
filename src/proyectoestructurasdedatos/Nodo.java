
package proyectoestructurasdedatos;

public class Nodo {
    private int valor;
    private Nodo abajo;
    
    
    public Nodo(int valor) {
        this.valor = valor;
    }
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getAbajo() {
        return abajo;
    }

    public void setAbajo(Nodo abajo) {
        this.abajo = abajo;
    }

    public Nodo(int valor, Nodo abajo) {
        this.valor = valor;
        this.abajo = abajo;
    }

    
    
    
}
