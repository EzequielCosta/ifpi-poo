package atividade13;


public class NumberUtils {
    int numero;
    
    public boolean isPair(){
        return numero % 2 == 0;
    }
    
    public boolean isPrime(){
        int raizDeNumero = (int) Math.sqrt(numero);
        for(int i = 2; i <= (raizDeNumero + 1); i++ ){
            if (numero % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public String printCount(){
        String contagem = "";
        
        for (int i = 0; i <= numero; i++){
            contagem += i + ",";
        }
        return contagem.substring(0, contagem.length()-1);
    }
    
    public String printReverseCount(){
        String contagem = "";
        
        for (int i = numero; i >= 0; i--){
            contagem += i + ",";
        }
        return contagem.substring(0, contagem.length()-1);
    }
    
}
