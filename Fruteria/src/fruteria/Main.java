
package fruteria;

import javax.swing.JOptionPane;



public class Main {
    public static void main(String[] args) {
   char continuar;
   int menu; 
    Producto producto= new Producto();
  JOptionPane.showMessageDialog(null, "\tFruteria Maria La Del Barrio");
  do{
 menu=Integer.parseInt(JOptionPane.showInputDialog(null,"Precione 1 Para Iniciar El Programa"));
 switch (menu){
     case 1:
  JOptionPane.showMessageDialog(null,"Venta");
  producto.Imprimir();
         break; 
     default:  JOptionPane.showMessageDialog(null, "Error Intentelo Otra vez");           
  }          
continuar =JOptionPane.showInputDialog("¿Desea Correr El Programa De Nuevo? Presione s: ").charAt(0);

  } while(continuar=='s');
JOptionPane.showMessageDialog(null, "Cerrando....");
     
    }  
}