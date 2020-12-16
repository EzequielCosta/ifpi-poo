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
public class TestaHotel {
    
    public static void main(String[] args) {
        
        Hotel hotel1 = new Hotel();
        hotel1.adicionarReserva();
        System.out.println(hotel1.quantReservas);
    }
    
}
