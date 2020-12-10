
package atividade14;

public class TesteEquipamento {
    public static void main(String[] args) {
        
        Equipamento equipamento1 = new Equipamento();
        Equipamento equipamento2 = new Equipamento();
        
        // torna o atributo ligado do objeto esquipamento1 true
        equipamento1.liga();
        
        // torna o atributo ligado do objeto esquipamento2 false
        equipamento2.desliga();
        
        // inverte o estado dos equipamento
        
        equipamento1.inverte();
        equipamento2.inverte();
        
        // Testa se os equipamentos estão ligados
        
        if (equipamento1.estaLigado()){
            System.out.println("O equipamento1 está ligado");
        }else{
            System.out.println("O equipamento1 está desligado");
        }
        
        if (equipamento2.estaLigado()){
            System.out.println("O equipamento2 está ligado");
        }else{
            System.out.println("O equipamento2 está desligado");
        }
        
        
        
    }
}
