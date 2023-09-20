
package ej02_exception_array;


public class Ej02_Exception_Array {

    public static void main(String[] args) {
        
        int topeArreglo = 10;
        
        int[] arregloEnteros = new int[topeArreglo];
       
        
        try {
               for (int i = 0; i < topeArreglo; i++ )  {
                   arregloEnteros[i] = i++;
               }
               for (int i = 0; i <= topeArreglo; i++ )  {
                   System.out.print (arregloEnteros[i]+" - ");
               }
               
               
        } catch (ArrayIndexOutOfBoundsException a) {
                System.out.println();
                System.out.println("Error en el conteo de elementos del arreglo.");
        }
        
    }
    
}
