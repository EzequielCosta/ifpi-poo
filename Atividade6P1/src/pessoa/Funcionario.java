
package pessoa;


public class Funcionario extends Pessoa{
    
    private int matricula;
    private double salario;

    public Funcionario(int matricula, double salario, String nome, String sobrenome) {
        super(nome, sobrenome);
        this.matricula = matricula;
        if (validarSalario(salario)){
            this.salario = salario;
        }else{
            this.salario = 0;
        }
    }
    
    
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double getSalarioPrimeiraParcela(){
        return 0.6 * this.getSalario();
    }
    
    public double getSalarioSegundaParcela(){
        return 0.4 * this.getSalario();
    }
    
    private boolean validarSalario(double valor){
        return valor > 0;
    }
    
}
