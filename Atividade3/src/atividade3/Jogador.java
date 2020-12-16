
package atividade3;


public class Jogador {
    
    int forca;
    int nivel;
    private int pontosAtuais;

    public Jogador(int forca, int nivel, int pontosAtuais) {
        this.forca = forca;
        this.nivel = nivel;
        this.pontosAtuais = pontosAtuais;
    }
    
    public int calcularPontosAtaque (){
        return (this.forca * this.nivel);
        
    }
    public void atacar (Jogador jogador){
        jogador.setPontosAtuais(jogador.getPontosAtuais() - this.calcularPontosAtaque());
        
    }

    public int getPontosAtuais() {
        return pontosAtuais;
    }

    public void setPontosAtuais(int pontosAtuais) {
        this.pontosAtuais = pontosAtuais;
    }
    
    
    
}
