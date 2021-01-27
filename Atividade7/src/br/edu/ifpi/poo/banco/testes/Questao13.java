
package br.edu.ifpi.poo.banco.testes;


public class Questao13 {
    /*
        a) Usar booleanos para o tratamento de erros não é
        aconselhável, visto que fica limitado a somente dois valores.Assim também,
        usar print para alerta de uma erro não é correto, pois o programa pode
        ser rodado em outros dispositivos. E adicionar vários valores para representar
        tipos de erros pode confudir o programador
    
        b) Ela facilita a organização do código e elimina vários blocos de códigos
    
        c) Sim
    
        O QUE ANTES ERA:
    
        public void sacar(double valor) {

            if (valor <= 0) {
                 System.out.println("Valor Inválido");
            }else if (saldo < valor) {
                System.out.println("Saldo insuficiente.");
            }else{
                saldo = saldo - valor;
            }
            
        }
    
        VIROU: 
    
        public void sacar(double valor) {
        
            this.validarValor(valor);
            if (saldo < valor) {
                throw new AplicacaoException("Saldo insuficiente.");
            }
            saldo = saldo - valor;
        }
    
    
    */
}
