/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package restfecha;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Izanami
 */
public class RestaFechas {
    
    public void restar_fecha() {

        //String fechaInicio = "29/05/1985";
         String fechaInicio = "13/09/1991";
//        String fechaActual = "09/04/2015";
        
         String fechaActual = " ";
        
        Date date = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        fechaActual = df.format(date);
        
        
        
        /**
         * Obtenemos la fecha del sistema y la convertirmos al String con el
         * formato en el que vamos a trabajar
         */
        Date fechaActual1 = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
        String fechaSistema = formateador.format(fechaActual1);
        System.out.println("La fechaSistema es //////// " + fechaSistema);
        System.out.println("-------------------------------------------------"); 
        System.out.println("La fecha de inicio es " + fechaInicio);
        String[] aFechaIng = fechaInicio.split("/");
        Integer diaInicio = Integer.parseInt(aFechaIng[0]);
        Integer mesInicio = Integer.parseInt(aFechaIng[1]);
        Integer anioInicio = Integer.parseInt(aFechaIng[2]);
        
        System.out.println("fechaInicio  diaInicio " + diaInicio);
        System.out.println("fechaInicio mesInicio " + mesInicio);
        System.out.println("fechaInicio diaInicio " + diaInicio);
        System.out.println("-------------------------------------------------");                
        System.out.println("La fecha actual es " + fechaActual);
        String[] aFecha = fechaActual.split("/");
        Integer diaActual = Integer.parseInt(aFecha[0]);
        Integer mesActual = Integer.parseInt(aFecha[1]);
        Integer anioActual = Integer.parseInt(aFecha[2]);

        System.out.println("fechaActual diaActual " + diaActual);
        System.out.println("fechaActual mesActual " + mesActual);
        System.out.println("fechaActual anioActual " + anioActual);
        System.out.println("-------------------------------------------------");   
        
        int b = 0;
        int dias = 0;
        int mes = 0;
        int anios = 0;
        int meses = 0;
        mes = mesInicio - 1;
        
        
        
//        Para saber si un aÃ±o es bisiesto se puede aplicar una simple formula,
//        la cual dice que un aÃ±o es bisiesto si es divisible por cuatro, 
//        excepto los principios de aÃ±o (los divisibles por 100), 
//        que para ser bisiestos deben de ser divisibles tambiÃ©n por 400.
        
        if (mes == 2) {
            if ((anioActual % 4 == 0) && ((anioActual % 100 != 0) || (anioActual % 400 == 0))) {
                b = 29;
                System.out.println("El aÃ±o es bisiesto");
            } else {
                b = 28;
                System.out.println("El aÃ±o no es bisiesto");
            }
        } else if (mes <= 7) {
            if (mes == 0) {
                b = 31;
            } else if (mes % 2 == 0) {
                b = 30;
            } else {
                b = 31;
            }
        } else if (mes > 7) {
            if (mes % 2 == 0) {
                b = 31;
            } else {
                b = 30;
            }
        }
        if ((anioInicio > anioActual) || (anioInicio == anioActual && mesInicio > mesActual)
                || (anioInicio == anioActual && mesInicio == mesActual && diaInicio > diaActual)) {
            System.out.println("La fecha de inicio debe ser anterior a la fecha Actual");
        } else {
            if (mesInicio <= mesActual) {
                anios = anioActual - anioInicio;
                if (diaInicio <= diaActual) {
                    meses = mesActual - mesInicio;
                    dias = b - (diaInicio - diaActual);
                } else {
                    if (mesActual == mesInicio) {
                        anios = anios - 1;
                    }
                    meses = (mesActual - mesInicio - 1 + 12) % 12;
                    dias = b - (diaInicio - diaActual);
                }
            } else {
                anios = anioActual - anioInicio - 1;
//                System.out.println(anios);
                if (diaInicio > diaActual) {
                    meses = mesActual - mesInicio - 1 + 12;
                    dias = b - (diaInicio - diaActual);
                } else {
                    meses = mesActual - mesInicio + 12;
                    dias = diaActual - diaInicio;
                }
            }
        }

        System.out.println("AÃ±os: " + anios);
        System.out.println("Meses: " + meses);
        System.out.println("DÃ­as: " + dias);

    }

    public static void main(String[] args) {
        new RestaFechas().restar_fecha();
    }
    
}
