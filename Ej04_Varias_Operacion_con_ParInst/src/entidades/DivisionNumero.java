package entidades;

public class DivisionNumero {
    
    private int numero1;
    private int numero2;

    public DivisionNumero() {
    }

    public DivisionNumero(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void divisionNumeros()   {
        
        try {
            Integer resultado = numero1 / numero2;
            System.out.println("La division de "+numero1+" por "+numero2+" es "+resultado);
            
        } catch (ArithmeticException a)  {
            
            System.out.println("Error: division por cero");
            
        }
    }
    
    
}
