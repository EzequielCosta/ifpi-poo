package abstratas;

public class Diretor extends  Funcionario{

    public Diretor(double salario){
        this.salario = salario;
    }
    
    public double getBonificacao(){
        return this.salario * 1.2;
    }

    
	

}
