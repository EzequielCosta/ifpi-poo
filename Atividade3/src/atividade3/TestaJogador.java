package atividade3;


public class TestaJogador {
    
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador(10, 9, 50);
        Jogador jogador2 = new Jogador(20, 40, 90);
        
        jogador1.atacar(jogador2);
        
        System.out.println(jogador1.getPontosAtuais());
        System.out.println(jogador2.getPontosAtuais());
    }
    
}
