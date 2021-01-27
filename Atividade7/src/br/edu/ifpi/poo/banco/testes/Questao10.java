package br.edu.ifpi.poo.banco.testes;
import java.util.ArrayList;


public class Questao10 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        try {
            // Excecao 1
            //array.get(1);
            
            // Exceção 2
            array.add( 9 / 0);
            
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Indice fora do intervalo");
            
        }catch (ArithmeticException e) {
            System.out.println("Erro ao dividir");
        }finally{
            System.out.println("Sempre passo por aqui");
        }
        
        // Se IndexOutOfBoundsException e ArithmeticException ultilizassem herança
        // entre elas o código iria dar erro, pois iria acusar que a exceção já
        // existe
    }
}
