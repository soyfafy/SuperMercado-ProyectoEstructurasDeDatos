
package proyectoestructurasdedatos;

public class Cola {
    private NodoC frente;
    private NodoC ultimo;
    
    public void encola(NodoC elementoNuevo){
       /*logica para agregar al elemento nuevo dentro de la cola 
       el elemento nuevo debe ir de ultimo*/
       if(frente == null){
           frente = elementoNuevo;
           ultimo = elementoNuevo;
       }else{
           ultimo.setAtras(elementoNuevo);
           ultimo = elementoNuevo;
       }
    }
    
    public NodoC atiente(){
        NodoC aux = frente;
        if(colaVacia()){
            System.out.println("No hay productos agregados.");
        }else{
            if(frente!=null){
                frente = frente.getAtras();
                aux.setAtras(null);
            }
        }
        return aux;
    }
    
    public boolean colaVacia(){
        if(frente == null){
            return  true;
        }else{
            return false;
        }
    }
    
}
