
/**
 * @author FERCHUS
 *
 */

import java.util.Arrays;
import java.util.Collections;

public class Greedy {

	 /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] moneda = {10, 5, 100, 25, 1};
        Arrays.sort(moneda, Collections.reverseOrder());
        
        //Quiero 23456 en monedas
        Integer saldo = 289;
        Integer [] cambio = Greedy.calcula(saldo, moneda);
        
        System.out.println("Vuelto: "+saldo);
        
        for(int i = 0; i < cambio.length; i++)
            System.out.println(moneda[i]+" = "+cambio[i]+" unidad(es)");
    }

    public static Integer[] calcula(int monto, Integer[] valor) {
        Integer[] moneda = new Integer[valor.length];
        
        for (int i = 0; i < moneda.length; i++){
        	moneda[i] = 0;
        }
        
        for (int i = 0; i < valor.length; i++) {
            while (valor[i] <= monto) {
                moneda[i]++;
                monto = monto - valor[i];
            }
        }
        return moneda;
    }
	
}
