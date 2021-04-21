/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fechasistema;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Izanami
 */
public class Principal {
    
    
    public static void main(String[] args) {
   
 /**Objeto de la clase */
 Principal objetoPrincipal=new Principal();
   
 String fecha1 = "12/05/2013";  
 String fecha2 = "13/05/2013";  
 String fecha3 = "14/05/2013";  
   
 /**Obtenemos la fecha del sistema y la convertirmos al String
  *  con el formato en el que vamos a trabajar*/
 Date fechaActual = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
        String fechaSistema=formateador.format(fechaActual);
         
        /**Realizamos los llamados a los metodos de ejemplo*/
         
        System.out.println("\n********************************" +
          "****************************\n");
   
 String resultadoMenor=objetoPrincipal.compararFechasConDate(fecha1,fechaSistema);
 System.out.println(resultadoMenor+"\n");
   
 System.out.println("******************************" +
    "******************************\n");
   
 
 String resultadoIgual=objetoPrincipal.compararFechasConDate(fecha2,fechaSistema);
 System.out.println(resultadoIgual+"\n");
   
 System.out.println("******************************" +
    "******************************\n");
   
 String resultadoMayor=objetoPrincipal.compararFechasConDate(fecha3,fechaSistema);
 System.out.println(resultadoMayor+"\n");
  
 System.out.println("*****************************" +
    "*******************************\n");
 }
 
 /**
  * Comparamos las Fechas
  * @author CHENAO
  * @param fecha1
  * @param fechaActual
  * @return
  */
 private String compararFechasConDate(String fecha1, String fechaActual) {  
  System.out.println("Parametro String Fecha 1 = "+fecha1+"\n" +
    "Parametro String fechaActual = "+fechaActual+"\n");  
  String resultado="";
  try {
   /**Obtenemos las fechas enviadas en el formato a comparar*/
   SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy"); 
   Date fechaDate1 = formateador.parse(fecha1);
   Date fechaDate2 = formateador.parse(fechaActual);
    
   System.out.println("Parametro Date Fecha 1 = "+fechaDate1+"\n" +
     "Parametro Date fechaActual = "+fechaDate2+"\n");
    
    if ( fechaDate1.before(fechaDate2) ){
    resultado= "La Fecha 1 es menor ";
    }else{
     if ( fechaDate2.before(fechaDate1) ){
      resultado= "La Fecha 1 es Mayor ";
     }else{
      resultado= "Las Fechas Son iguales ";
     } 
    }
  } catch (ParseException e) {
   System.out.println("Se Produjo un Error!!!  "+e.getMessage());
  }  
  return resultado;
 }
    
    
}
