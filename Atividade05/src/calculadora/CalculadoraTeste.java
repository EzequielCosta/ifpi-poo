
package calculadora;

import java.util.Scanner;


public class CalculadoraTeste {
    public static void main(String[] args) {
        
        double num1,num2;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um numero 1: ");
        num1 = sc.nextDouble();
        System.out.print("\nDigite um numero 2: ");
        num2 = sc.nextDouble();
        Calculadora calculadora =  new Calculadora(num1, num2);
        
        System.out.println("Soma: " + calculadora.soma());
        System.out.println("Subtração: " + calculadora.subtrai());
        System.out.println("Multiplicação: " + calculadora.multiplica());
        System.out.println("Dividir: " + calculadora.divide());
        
        // Vai dar erro porque o atributo é privado
        //System.out.println(calculadora.num1);
    }
}
