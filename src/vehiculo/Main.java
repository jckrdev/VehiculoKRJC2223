
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        VehiculoKRJC2223 miVehiculoKRJC2223;
        int stockActual;
        
        miVehiculoKRJC2223 = new VehiculoKRJC2223("Seat",18000,100);
        operativaVehiculosKRJC2223(miVehiculoKRJC2223, 50); 
        stockActual = miVehiculoKRJC2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    /**
     * @param miVehiculoKRJC2223
     * @param cantidad 
     */
    private static void operativaVehiculosKRJC2223(VehiculoKRJC2223 miVehiculoKRJC2223, int cantidad) {
        
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoKRJC2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoKRJC2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
    }

}
    
