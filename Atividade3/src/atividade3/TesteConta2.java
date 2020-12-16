
package atividade3;


public class TesteConta2 {
    public static void main(String[] args) {
        
        Conta2 conta2 = new Conta2("123", 100);
        Conta2 conta3 = new Conta2("321", 150);
        
        System.out.println(conta2.sacar(120)); // irá retornar false, pois 120 é maior que 100
        
        System.out.println(conta2.transferir(conta3, 100)); // irá retorna false
        System.out.println(conta2.consultarSaldo());
        System.out.println(conta3.consultarSaldo());
        
        
    }
}
