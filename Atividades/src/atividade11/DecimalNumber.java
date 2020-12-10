
package atividade11;


public class DecimalNumber {
    double numero;
    
    public int exibeParteInteira(){
        return ((int) numero);
    }
    
    public double exibeParteDecimal(){
        return numero - this.exibeParteInteira();
    }
}
