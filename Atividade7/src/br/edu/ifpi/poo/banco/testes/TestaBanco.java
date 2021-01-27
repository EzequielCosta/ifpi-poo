package br.edu.ifpi.poo.banco.testes;

import br.edu.ifpi.poo.banco.cadastros.Banco;
import br.edu.ifpi.poo.banco.entidade.AplicacaoException;
import br.edu.ifpi.poo.banco.entidade.Conta;
import br.edu.ifpi.poo.banco.entidade.ContaImposto;
import br.edu.ifpi.poo.banco.entidade.Poupanca;

public class TestaBanco {

    public static void main(String[] args) {
        Conta c = new Conta("1", 100);
        Banco b = new Banco();
        b.inserir(c);
        
        /*
        try {
            c.sacar(10);
            c.sacar(1000);
            System.out.println("Esse código não executa.");
        } catch (AplicacaoException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
        System.out.println("Programa finalizado com sucesso");
        
        */
        
        // Testar método consultar da classe Banco
        /*
        try {
            Conta contaProcurada = b.consultar("3");
            System.out.println("Saldo conta achada: " + contaProcurada.getSaldo());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        */
        
        // Testar método alterar da classe Banco
        
        /*
        try {
            Conta conta = new Conta("7",400);
            b.alterar(conta);
            Conta novaConta = b.consultar("1");
            System.out.println("Saldo conta: " + novaConta.getSaldo());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        */
        
        // Testar método creditar da classe Banco
        
        /*
        try {
            b.creditar("6", 60);
            System.out.println("Saldo conta: " + c.getSaldo());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        */
        
        // Testar método depositar da classe Banco
        /*
        try {
            b.debitar("6", 60);
            System.out.println("Saldo conta: " + c.getSaldo());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        */
        
        // Testar método transferir da classe Banco
        /*
        try {
            Conta c2 = new Conta("2", 600);
            b.inserir(c2);
            b.transferir("1", "2", 50);
            System.out.println("Saldo conta que recebeu: " + c2.getSaldo());
            System.out.println("Saldo conta que transferiu: " + c.getSaldo());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        */
        
        // Testar método renderJuros da classe Banco
        /*
        try {
            Poupanca p = new Poupanca("4", 100,0.5);
            b.inserir(p);
            b.renderJuros("4");
            //Para entrar na poupança : b.renderJuros("1");
            System.out.println("Saldo conta: " + p.getSaldo());
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        */
        
        
        // Testar método inserir da classe Banco
        
        /*
        try {
            Conta c2 = new Conta("2", 600);
            b.inserir(c2);
            System.out.println("Inserido com sucesso");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        */
        /*
         // Testar método inserir da classe Banco
        
        try {
            Conta c2 = new Conta("2", -100);
            b.inserir(c2);
            System.out.println("Inserido com sucesso");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        */
        
         // Testar método sacar da classe Banco

        try {
            c.sacar(4);
            System.out.println("Sacado com sucesso");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
        
        
    }
}
