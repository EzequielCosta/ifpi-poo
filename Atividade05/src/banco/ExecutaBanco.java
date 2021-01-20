package banco;

import java.util.Scanner;

public class ExecutaBanco {
    public static void main(String[] args) {
        Banco b = new Banco();
        Scanner sc = new Scanner(System.in);
        String opcao = ""; 
        String numero;
        double saldo,valor;
        Conta c;
        do{
            System.out.print("1-Cadastrar\n2-Alterar\n3-Excluir"
                    + "\n4-Consultar\n5-Creditar\n6-Debitar\n7-Tranferir"
                    + "\n9-Sair\n\nEscolha a opção: ");
            
            opcao = sc.next();
            switch(opcao) {
                case "1":
                    System.out.println("Digite o número");
                    numero = sc.next();
                    System.out.println("Digite o saldo");
                    saldo = sc.nextDouble();
                    c = new Conta(numero,saldo);
                    b.inserir(c);
                    break;
                case "2":
                    System.out.print("Digite o número: ");
                    numero = sc.next();
                    Conta contaAntiga = b.consultar(numero);
                    if (!(contaAntiga == null)){
                        //System.out.print("Digite o novo número (Deixe vazio se deseja manter o atual): ");
                        //String numeroNovo = sc.next();
                        System.out.print("Digite o novo saldo: ");
                        double saldoNovo = sc.nextDouble();
                        Conta contaNova = new Conta(numero,saldoNovo);
                        b.alterar(contaNova);
                        System.out.println("Conta alterada\n");
                    }else{
                        System.out.print("Conta não existe\n");
                    }
                    break;
                case "3":
                    System.out.print("Digite o número: ");
                    numero = sc.next();
                    c = b.consultar(numero);
                    if (!(c == null)){
                        b.excluir(numero);
                        System.out.println("Conta excluída");
                    }else{
                        System.out.println("Conta não excluída");
                    }
                    break;
                case "4":
                    System.out.print("Digite o número: ");
                    numero = sc.next();
                    c = b.consultar(numero);
                    if (!(c == null)){
                        System.out.println("Número: " + c.getNumero());
                        System.out.println("Saldo: " + c.getSaldo());
                    }else{
                        System.out.println("Conta não existe");
                    }
                    break;
                case "5":
                    System.out.print("Digite o número: ");
                    numero = sc.next();
                    System.out.print("Digite o valor a ser creditado: ");
                    valor = sc.nextDouble();
                    c = b.consultar(numero);
                    if (!(c == null)){
                        c.depositar(valor);
                        System.out.println("Valor depositado na conta " + c.getNumero());
                    }else{
                        System.out.println("Conta não existe");
                    }
                    break;
                case "6":
                    System.out.print("Digite o número: ");
                    numero = sc.next();
                    System.out.print("Digite o valor a ser debitado: ");
                    valor = sc.nextDouble();
                    c = b.consultar(numero);
                    if (!(c == null)){
                        c.sacar(valor);
                        System.out.println("Valor debitado na conta " + c.getNumero());
                    }else{
                        System.out.println("Conta não existe");
                    }
                    break;
                case "7":
                    System.out.print("Digite o número da conta crédito: ");
                    numero = sc.next();
                    System.out.print("Digite o número da conta debito: ");
                    String numero2 = sc.next();
                    System.out.print("Digite o valor a ser transferido: ");
                    valor = sc.nextDouble();
                    b.transferir(numero, numero2, valor);
                    break;
                
            }
            
        }while (!opcao.equals("9"));
    }
}
