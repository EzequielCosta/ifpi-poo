package atividade3;

public class TestaConta {

    public static void main(String[] args) {
        
        Conta c1 = new Conta("1", 100); // 90
        Conta c2 = new Conta("2", 100); // 90 
        c1 = c2;
        
        c1.sacar(10);
        c1.transferir(c2, 50);

        System.out.println(c1.consultarSaldo());
        System.out.println(c2.consultarSaldo());
    }
    
    /*
    a) 
    Quando c1 = c2, o que o enderenço de memoria de c1 foi apontado para o mesmo
    endereço de c2, logo qualquer alteração feita em qualquer um dos dois resultará
    em uma alteração em ambos. No caso da transferência, uma vez que as duas variáveis 
    referenciam o mesmo objeto, ao retirar 50 e colocar 50, a tranferencia não fez nenhum efeito.
    
    b) Objetos sem referencias são excluídos da memória;
    */

}
