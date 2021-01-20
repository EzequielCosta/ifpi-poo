package imposto;


public class ContaImposto {
    private double saldo;
    private String numero;

    public ContaImposto(double saldo, String numero) {
        this.saldo = saldo;
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
     void sacar(double valor) {
        if (valor <= this.getSaldo()){
            valor -= retemImposto(valor);
            saldo = saldo - valor;
        }
        
    }

    void depositar(double valor) {
        if (valor > 0){
            
            saldo = saldo + valor;
        }
        
    }
    
    public double retemImposto(double  valorDebito){
        
        return (valorDebito * 0.0038);
    }
}
