package banco;

import java.util.ArrayList;

public class AuditoriaInterna {

    private ArrayList<ITributavel> tributavels;

    public AuditoriaInterna() {
        tributavels = new ArrayList<ITributavel>();
    }

    public void inserir(ITributavel tributavel) {
        tributavels.add(tributavel);
    }
    
    public double calculaTributos(){
        double soma = 0;
        for (ITributavel t : tributavels){
            soma += t.calculoTributo();
        }
        return soma;
    
    }

}
