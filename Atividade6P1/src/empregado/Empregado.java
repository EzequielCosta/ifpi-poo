
package empregado;


public class Empregado {
    
    private double salario = 500;  
    
    public double calcularSalario() {
        return this.getSalario();
    } 

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
