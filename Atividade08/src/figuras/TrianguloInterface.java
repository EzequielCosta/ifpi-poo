package figuras;


public class TrianguloInterface implements IFiguraGeometrica{
    
    private double lado1;
    private double lado2;
    private double base;
    private double altura;

    public TrianguloInterface(double lado1, double lado2, double base, double altura) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
        this.altura = altura;
    }
    
    
    @Override
    public double perimetro(){
        return this.lado1 + this.lado2 + this.base;
    }
    
    @Override
    public double area(){
        return ((this.base * this.altura) / 2);
    }
    
    
}
