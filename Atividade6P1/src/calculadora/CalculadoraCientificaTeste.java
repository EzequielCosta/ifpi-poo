
package calculadora;


public class CalculadoraCientificaTeste {
    
    public static void main(String[] args) {
        CalculadoraCientifica cc = new CalculadoraCientifica(8, 5);
        
        System.out.println("Não Arrendondado: "+cc.divide(false));
        System.out.println("Arredondado: " +cc.divide(true));
        System.out.println("Exponencial: " +cc.exponenciar(6, 2));
    }
    
}
