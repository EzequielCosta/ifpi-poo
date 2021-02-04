package figuras;


public class TesteCompare {
    
    public static void main(String[] args) {
        
        Triangulo t1 = new Triangulo(4, 3, 4, 3);
        Triangulo t2 = new Triangulo(4, 6, 3, 5);
        Triangulo t3 = new Triangulo(4, 3, 4, 3);
        
        Quadrado q1 = new Quadrado(4);
        Quadrado q2 = new Quadrado(6);
        
        System.out.println("As áreas são iguas?: " + t1.comparar(t3));
        System.out.println("As áreas são iguas?: " + t2.comparar(t3));
        System.out.println("As áreas são iguas?: " + q1.comparar(q2));
    }
}
