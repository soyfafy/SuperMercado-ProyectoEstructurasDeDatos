
package proyectoestructurasdedatos;

import javax.swing.JOptionPane;

public class Pila {
    private String Lista = "";
    private Nodo top;

    //metodo para agregar
    public void push(Nodo elementoNuevo){
        elementoNuevo.setAbajo(top);
        top = elementoNuevo;
    }
    
    //metodo para eliminar
    public Nodo pop(){
        Nodo aux = top;
        if(PilaVacia()){
            System.out.println("No hay productos comprados.");
        }else{
            top = top.getAbajo();
            aux.setAbajo(null);
        }
        return aux;
    }
    
    //metodo para validar si la pila está vacía
    public boolean PilaVacia(){
        if(top == null){
            return true;
        }else{
            return false;
        }
    }
    
        //Método para mostrar el contenido de la pila
    public void MostrarValores(){
        Nodo recorrido = top;
        
        while(recorrido != null){
             if(recorrido.getValor() == 1){
                                    System.out.println("Producto comprado: Arroz");
                                }   
                                
                                if(recorrido.getValor() == 2){
                                    System.out.println("Producto comprado: Frijoles");
                                }  
                                
                                if(recorrido.getValor() == 3){
                                    System.out.println("Producto comprado: Atun");
                                }  
                                
                                if(recorrido.getValor() == 4){
                                    System.out.println("Producto comprado: Harina");           
                                }  
                                if(recorrido.getValor() == 5){
                                    System.out.println("Producto comprado: Lizano");
                                }
                      
            Lista += recorrido.getValor() + "\n";

            recorrido = recorrido.getAbajo();
            
        }
        JOptionPane.showMessageDialog(null, "Sus prouctos comprados con el ID son los siguientes:\n" + Lista);
        Lista = "";
    }

    public Nodo getTop() {
        return top;
    }

}
