
package animal;

import java.util.ArrayList;


public class AnimalTeste {
    public static void main(String[] args) {
        
        ArrayList<Animal> animais = new ArrayList<Animal>();
        
        // Animal não possue producao de leite
        //Animal a = new Bovino();
        //a.setProducaoLeite(5);
        
        // Para isso deveria ser atribuido o tipo Bovino
        Bovino a = new Bovino();
        a.setProducaoLeite(5);
        
        // Peixe é um tipo de Animal,porém a recíproca não é verdadeira
        // por isso Peixe não pode ser atribuido à Animal
        //Peixe p = new Animal();
        
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        
        Bovino bovino1 = new Bovino();
        Bovino bovino2 = new Bovino();
        Bovino bovino3 = new Bovino();
        
        Peixe peixe1 = new Peixe();
        Peixe peixe2 = new Peixe();
        
        animais.add(animal1);
        animais.add(animal2);
        animais.add(bovino1);
        animais.add(bovino2);
        animais.add(bovino3);
        animais.add(peixe1);
        animais.add(peixe2);
        
        // Peixe e Animal também são do tipo Animal
        
        for (Animal animal : animais){
            if (animal instanceof Animal){
                System.out.println("Animal");
            }
            if (animal instanceof Bovino){
                System.out.println("Bovino");
            }
            if (animal instanceof Peixe){
                System.out.println("Peixe");
            }
            System.out.println("\n");
        }
        
        
        
    }
}
