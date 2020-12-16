
package atividade3;


public class TestaRadio {
    public static void main(String[] args) {
        
        /* Radio r = new Radio(); irá dar erro pois o construtor foi
        sobrescrito agora com um argumento. Dessa forma, é obrigatório adicionar
        um argumento ao construtor;
        */
        Radio r = new Radio(3);
        r.volume = 10;
    }
}
