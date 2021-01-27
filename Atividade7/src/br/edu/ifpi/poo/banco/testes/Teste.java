package br.edu.ifpi.poo.banco.testes;

import br.edu.ifpi.poo.banco.entidade.Conta;

public class Teste {

    public static void main(String args[]) {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            try {
                throw new RuntimeException();
            } catch (RuntimeException e2) {
                System.out.print("A");
            }
            System.out.print("B");
        }
        System.out.print("C");
    }
    /*O primeiro cacth contém um outro catch no qual ele entra e printa o A, 
    logo após é printado o B que está dentro do primeiro catch e depois o C 
    que está fora dos blocos try/catch */
}
