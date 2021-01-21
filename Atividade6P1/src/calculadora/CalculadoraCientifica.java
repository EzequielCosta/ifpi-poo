package calculadora;


public class CalculadoraCientifica extends Calculadora{
    
    public CalculadoraCientifica(double num1, double num2) {
        super(num1, num2);
    }
    
    public double exponenciar(double base, double expoente){
        return Math.pow(base,expoente);
    }
    
//    @Override
//    public double divide(){
//        return (this.getNum1() / this.getNum2());
//    }
    
    public double divide(boolean arredondar){
        if (arredondar){
            return (Math.ceil(super.divide()));
        }
        return super.divide();
        
    }
    
    
    
}
