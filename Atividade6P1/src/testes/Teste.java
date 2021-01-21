
package testes;

import animal.*;
import calculadora.*;
import empregado.*;
import pessoa.*;

public class Teste {
    public static void main(String[] args) {
        Bovino bovino =  new Bovino();
        Peixe peixe =  new Peixe();
        Funcionario funcionario =  new Funcionario(1, 500, "Ezequiel", "Costa");
        Professor professor =  new Professor("Pedagogo",1, 500, "Ezequiel", "Costa");
        Calculadora calculadora = new Calculadora(3, 5);
        Diarista diarista = new Diarista();
        Horista horista = new Horista();
        
    }
    
   
}
