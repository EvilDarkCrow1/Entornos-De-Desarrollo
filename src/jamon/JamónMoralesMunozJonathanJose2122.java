/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jamon;

/**
 *
 * @author portatil_profesorado
 */
public class JamónMoralesMunozJonathanJose2122 {

    /**
     * Método getCategoria
     * En este método se realiza la acción de obtener la categoría del objeto
     * @return categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Método setCategoria
     * En este método se realiza la acción de establecer una categoría al objeto
     * @param categoria categoria a establecer
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Método getPrecio
     * En este método se realiza la acción de obtener el precio del objeto
     * @return precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Método setPrecio
     * En este método se realiza la acción de establecer un precio al objeto
     * @param precio precio a establecer
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Método getMesesCuracion
     * En este método se realiza la acción de obtener los meses de curacion
     * @return mesesCuracion
     */
    public int getMesesCuracion() {
        return mesesCuracion;
    }

    /**
     * Método setMesesCuracion
     * En este método se realiza la acción de establecer meses de curacion a un objeto
     * @param mesesCuracion meses de curacion a establecer
     */
    public void setMesesCuracion(int mesesCuracion) {
        this.mesesCuracion = mesesCuracion;
    }

    /**
     * Método getStock
     * En este método se realiza la acción de establecer un stock a un objeto
     * @return stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * Método setStock
     * En este método se realiza la acción de establecer una categoría al objeto
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    private String categoria;
    private double precio;
    private int mesesCuracion;
    private int stock;

    /**
     * Constructor sin parametros
     * 
     * Parametros por omisión
     */
    
    /* Constructor sin argumentos */
    public JamónMoralesMunozJonathanJose2122 ()
    {
    }
    
    /**
     * Constructor de 3 parámetros
     * 
     * 
     * 
     * @param cat categoria inicial del jamón
     * @param precio precio inicial del jamón
     * @param stock stock inicial del jamón
     */
    
    // Constructor con parámetro para iniciar todas las propiedades de la clase
    // jamon
    
    public JamónMoralesMunozJonathanJose2122 (String cat, double precio, int stock)
    {
        this.categoria =cat;
        this.precio=precio;
        this.stock=stock;
    }
    
    /**
     * Método asignarCategoria
     * 
     * Asigna una categoria a un objeto usando el metodo setcategoria
     * 
     * @param cat categoria para asignar al objeto
     */
    
   // Método para asignar la categoría del jamón
    public void asignarCategoria(String cat)
    {
        setCategoria(cat);
    }
    
    /**
     * Método obtenerCategoria
     * 
     * Con este método se obtiene la categoría de un objeto usando el método getCategoria
     * 
     * @return categoria
     */
    
    // Método que me devuelve la categoría del jamón
    public String obtenerCategoria()
    {
        return getCategoria();
    }

    /**
     * Método obtenerStock
     * 
     * Con este método se obtiene el stock de un objeto mediante el método getStock
     * 
     * @return stock
     */
    
    // Método que me devuelve el stock de jamones disponible en cada momento
     public int obtenerStock ()
    {
        return getStock();
    }

    /* Método para comprar coches. Modifica el stock.
     * Este método va a ser probado con Junit
     */
    public void comprar(int cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de jamones");
        setStock(getStock() + cantidad);
    }

    public void vender (int cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede vender una cantidad negativa de jamones");
        if (obtenerStock()< cantidad)
            throw new Exception ("No  hay suficientes jamones para vender");
        setStock(getStock() - cantidad);
    }
}
