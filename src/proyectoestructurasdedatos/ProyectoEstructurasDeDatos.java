
package proyectoestructurasdedatos;

import javax.swing.JOptionPane;

public class ProyectoEstructurasDeDatos {

    public static void main(String[] args) {
        
        //Inicializando estructuras 
        Lista ListaClientes = new Lista();  
        Pila pilaP = new Pila();
        Cola ColaInventario = new Cola();
        NodoC elementoDevuelto = null;

        //Variable para pagos
        String metodoPago = "";
        
        //Variable de facturas
        int numeroFactura = 0;
        
        //Contadores de productos y precios
        int ContadorArroz = 0 ;
        int PrecioArroz = 3000 * ContadorArroz;

        int ContadorFrijoles = 0;
        int PrecioFrijoles = 2000 * ContadorFrijoles;

        int ContadorAtun = 0;
        int PrecioAtun = 1000 * ContadorAtun;

        int ContadorHarina = 0;
        int PrecioHarina = 3000 * ContadorHarina;

        int ContadorLizano = 0;
        int PrecioLizano = 1000 * ContadorLizano;
        
        int SumaTotal = 0;
        
        //Variable para guardar nombre del cliente
        String nombreCliente = "";
       

        //Menu del supermacado
        int seleccion;
	do {
        seleccion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                 *********Super mercado *******\n
                                                                 ********************************
                                                                 1.Iniciar sesion como generente.
                                                                 ********************************
                                                                 
                                                                 ********MENU DE COMPRAS*********
                                                                 ---------------------------------
                                                                 2.Agregar cliente 
                                                                 3.Agregar productos
                                                                 ---------------------------------
                                                                 4.selecionar metodo de pago.
                                                                 ---------------------------------
                                                                 5.Imprimir factura.
                                                                 ---------------------------------
                                                                 6.Salir\n
                                                                 Digite la opcion que desea ejecutar:"""));
 
			switch(seleccion) {
                            case 1:
                                String Usuario = "Gerente";
                                int Contraseña = 1234;
                                
                                Usuario = JOptionPane.showInputDialog("Digite su usuario:");
                                Contraseña = Integer.parseInt(JOptionPane.showInputDialog("Digite su contraseña:"));
                                
                                JOptionPane.showMessageDialog(null,"Ha iniciado sesión como Gerente");
                                
                                        int CantidadProducto1 = 0;
        
                    int seleccionGerente;
                    do {
                        seleccionGerente = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                 ***** Productos *******\n
                                                                 1.Agregar productos al inventario. 
                                                                 2.Ver facturas del dia.\n
                                                                        
                                                                 3.Salir y volver al menu de compra.

                                                                 Digite la opcion que desea comprar:"""));

                        if (seleccionGerente == 1) {

                            ColaInventario.encola(new NodoC(JOptionPane.showInputDialog("Digite el producto que quiere agregar:")));
                            CantidadProducto1 = Integer.parseInt(JOptionPane.showInputDialog("Digite las unidades que desea agregar"));
                            elementoDevuelto = ColaInventario.atiente();
                            System.out.println("El producto agregado fue: " + elementoDevuelto + " con " + CantidadProducto1 + " unidades.");

                        }
                        if (seleccionGerente == 2) {
                            System.out.println("Factura a nombre de:" + nombreCliente + "\n");
                            pilaP.MostrarValores();

                        }
                        if (seleccionGerente == 3) {
                            JOptionPane.showMessageDialog(null, "Ha salido del sistema de gerente.");
                            break;
                        }


                    } while (seleccionGerente != 3);

                                break;
                               
                                

                            case 2:
                                 nombreCliente = JOptionPane.showInputDialog("Digite su nombre para la facturacion:");
                                 ListaClientes.inserta(new Persona(1, nombreCliente));

                                break;
                                 
                                 
                            case 3:
                                int seleccionCompra;
                                do {
                                    seleccionCompra = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                 ***** Productos *******\n
                                                                 1.Arroz 1k || ₡3000. 
                                                                 2.Frijoles 1k || ₡2000.
                                                                 3.Atun || ₡1000.
                                                                 4.Harina 1k || ₡3000.
                                                                 5.Lizano 1k || ₡1000.\n
                                                                 
                                                                 6.Salir Y guardar su seleccion.                                                                  
                                                                                                   

                                                                 Digite la opcion que desea:"""));

                                    if (seleccionCompra == 1) {
                                        pilaP.push(new Nodo(1));
                                        ContadorArroz++;
                                        PrecioArroz = PrecioArroz + 3000;
                                        System.out.println("Agrego Arroz, ID:");
                                        
                                        

                                    }
                                    if (seleccionCompra == 2) {
                                        pilaP.push(new Nodo(2));
                                        ContadorFrijoles++;
                                        PrecioFrijoles = PrecioFrijoles + 3000;
                                        System.out.println("Agrego Frijoles, ID:");
                                        

                                    }
                                    if (seleccionCompra == 3) {
                                        pilaP.push(new Nodo(3));
                                        ContadorAtun++;
                                        PrecioAtun = PrecioAtun + 1000;
                                        System.out.println("Agrego Atun, ID:");
                                        

                                    }
                                    if (seleccionCompra == 4) {
                                        pilaP.push(new Nodo(4));
                                        ContadorHarina++;
                                        PrecioHarina = PrecioHarina + 3000;
                                        System.out.println("Agrego Harina, ID:");
                                        
                                        

                                    }
                                    if (seleccionCompra == 5) {
                                        pilaP.push(new Nodo(5));
                                        ContadorLizano++;
                                        PrecioLizano = PrecioLizano + 1000;
                                        System.out.println("Agrego Lizano, ID:");
                                        

                                    }
                                    if (seleccionCompra == 6) {
                                        break;
                                    }

                                    System.out.println(pilaP.getTop().getValor());

                                } while (seleccionCompra != 6);

    

                                break;

                            case 4:
                                metodoPago = JOptionPane.showInputDialog("Desea Pagar en tarjeta o efectivo: ");

                                break;

                            case 5:

                                SumaTotal = PrecioArroz + PrecioFrijoles + PrecioAtun + PrecioHarina + PrecioLizano;
                                JOptionPane.showMessageDialog(null, "Gracias por compras con nosotros." + "\n"
                                        + "Cliente: " + nombreCliente + "\n"
                                        + "Metodo de pago: " + metodoPago + "\n"
                                        + "Moton a pagar:\n" + SumaTotal);
                                
                                        pilaP.MostrarValores();

				break;
                            case 6:
                                JOptionPane.showMessageDialog(null, "Gracias por usar nuestro sistema.");
                                
                                break;
                                
				default:
                                    JOptionPane.showMessageDialog(null, "Ha digitado una opcion incorrecta.\n");
                                break;
			}
		} while(seleccion != 6);
	}
    
   
    
    public static void MenuGerente() {
        Cola ColaInventario = new Cola();
        NodoC elementoDevuelto = null;
        
        
        int CantidadProducto1 = 0;
        
        int seleccionGerente;
	do {
        seleccionGerente = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                 ***** Productos *******\n
                                                                 1.Agregar productos al inventario. 
                                                                 2.Ver facturas del dia.\n
                                                                        
                                                                 3.Salir y volver al menu de compra.

                                                                 Digite la opcion que desea comprar:"""));
 
                            
                                if(seleccionGerente == 1){
                                
                                ColaInventario.encola(new NodoC(JOptionPane.showInputDialog("Digite el producto que quiere agregar:")));
                                CantidadProducto1 = Integer.parseInt(JOptionPane.showInputDialog("Digite las unidades que desea agregar"));
                                elementoDevuelto = ColaInventario.atiente();
                                System.out.println("El producto agregado fue: " + elementoDevuelto + " con "+ CantidadProducto1 + " unidades.");

                                 }
                                if(seleccionGerente == 2){


                                 }
                                if(seleccionGerente == 3){
                                JOptionPane.showMessageDialog(null, "Ha salido del sistema de gerente.");
                                break;
                                 }
                                
//                          System.out.println(pilaP.getTop().getValor());
                        
            
        }while(seleccionGerente != 3);

    }
   
 }






    

