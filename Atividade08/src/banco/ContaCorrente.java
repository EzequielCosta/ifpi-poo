package banco;


public class ContaCorrente extends Conta implements ITributavel{
    
    public ContaCorrente(String numero, double valor) {
        super(numero, valor);
    }
    
    public double calculoTributo(){
        return (this.getSaldo() * 0.10);
    }
    
}
