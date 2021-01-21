
package pessoa;


public class Professor extends Funcionario{
    
    private String titulacao;

    public Professor(String titulacao, int matricula, double salario, String nome, String sobrenome) {
        super(matricula, salario, nome, sobrenome);
        this.titulacao = titulacao;
    }
    
    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
    
    @Override
    public double getSalarioPrimeiraParcela(){
        return this.getSalario();
    }
    
    @Override
    public double getSalarioSegundaParcela(){
        return 0;
    }
    
    
    
}
