
package pessoa;


public class PessoaTeste {
    public static void main(String[] args) {
        Funcionario f = new Funcionario(1, 600, "Leocio", "Oliveira");
        System.out.println("Primeira Parcela: " + f.getSalarioPrimeiraParcela());
        System.out.println("Segunda Parcela: " + f.getSalarioSegundaParcela());
    }
}
