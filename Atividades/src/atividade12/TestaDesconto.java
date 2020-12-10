
package atividade12;


public class TestaDesconto {
    public static void main(String[] args) {
        Desconto objeto = new Desconto();
        
        objeto.valorConta = 3700;
        objeto.desconto = 10;
        
        System.out.println("O valor com desconto é: " + objeto.calcula());
    }
}
