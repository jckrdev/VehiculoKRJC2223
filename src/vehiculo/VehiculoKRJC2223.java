
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class VehiculoKRJC2223 {
    
    /**
     * Nombre
     */
    private String nombre;
    
    /**
     * Precio
     */
    private double precio;
    
    /**
     * Precio con IVA
     */
    private double precioIVA;
    
    /**
     * Stock
     */
    private int stock;
    
    /**
     * Constructor sin argumentos
     */
    public VehiculoKRJC2223 ()
    {
    }
    
    /**
     * Constructor con argumentos
     * 
     * @param nom nombre del vehículo
     * @param precio el precio del vehículo
     * @param stock el stock del vehículo
     */
    public VehiculoKRJC2223 (String nom, double precio, int stock)
    {
        this.nombre =nom;
        this.precio=precio;
        this.stock=stock;
    }
    
    
    /**
     * Devuelve el nombre del vehículo
     * 
     * @return el nombre del vehículo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Configura el nombre del vehículo
     * 
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el precio del vehículo
     * 
     * @return el precio del vehículo
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Configura el precio del vehículo
     * 
     * @param precio el precio del vehículo
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Devuelve el precio con iva del vehículo
     * 
     * @return el precio con iva del vehículo
     */
    public double getPrecioIVA() {
        return precioIVA;
    }

    /**
     * Configura el precio con iva del vehículo
     * 
     * @param precioIVA el precio con iva
     */
    public void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }

    /**
     * Devuelve el stock
     * 
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * Configura el stok
     * 
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    
    /**
     * Asigna un nombre al vehículo
     * 
     * @param nom el nombre del vehículo
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    
    /**
     * Devuelve el nombre
     * 
     * @return el nombre del vehículo
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    
    /**
     * Devuelve el stock
     * 
     * @return el stock de vehiculos disponible en cada momento
     */
    public int obtenerStock ()
    {
        return getStock();
    }

    /** 
     * Método para comprar vehiculos. Modifica el stock.
     * Este método va a ser probado con Junit
     * 
     * @param cantidad numero de vehículos a comprar
     * @throws Exception si la cantidad a comprar es menor que cero
     */
    public void comprar(int cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de vehiculos");
        
        setStock(getStock() + cantidad);
    }

    /** 
     * Método para vender vehiculos. Modifica el stock.
     * 
     * @param cantidad numero de vehículos a vender
     * @throws Exception si la cantidad a vender es menor que cero o si no hay suficientes vehículos a vender
     */
    public void vender (int cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede vender una cantidad negativa de vehiculos");
        if (obtenerStock()< cantidad)
            throw new Exception ("No se hay suficientes vehiculos para vender");
        
        setStock(getStock() - cantidad);
    }
    
}  
   
    

