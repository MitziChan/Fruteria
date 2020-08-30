
package fruteria;
import javax.swing.JOptionPane;
public class Producto {
public void Imprimir (){
 int precio,precio2;
 int i=0;
 int suma=0; 
 int cambio;
 int resta, resultado;
 //----------------------------------------------------------------------------------//
precio=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite El Numero De Articulos Que Lleva El Cliente")); 
do{
precio2=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite El Precio De Cada Articulo"));   
 if(precio2>0){
  suma=suma+precio2;       
 }      
 i++;   
}while(precio!=i);    
 JOptionPane.showMessageDialog(null,"El Total Es: "+suma);   
 //-------------------------------------------------------------------------------//
 //Cambio
cambio=Integer.parseInt(JOptionPane.showInputDialog(null,"¿Desea Cambio? Precione 1- Para Si, 2-Para Finalizar La Compra")); 
if (cambio==1){
resta=Integer.parseInt(JOptionPane.showInputDialog(null,"¿Digite La Cantidad Que Le Dio El Cliente"));     
//calculando...
resultado=resta-suma;
 JOptionPane.showMessageDialog(null,"Cambio: "+resultado);
    
} else if(cambio==2){
 JOptionPane.showMessageDialog(null,"Gracias Por La Compra");    
    
}   
}    
}