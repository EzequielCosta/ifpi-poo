package banco;

public class Conta {

    private String numero;
    private double saldo;

    
    Conta(String numero, double valor) {
        this.numero = numero;
        this.saldo = valor;
    }

    void sacar(double valor) {
        if (valor <= this.getSaldo()){
            saldo = saldo - valor;
        }
        
    }

    void depositar(double valor) {
        if (valor > 0){
            saldo = saldo + valor;
        }
        
    }

    double consultarSaldo() {
        return saldo;
    }

    void transferir(Conta destino, double valor) {
        saldo = saldo - valor;
        destino.saldo = destino.saldo + valor;
        //this.sacar(valor);
        //destino.depositar(valor);
    }
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
