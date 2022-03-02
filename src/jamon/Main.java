/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jamon;

/**
 *
 * @author portatil_profesorado
 */
public class Main {
    /**
     * Método main
     * 
     * Este método es el principal de ejecución del programa
     * 
     */
    
    public static void main(String[] args) {
        JamónMoralesMunozJonathanJose2122 miJamonMoralesMunozJonathanJose2122;
        int stockActual;
        
        miJamonMoralesMunozJonathanJose2122 = new JamónMoralesMunozJonathanJose2122("5Jotas",580,100);
         vendeJamMoralesMunozJonathanJose2122(miJamonMoralesMunozJonathanJose2122, "Espa\u00f1a");
        
        compraJamMoralesMunozJonathanJose2122(miJamonMoralesMunozJonathanJose2122);
        stockActual = miJamonMoralesMunozJonathanJose2122.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }
    
    /**
     * Método compraJamMoralesMunozJonathanJose2122
     * 
     * En este método se realiza la acción de comprar 50 jamones
     * 
     * @param miJamonMoralesMunozJonathanJose2122 Objeto creado para realizar la compra
     * 
     */
    
    private static void compraJamMoralesMunozJonathanJose2122(JamónMoralesMunozJonathanJose2122 miJamonMoralesMunozJonathanJose2122) {
        try
        {
            System.out.println("Compra de Jamones");
            miJamonMoralesMunozJonathanJose2122.comprar(50);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar " + e);
        }
    }

    /**
     * Método vendeJamMoralesMunozJonathanJose2122
     * 
     * En este método se realiza la acción de vender 80 jamones
     * 
     * @param miJamonMoralesMunozJonathanJose2122 Objeto creado para realizar la venta
     * @param paisMoralesMunozJonathanJose2122 Pais en donde se realiza la venta
     * 
     */
    
    private static void  vendeJamMoralesMunozJonathanJose2122(JamónMoralesMunozJonathanJose2122 miJamonMoralesMunozJonathanJose2122, String paisMoralesMunozJonathanJose2122) {
        try
        {
            System.out.println("Venta de Jamones");
            miJamonMoralesMunozJonathanJose2122.vender(80);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender " + e);
        }
    }
}
