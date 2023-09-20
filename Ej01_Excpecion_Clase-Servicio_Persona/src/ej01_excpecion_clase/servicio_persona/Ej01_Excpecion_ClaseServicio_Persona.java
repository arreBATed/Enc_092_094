
package ej01_excpecion_clase.servicio_persona;

import entidades.Persona;
import servicios.PersonaServices;

public class Ej01_Excpecion_ClaseServicio_Persona {

    public static void main(String[] args) {
       
        Persona p = new Persona();
        
        PersonaServices pS = new PersonaServices();
        
        pS.esMayorEdad(p);
                
        //if (pS.esMayorEdad(p)) {
        //    System.out.println("La persona es mayor de edad.");
        //}
        //else    {
        //    System.out.println("La persona es mayor de edad.");
        //}   
    }
    
}
