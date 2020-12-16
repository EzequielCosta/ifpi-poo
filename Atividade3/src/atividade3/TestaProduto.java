/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade3;

/**
 *
 * @author ezequ
 */
public class TestaProduto {
    
    public static void main(String[] args) {
        Produto produto1 = new Produto("123", "Arroz", 150,10 ,5);
        Produto produto2 = new Produto("123", "Feijao", 220,20 ,6);
        
        System.out.println(produto1.baixarQuantidade(3)); // Irá dimunir
        System.out.println(produto1.baixarQuantidade(6)); // Não irá dimunir, pois o minimo é 5
        System.out.println(produto1.getQuantidade());
        System.out.println(produto1); // chamando o toString
        
        if (produto1.equals(produto2)){
            System.out.println("É igual");
        }else{
            System.out.println("Não é igual");
        }
    }
    
    
    
}
