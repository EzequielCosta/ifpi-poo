package br.edu.ifpi.poo.banco.entidade;

public class Conta {

    private String numero;
    private double saldo;

    public Conta(String numero, double valor) {
        this.numero = numero;
        this.depositar(valor);

    }

    public void sacar(double valor) {
        
        this.validarValor(valor);
        if (saldo < valor) {
            throw new AplicacaoException("Saldo insuficiente.");
        }
        saldo = saldo - valor;
    }

    public void depositar(double valor) {
        this.validarValor(valor);
        saldo = saldo + valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void transferir(Conta destino, double valor) {
        //este método também será validado, visto que chama o método sacar.
        // Dessa forma este método ficou mais robusto, pois em menos linhas de código, foi
        //possível criar uma rotina de tranferência eficiente.
        
        this.sacar(valor);
        destino.depositar(valor);
    }

    public String getNumero() {
        return numero;
    }

    private void validarValor(double valor) {
        if (valor <= 0) {
            throw new AplicacaoException("Valor inválido.");
        }
    }

}
