
package atividade3;


public class Hotel {

    int quantReservas;
    
    void adicionarReserva() {
        quantReservas++;
    }
    
}


/*

1° questao

Não vai dar erro pois o contrutor da classe já inicializa os tipos com valores padrões,
no caso de atributos int, o construtor inicializa com 0;


2° questão

Vai dar erro pois o contrutor padrão da classe não foi sobrescrito contendo 
parâmetros e nem atribuições;

*/