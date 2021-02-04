package figuras;


public class TesteFiguraGeometrica {
    public static void main(String[] args) {
        
        TrianguloInterface t = new TrianguloInterface(5, 7, 8, 4);
        QuadradoInterface q = new QuadradoInterface(5);
        System.out.println("Triañgulo");
        System.out.println("Area: " + t.area());
        System.out.println("Perimetro: " + t.perimetro());
        
        System.out.println("\nQuadrado");
        System.out.println("Area: " + q.area());
        System.out.println("Perimetro: " + q.perimetro());
    }
}
