
package meses.de.año;


public class MesesDeAño {

    
    public static void main(String[] args) {
        String [] Mes = new String [12];
        
        Mes[0]="Enero";
        Mes[1]="Febrero";
        Mes[2]="Marzo";
        Mes[3]="Abril";
        Mes[4]="Mayo";
        Mes[5]="Junio";
        Mes[6]="Julio";
        Mes[7]="agosto";
        Mes[8]="Septiembre";
        Mes[9]="Octubre";
        Mes[10]="Noviembre";
        Mes[11]="Diciembre";
        
        for (String Me : Mes) {
            System.out.println("mes: " + Me);
        }
    }
    
}
