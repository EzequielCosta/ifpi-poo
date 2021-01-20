
package imposto;

import java.util.Scanner;


public class ContaImpostoTeste {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero da conta: ");
        String numero = sc.next();
        System.out.print("Digite o saldo da conta: ");
        double saldo = sc.nextDouble();
        ContaImposto contaImposto = new ContaImposto(saldo, numero);
        
        System.out.println("Saldo: " + contaImposto.getSaldo());
        contaImposto.depositar(500);
        System.out.println("Após creditar: " + contaImposto.getSaldo());
        contaImposto.sacar(100);
        System.out.println("Após sacar: " + contaImposto.getSaldo());
        
        
    }
    
}
