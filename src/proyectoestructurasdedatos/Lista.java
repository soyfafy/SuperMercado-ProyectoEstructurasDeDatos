
package proyectoestructurasdedatos;

public class Lista {
        private NodoLista cabeza;
    
    public void inserta(Persona p){
        if(cabeza == null){
            //lista vacía
            cabeza = new NodoLista(p);
        }else if(p.getId() < cabeza.getDato().getId()){
            NodoLista aux = new NodoLista(p);
            aux.setSiguiente(cabeza);
            cabeza = aux;
        }else if(cabeza.getSiguiente() == null){
            cabeza.setSiguiente(new NodoLista(p));
        }else{
            NodoLista aux = cabeza;
            while(aux.getSiguiente() != null &&
                    aux.getSiguiente().getDato().getId() < p.getId()){
                aux = aux.getSiguiente();
            }
            NodoLista temp = new NodoLista(p);
            temp.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(temp);
        }
    }

    public boolean existe(int id){
        boolean esta = false;
        if(cabeza != null){
            NodoLista aux = cabeza;
            while(aux != null && aux.getDato().getId() < id){
                aux = aux.getSiguiente();
            }
            esta = (aux != null && aux.getDato().getId() == id);
        }
        return esta;
    }
    
    public void modifica(Persona p){
        if(cabeza != null){
            NodoLista aux = cabeza;
            while(aux != null && aux.getDato().getId() < p.getId()){
                aux = aux.getSiguiente();
            }
            if (aux != null && aux.getDato().getId() == p.getId()){
                aux.getDato().setNombre(p.getNombre());
            }
        }
    }
    
    public void elimina(int id){
        if(cabeza != null){
            if(cabeza.getDato().getId() == id){
                cabeza = cabeza.getSiguiente();
            }else{
                NodoLista aux = cabeza;
                while(aux.getSiguiente() != null && 
                        aux.getSiguiente().getDato().getId() < id){
                    aux = aux.getSiguiente();
                }
                if(aux.getSiguiente() != null && aux.getSiguiente().getDato().getId() == id){
                    aux.setSiguiente(aux.getSiguiente().getSiguiente());
                }
            }
        }
    }
    
    public Persona extrae(int id){
        Persona p = null;
        if(cabeza != null){
            if(cabeza.getDato().getId() == id){
                p = cabeza.getDato();
                cabeza = cabeza.getSiguiente();
            }else{
                NodoLista aux = cabeza;
                while(aux.getSiguiente() != null && 
                        aux.getSiguiente().getDato().getId() < id){
                    aux = aux.getSiguiente();
                }
                if(aux.getSiguiente() != null && aux.getSiguiente().getDato().getId() == id){
                    p = aux.getSiguiente().getDato();
                    aux.setSiguiente(aux.getSiguiente().getSiguiente());
                }
            }
        }
        return p;
    }
    
    @Override
    public String toString() {
        NodoLista aux = cabeza;
        String s = "Lista de clientes: \n";
        while(aux != null){
            s+= aux + "\n";
            aux = aux.getSiguiente();
        }
        return s;
    }
    
    
    
}
