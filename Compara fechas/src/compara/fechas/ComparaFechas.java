/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compara.fechas;


import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
/**
 *
 * @author Izanami
 */
public class ComparaFechas {

    
    public static void main ( String args [] ) {
 
  System.out.println("Datos iniciales:");
  // Fecha / Hora
  String stFecha1 = "22/01/2011 14:36";  
  String stFecha2 = "22/01/2011 14:35";
  String stFecha3 = "22/02/2011 14:36";
   
  System.out.println("Fecha/Hora-1:"+stFecha1);
  System.out.println("Fecha/Hora-2:"+stFecha2);
  System.out.println("Fecha/Hora-3:"+stFecha3);
 
  System.out.println();
  System.out.println();
 
  // Utilizando Date y SimpleDateFormat
   
  System.out.println();
  System.out.println("Utilizando Date:");
  System.out.println();
   
  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm"); 
  
  // El método parse devuelve null si no se ha podido parsear el string en  según el formato indicado. Este método lanza una excepción NullPointer  exception si alguno de sus parámetros es null 
  Date fecha1 = sdf.parse(stFecha1 , new ParsePosition(0));
  
  // El método parse devuelve null si no se ha podido parsear el string en  según el formato indicado. Este método lanza una excepción NullPointer  exception si alguno de sus parámetros es null 
  Date fecha2 = sdf.parse(stFecha2 , new ParsePosition(0));
 
  // El método parse devuelve null si no se ha podido parsear el string en  según el formato indicado. Este método lanza una excepción NullPointer  exception si alguno de sus parámetros es null 
  Date fecha3 = sdf.parse(stFecha3 , new ParsePosition(0));
 
   
  // Comparaciones
   
  if ( fecha1.before(fecha2) ) System.out.println(" Fecha1 es anterior a fecha2.");
  else System.out.println(" Fecha1 NO es anterior a fecha2.");
  
  if ( fecha1.before(fecha3) ) System.out.println(" Fecha1 es anterior a fecha3.");
  else System.out.println(" Fecha1 NO es anterior a fecha3.");
   
  if ( fecha2.before(fecha3) ) System.out.println(" Fecha2 es anterior a fecha3.");
  else System.out.println(" Fecha2 NO es anterior a fecha3.");
   
   
   
  // Utilizando Calendar.
   
  System.out.println();
  System.out.println("Utilizando GregorianCalendar:");  
  System.out.println();
   
  // Con las mismas fechas, creamos los Calendar's
   
  Calendar cal1 = new GregorianCalendar();
  cal1.setTime(fecha1);
   
  Calendar cal2 = new GregorianCalendar();
  cal2.setTime(fecha2);
   
  Calendar cal3 = new GregorianCalendar();
  cal3.setTime(fecha3);
   
 
  // Comparaciones
   
  if ( cal1.before(cal2) ) System.out.println(" Cal1 es anterior a cal2.");
  else System.out.println(" Cal1 NO es anterior a cal2.");
  
  if ( cal1.before(cal3) ) System.out.println(" Cal1 es anterior a Cal3.");
  else System.out.println(" Cal1 NO es anterior a cal3.");
   
  if ( cal2.before(cal3) ) System.out.println(" Cal2 es anterior a Cal3.");
  else System.out.println(" Cal2 NO es anterior a cal3.");  
   
   
  // Tanto para Date como para Calendar/GregorianCalendar
  // podemos hacer una comparación "numérica", obteniendo
  // la representación de la fecha/hora en milisegundos.
  // Por convenio, esta cuenta se inicia en el 01/01/1970 a las 0:00:00 GMT
   
  System.out.println();
  System.out.println("En milisegundos:");  
  System.out.println();  
  System.out.println(" Milisegundos de fecha1:"+fecha1.getTime());
  System.out.println(" Milisegundos de fecha2:"+fecha2.getTime());
  System.out.println(" Milisegundos de fecha3:"+fecha3.getTime());
  System.out.println(" Milisegundos de cal1:  "+cal1.getTimeInMillis());
  System.out.println(" Milisegundos de cal2:  "+cal2.getTimeInMillis());
  System.out.println(" Milisegundos de cal3:  "+cal3.getTimeInMillis());
   
 }
    
    
    
}
