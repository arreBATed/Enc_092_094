package ej04_varias_operacion_con_parinst;

import entidades.DivisionNumero;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej04_Varias_Operacion_con_ParInst {
        
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        
        try {
                System.out.print("Ingrese un numero de 2 digitos: ");
                String cadena1 = leer.next();
                System.out.println();
                System.out.print("Ingrese otro numero de 2 digitos: ");
                String cadena2 = leer.next();
        
                int numero1 = Integer.parseInt(cadena1);
                int numero2 = Integer.parseInt(cadena2);
        
                if ((numero1 >= 10) && (numero1 <= 99) && (numero2 >= 10) && (numero2 <= 99))   {
                        DivisionNumero dN = new DivisionNumero(numero1,numero2);
                        dN.divisionNumeros();
                }   
                else    {
                System.out.println("Los numeros no cumplian con la condicion de dos digitos.");
                }
                
        } catch (NumberFormatException n)   {
            System.out.print("Error en la carga del dato, algun dato ingresado no es un numero ");
        } catch (InputMismatchException i)  {
            System.out.print("Error con la lectura de uno de los numeros.");
        }        
    }    
    
}
