
package empregado;


public class Diarista extends Empregado{
    
    public double calcularSalario() {
        return (super.calcularSalario() / 30);
    } 
    
}
