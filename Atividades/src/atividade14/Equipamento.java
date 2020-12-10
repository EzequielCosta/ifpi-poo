
package atividade14;


public class Equipamento {
    boolean ligado;
    
    public void liga(){
        if(!estaLigado()){
            ligado = true;
        }
    }
    public void desliga(){
        if(estaLigado()){
            ligado = false;
        }   
    }
    
    public boolean inverte(){
        return ligado = !(ligado);
    }
    
    public boolean estaLigado(){
        return ligado;
    }
}

