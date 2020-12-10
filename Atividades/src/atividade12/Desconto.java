package atividade12;


public class Desconto {
    
    double valorConta;
    double desconto;
    
    public double calcula(){
        return valorConta * (1 - (desconto / 100));
    }
}
