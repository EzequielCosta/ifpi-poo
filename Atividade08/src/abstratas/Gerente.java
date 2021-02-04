package abstratas;

public class Gerente extends Funcionario {

    private double porcentagemParticipacao;
    private double lucroEmpresa;

    public Gerente(double salario, double porcentagemParticipacao) {
        this.salario = salario;
        this.porcentagemParticipacao = porcentagemParticipacao;

    }

    @Override
    public double getBonificacao() {
        return (this.salario * 1.4 + 1000) + (this.porcentagemParticipacao * this.lucroEmpresa);
    }

}
