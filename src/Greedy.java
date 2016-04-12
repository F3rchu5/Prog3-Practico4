
/**
 * @author FERCHUS
 *
 */
public class Greedy {

	 /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] moneda = {100, 25, 10, 5, 1};
        
        //Quiero 23456 en monedas
        int saldo = 289;
        int [] cambio = Greedy.calcula(saldo, moneda);
        
        System.out.println("Vuelto: "+saldo);
        
        for(int i = 0; i < cambio.length; i++)
            System.out.println(moneda[i]+" = "+cambio[i]+" unidad(es)");
    }

    public static int[] calcula(int monto, int[] valor) {
        int[] moneda = new int[valor.length];
        for (int i = 0; i < valor.length; i++) {
            while (valor[i] <= monto) {
                moneda[i]++;
                monto = monto - valor[i];
            }
        }
        return moneda;
    }
	
}
