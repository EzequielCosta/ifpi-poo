/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade7;


public class TestaSaudacao {
    public static void main(String[] args) {
        
        Saudacao objeto = new Saudacao();
        
        objeto.texto = "Olá";
        objeto.destinatario = "Ezequiel";
        
        System.out.println(objeto.obterSaudacao());
    }
}
