
package atividade3;


public class Conta2 {
    
    String numero;
    private double saldo;

    Conta2(String numero, double valor) {
        this.numero = numero;
        this.saldo = valor;
    }

    boolean sacar(double valor) {
        double resultado = saldo - valor;
        if (resultado < 0){
            return false;
        }
        this.saldo = resultado;
        return true;
    }

    void depositar(double valor) {
        saldo = saldo + valor;
    }

    double consultarSaldo() {
        return saldo;
    }

    boolean transferir(Conta2 destino, double valor) {
        /* É mais seguro se ultilizar métodos pois lá você poderá 
        manipular os atributos de acordo com sua regra de negócio*/
        if (this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
        
    }

}
