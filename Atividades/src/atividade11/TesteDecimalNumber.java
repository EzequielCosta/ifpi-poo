
package atividade11;


public class TesteDecimalNumber {
    public static void main(String[] args) {
        
        DecimalNumber objeto = new DecimalNumber();
        objeto.numero = 1.63734494949;
        System.out.println("A parte inteira do numero é: " + objeto.exibeParteInteira());
        System.out.format("A parte decimal do numero com aproxiamação de 3 casas é: %.3f\n", objeto.exibeParteDecimal());
    }
}
