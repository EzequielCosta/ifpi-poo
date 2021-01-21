package empregado;


public class EmpregadaTeste {
    
    public static void main(String[] args) {
        Empregado empregado = new Empregado();
        Diarista diarista = new Diarista();
        Horista horista = new Horista();
        
        System.out.println("Salario Empregado: "+ empregado.calcularSalario());
        System.out.println("Salario Diarista: "+ diarista.calcularSalario());
        System.out.println("Salario Horista: "+ horista.calcularSalario());
        
    }
    
    
    
}
